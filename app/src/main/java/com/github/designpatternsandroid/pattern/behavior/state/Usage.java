package com.github.designpatternsandroid.pattern.behavior.state;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 状态模式使用方法
 * 状态模式使用场景：状态机，而状态机常用在游戏、工作流引擎等系统开发中。不过，状态机的实现方式有多种，除了状态模式，比较常用的还有分支逻辑法和查表法。
 * 状态机：状态机有 3 个组成部分：状态（State）、事件（Event）、动作（Action）。其中，事件也称为转移条
 * 件（Transition Condition）。事件触发状态的转移及动作的执行。不过，动作不是必须的，也可能只转移状态，
 * 不执行任何动作。
 * @date: 2024/8/1 8:59
 */
public class Usage {
    public static void main(String[] args) {
        //状态机实现方式1：分支逻辑法
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
        //状态机实现方式2：查表法
        MarioStateMachine2 mario2 = new MarioStateMachine2();
        mario2.obtainMushRoom();
        int score2 = mario2.getScore();
        State state2 = mario2.getCurrentState();
        System.out.println("mario score2: " + score2 + "; state2: " + state2);
        //状态机实现方式3：状态模式
        MarioStateMachine3 mario3 = new MarioStateMachine3();
        mario3.obtainMushRoom();
        int score3 = mario3.getScore();
        State state3 = mario3.getCurrentState();
        System.out.println("mario score3: " + score3 + "; state3: " + state3);
    }
}
