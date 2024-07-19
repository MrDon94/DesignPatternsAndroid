package com.github.designpatternsandroid.model

/**
 * 设计模式信息
 */
data class PatternInfo(
    val name: String, //模式名称
    val commonlyUsed: Boolean,//是否常用
    val type: Int,//模式类型：1创建型 2结构型 3行为型
)
