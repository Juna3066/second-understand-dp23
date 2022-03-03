## 装饰器
化腐朽为神奇的利器。

* 它能在运行时 动态为原始对象增加功能。
类似于 继承。
都增强了原始对象的功能。

* 继承：在编译时compile-time 静态地 对 原始类的 继承完成。
它：在运行时run-time 对原始对象动态的包装（对实例化对象 装饰的结果）

* 装饰器模式在JDK(开发工具包)中广泛应用，比如：
  * java.io
  * InputStream
  * FileInputStream 文件输入流
  * BufferedInputStream 缓冲输入流
  * ZipInputStream 压缩包输入流


## 组成：
* Component:组件接口，组合元素有：装饰器类 operate()
* ConcreteComponent:组件接口实现
* Decorator:装饰器 operate() 抽象类，实现组件接口
* ConcreteDecorator：装饰器实现 operate() additionOperate();


