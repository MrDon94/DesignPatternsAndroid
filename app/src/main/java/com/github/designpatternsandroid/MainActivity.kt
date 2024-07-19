package com.github.designpatternsandroid

import SampleData
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.designpatternsandroid.model.PatternInfo
import com.github.designpatternsandroid.ui.theme.DesignPatternsAndroidTheme


/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/18 17:16
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignPatternsAndroidTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MainApp()
                }
            }
        }
    }

    @Composable
    private fun Title(title: String) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(16.dp, 10.dp)
        )
    }

    @Composable
    private fun SubTitle(subTitle: String) {
        Text(
            text = subTitle,
            style = MaterialTheme.typography.titleSmall,
            modifier = Modifier.padding(26.dp, 10.dp)
        )
    }

    @Composable
    private fun DesignPattern(info: PatternInfo) {
        Row(modifier = Modifier.padding(36.dp, 10.dp).clickable {

        }) {
            Text(
                text = info.name,
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier.weight(1f)
            )
            Icon(imageVector = Icons.Filled.KeyboardArrowRight, contentDescription = "arrow")
        }

    }

    @Composable
    private fun DesignPatternList(list: List<PatternInfo>){
        Column {
            list.forEach { item ->
                DesignPattern(item)
            }
        }
    }

    @Composable
    private fun MainApp(modifier: Modifier = Modifier){
        Column(modifier.verticalScroll(rememberScrollState())) {
            Title(title = "创建型")
            SubTitle(subTitle = "常用")
            DesignPatternList(SampleData.patternSample.filter { it.type == 1 && it.commonlyUsed })
            SubTitle(subTitle = "不常用")
            DesignPatternList(SampleData.patternSample.filter { it.type == 1 && !it.commonlyUsed })

            Title(title = "结构型")
            SubTitle(subTitle = "常用")
            DesignPatternList(SampleData.patternSample.filter { it.type == 2 && it.commonlyUsed })
            SubTitle(subTitle = "不常用")
            DesignPatternList(SampleData.patternSample.filter { it.type == 2 && !it.commonlyUsed })

            Title(title = "行为型")
            SubTitle(subTitle = "常用")
            DesignPatternList(SampleData.patternSample.filter { it.type == 3 && it.commonlyUsed })
            SubTitle(subTitle = "不常用")
            DesignPatternList(SampleData.patternSample.filter { it.type == 3 && !it.commonlyUsed })
        }
    }

    @Preview
    @Composable
    private fun MainAppPreview(){
        DesignPatternsAndroidTheme {
            Surface(modifier = Modifier.fillMaxSize()) {
                MainApp()
            }
        }
    }
}