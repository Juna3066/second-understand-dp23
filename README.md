# second-understand-p23

# 简介
秒懂设计模式（作者：刘韬）学习过程的记录。

该仓库内容：
* （1）秒懂设计模式（作者：刘韬）源码练习
* （2）秒懂设计模式（作者：刘韬）关键知识点记录
* （3）秒懂设计模式（作者：刘韬）个人体会


desc:以下内容参照图理解记忆

![](./resources/总决.png)

# [零、UML类图画法](src/com/example/c0classpic/UML.md)

# 一、设计模式依赖于
    类的三大特性：
        封装、继承、多态。

    对应的设计模式有三大类型：
        建造、结构、行为。
# 二、设计模式23种
## 0.概述
    建造模式【5种】    （红如火海）
    结构模式【7种】    （绿如林海）
    行为模式【11中】   （蓝如星海）

## 1.建造型
* [01单例](src/com/example/c01create/p01/singleton.md)
* [02原型](src/com/example/c01create/p02/prototype.md)
* [03工厂](src/com/example/c01create/p03/factory.md)
* [04抽象工厂](src/com/example/c01create/p04/abstractFactory.md)
* [05建造者](src/com/example/c01create/p05/builder.md)

## 2.结构型
* [01门面](src/com/example/c02structure/p01/facade.md)
* [02组合](src/com/example/c02structure/p02/composite.md)
* [03装饰器](src/com/example/c02structure/p03/decorator.md)
* [04适配器](src/com/example/c02structure/p04/adapter.md)
* [05享元](src/com/example/c02structure/p05/flyweight.md)
* [06代理](src/com/example/c02structure/p06/proxy.md)
* [07桥接](src/com/example/c02structure/p07/bridge.md)

![](./resources/蓝之多态的行为篇.png)
## 3.行为型
* [01模板方法](src/com/example/c03behavior/p01/templateMethod.md)
* [02迭代器](src/com/example/c03behavior/p02/iterator.md)
* [03责任链](src/com/example/c03behavior/p03/chainOfResponsibility.md)
* [04策略](src/com/example/c03behavior/p04/strategy.md)
* [05状态](src/com/example/c03behavior/p05/state.md)
* [06备忘录](src/com/example/c03behavior/p06/memento.md)
* [07中介](src/com/example/c03behavior/P07/mediator.md)
* [08命令](src/com/example/c03behavior/p08/command.md)
* [09访问者](src/com/example/c03behavior/p09/visitor.md)
* [10观察者](src/com/example/c03behavior/p10/observer.md)
* [11解释器](src/com/example/c03behavior/p11/interpreter.md)

![](./resources/终道.png)
# 三、软件设计原则 （设计模式之终极奥义）
* 01单一原则
```
类的职责应该是单一的
```
* 02开闭原则
```
扩展开放，修改关闭
```
* 03里氏替换 **
```
父类出现的地方，一定能用子类去替换
```  
* 04接口隔离
```
接口的职责尽量单一，划分粒度应该细致，和单一原则类似。
一个是针对类
一个是针对接口
```  
* 05依赖倒置
```
高层依赖底层、因该是高层依赖底层的抽象，面向接口编程。
降低高层和底层之间的耦合度。
```  
* 06迪米特法则
```
封装性、模块和模块之间的耦合尽量简单、高内聚、低耦合。
模块向外部提供简单的访问接口、具体细节不向外部暴露。
```
