import com.github.designpatternsandroid.Message
import com.github.designpatternsandroid.model.PatternInfo

/**
 * SampleData for Jetpack Compose Tutorial 
 */
object SampleData {
    //样本模式数据
    val patternSample = listOf(
        PatternInfo("单例模式", true, 1),
        PatternInfo("工厂模式", true, 1),
        PatternInfo("建造者模式", true, 1),
        PatternInfo("原型模式", false, 1),
        PatternInfo("代理模式", true, 2),
        PatternInfo("桥接模式", true, 2),
        PatternInfo("装饰者模式", true, 2),
        PatternInfo("适配器模式", true, 2),
        PatternInfo("门面模式", false, 2),
        PatternInfo("组合模式", false, 2),
        PatternInfo("享元模式", false, 2),
        PatternInfo("观察者模式", true, 3),
        PatternInfo("模板模式", true, 3),
        PatternInfo("策略模式", true, 3),
        PatternInfo("职责链模式", true, 3),
        PatternInfo("迭代器模式", true, 3),
        PatternInfo("状态模式", true, 3),
        PatternInfo("访问者模式", false, 3),
        PatternInfo("备忘录模式", false, 3),
        PatternInfo("命令模式", false, 3),
        PatternInfo("解释器模式", false, 3),
        PatternInfo("中介模式", false, 3),
    )
    // Sample conversation data
    val conversationSample = listOf(
        Message(
            "Lexi",
            "Test...Test...Test..."
        ),
        Message(
            "Lexi",
            """List of Android versions:
            |Android KitKat (API 19)
            |Android Lollipop (API 21)
            |Android Marshmallow (API 23)
            |Android Nougat (API 24)
            |Android Oreo (API 26)
            |Android Pie (API 28)
            |Android 10 (API 29)
            |Android 11 (API 30)
            |Android 12 (API 31)""".trim()
        ),
        Message(
            "Lexi",
            """I think Kotlin is my favorite programming language.
            |It's so much fun!""".trim()
        ),
        Message(
            "Lexi",
            "Searching for alternatives to XML layouts..."
        ),
        Message(
            "Lexi",
            """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""".trim()
        ),
        Message(
            "Lexi",
            "It's available from API 21+ :)"
        ),
        Message(
            "Lexi",
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
        ),
        Message(
            "Lexi",
            "Android Studio next version's name is Arctic Fox"
        ),
        Message(
            "Lexi",
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
        ),
        Message(
            "Lexi",
            "I didn't know you can now run the emulator directly from Android Studio"
        ),
        Message(
            "Lexi",
            "Compose Previews are great to check quickly how a composable layout looks like"
        ),
        Message(
            "Lexi",
            "Previews are also interactive after enabling the experimental setting"
        ),
        Message(
            "Lexi",
            "Have you tried writing build.gradle with KTS?"
        ),
    )
}
