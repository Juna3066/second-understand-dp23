## strategy
* 一个优秀的系统，绝不能随意的改变底层代码。
站在高层抽象的角度构建，一套相对固化的模式。

* 接口中的变量和方法都有修饰符，且一般省略
 public static final 静态常量
 public abstract 隐士抽象


* 计算机模块组成的系统，是策略模式的最佳范例了

* 计算机USB接口的标准化，使他拥有无线扩展外设的能力。
需要什么功能，购买相关USB设备

* 策略模式中，USB接口起到了关键的解耦作用

## 组成
* Strategy 策略规范 （behavior()）
* ConcreteStrategy...
* Context 系统环境 （setStrategy() execute()） 聚合策略接口