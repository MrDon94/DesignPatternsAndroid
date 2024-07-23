package com.github.designpatternsandroid.pattern.structure.proxy;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 代理类继承方式
 * 适用场景：原始类来自一个三方的类库，没法直接修改时就用继承的方式对外部类扩展
 * @date: 2024/7/23 10:25
 */
public class UserControllerProxy2 extends UserController {
    private MetricsCollector metricsCollector;

    public UserControllerProxy2() {
        this.metricsCollector = new MetricsCollector();
    }

    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = super.login(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = super.register(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }
}
