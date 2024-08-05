## 23种设计模式目录
* ### 单例模式
  * [饿汉式][idgenerator.java]
  * [懒汉式][idgenerator2.java]
  * [双重检测][idgenerator3.java]
  * [静态内部类][idgenerator4.java]
  * [枚举][idgenerator5.java]
* ### 工厂模式
  * [简单工厂][ruleconfigparserfactory.java](第一种实现方式)
  * [简单工厂][ruleconfigparserfactory2.java](第二种实现方式)
  * [工厂方法][ruleconfigparserfactorymap.java]
  * [抽象工厂][jsonconfigparserfactory.java]
* ### 建造者模式
  * [建造者模式][resourcepoolconfig.java]
* ### 原型模式
  * [原型模式][demo.java]
* ### 代理模式
  * [静态代理][usercontrollerproxy.java](实现接口方式)
  * [静态代理][usercontrollerproxy2.java](继承方式)
  * [动态代理][metricscollectorproxy.java]
* ### 桥接模式
  * [桥接模式][bridgeusage]
* ### 装饰器模式
  * [装饰器模式][adecorator.java]
* ### 适配器模式
  * [类适配器][classadaptor.java](基于继承)
  * [对象适配器][objectadaptor.java](基于组合)
* ### 门面模式
  * [门面模式][orderfacade.java]
* ### 组合模式
  * [组合模式][compositeusage.java]
* ### 享元模式
  * [享元模式][chesspieceunit.java]
* ### 观察者模式
  * [观察者模式][observerusage.java]
* ### 模板模式
  * [模板模式][abstractclass.java]
* ### 策略模式
  * [策略模式][strategyusage.java]
* ### 职责链模式
  * [职责链模式][chainusage.java]
* ### 迭代器模式
  * [迭代器模式][iteratorusage.java]
* ### 状态模式
  * [状态模式][stateusage.java]
* ### 访问者模式
  * [访问者模式][visitorusage.java]
  * [为什么支持双分派的语言不需要访问者模式？][dispatchusage.java](补充理解)
* ### 备忘录模式
  * [备忘录模式][mementousage.java]
* ### 命令模式
  * [命令模式][gameapplication.java]
* ### 解释器模式
* ### 中介模式

[idgenerator.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/create/singleton/IdGenerator.java
[idgenerator2.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/create/singleton/IdGenerator2.java
[idgenerator3.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/create/singleton/IdGenerator3.java
[idgenerator4.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/create/singleton/IdGenerator4.java
[idgenerator5.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/create/singleton/IdGenerator5.java

[ruleconfigparserfactory.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/create/factory/simple/RuleConfigParserFactory.java
[ruleconfigparserfactory2.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/create/factory/simple/RuleConfigParserFactory2.java
[ruleconfigparserfactorymap.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/create/factory/method/RuleConfigParserFactoryMap.java
[jsonconfigparserfactory.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/create/factory/abstracted/JsonConfigParserFactory.java

[resourcepoolconfig.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/create/builder/ResourcePoolConfig.java

[demo.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/create/prototype/Demo.java

[usercontrollerproxy.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/structure/proxy/UserControllerProxy.java
[usercontrollerproxy2.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/structure/proxy/UserControllerProxy2.java
[metricscollectorproxy.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/structure/proxy/MetricsCollectorProxy.java

[bridgeusage]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/structure/bridge/Usage.java

[adecorator.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/structure/decorator/ADecorator.java

[classadaptor.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/structure/adapter/ClassAdaptor.java
[objectadaptor.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/structure/adapter/ObjectAdaptor.java

[orderfacade.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/structure/facade/OrderFacade.java

[compositeusage.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/structure/composite/Usage.java

[chesspieceunit.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/structure/flyweight/ChessPieceUnit.java

[observerusage.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/behavior/observer/Usage.java

[abstractclass.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/behavior/template/AbstractClass.java

[strategyusage.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/behavior/strategy/Usage.java

[chainusage.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/behavior/chain/Usage.java

[stateusage.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/behavior/state/Usage.java

[iteratorusage.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/behavior/iterator/Usage.java

[visitorusage.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/behavior/visitor/Usage.java
[dispatchusage.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/behavior/visitor/dispatch/Usage.java

[mementousage.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/behavior/memento/Usage.java

[gameapplication.java]:https://github.com/MrDon94/DesignPatternsAndroid/blob/master/app/src/main/java/com/github/designpatternsandroid/pattern/behavior/command/GameApplication.java