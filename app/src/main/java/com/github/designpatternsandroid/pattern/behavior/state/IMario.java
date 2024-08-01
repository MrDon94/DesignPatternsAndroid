package com.github.designpatternsandroid.pattern.behavior.state;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/8/1 9:03
 */
public interface IMario { //所有状态类的接口
    State getName();
    //以下是定义的事件
    void obtainMushRoom();
    void obtainCape();
    void obtainFireFlower();
    void meetMonster();
}





// 省略CapeMario、FireMario类...


