package com.github.designpatternsandroid.pattern.behavior.command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 命令模式：将请求（命令）封装为一个对象，这样可以使用不同的请求参数化其他对象（将不同请求依赖注入
 * 到其他对象），并且能够支持请求（命令）的排队执行、记录日志、撤销等（附加控制）功能。
 *
 * 适用场景：游戏后端架构
 *
 * 与策略模式的区别：
 *      在策略模式中，不同的策略具有相同的目的、不同的实现、互相之间可以替换。比如，BubbleSort、SelectionSort 都是为了实现排序的，只不过一个是用冒泡排序算法来实现的，另一个是用选择排序算法来实现的。
 *      在命令模式中，不同的命令具有不同的目的，对应不同的处理逻辑，并且互相之间不可替换。
 * @date: 2024/8/5 10:47
 */
public class GameApplication {
    private static final int MAX_HANDLED_REQ_COUNT_PER_LOOP = 100;
    private Queue<Command> queue = new LinkedList<>();

    public void mainloop() {
        while (true) {
            List<Request> requests = new ArrayList<>();

            //省略从epoll或者select中获取数据，并封装成Request的逻辑，
            //注意设置超时时间，如果很长时间没有接收到请求，就继续下面的逻辑处理。

            for (Request request : requests) {
                Event event = request.getEvent();
                Command command = null;
                if (event.equals(Event.GOT_DIAMOND)) {
                    command = new GotDiamondCommand(/*数据*/);
                } else if (event.equals(Event.GOT_STAR)) {
//                    command = new GotStartCommand(/*数据*/);
                } else if (event.equals(Event.HIT_OBSTACLE)) {
//                    command = new HitObstacleCommand(/*数据*/);
                } else if (event.equals(Event.ARCHIVE)) {
//                    command = new ArchiveCommand(/*数据*/);
                } // ...一堆else if...

                queue.add(command);
            }

            int handledCount = 0;
            while (handledCount < MAX_HANDLED_REQ_COUNT_PER_LOOP) {
                if (queue.isEmpty()) {
                    break;
                }
                Command command = queue.poll();
                command.execute();
            }
        }
    }
}
