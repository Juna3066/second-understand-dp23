## 模板
是对 事物的结构、形式、行为 的总结

* 模板方法是类方法（行为）的总结，
将此固定再基类中，具体行为抽象化，有子类实现、套用。

* 生物生存例子，每中生物都有 活着行为，如果都写，代码冗余，
抽离出来，定义到父类中。（哺乳动物）

* 例子中：
abstract 表示子类必须实现
final 表示模板方法不能被重写


* 简单的软件项目管理，常常会用： 传统的瀑布模型。
分5阶段：
需求分析、软件设计、代码开发、质量测试、上线发布
kickoff 开球 开始

* 基类中的模板方法 并不一定要用抽象方法。
可以实体方法 实现一些通用的操作。


* 子类需要个性化，就重写。不需要的话，就直接继承。

* 软件设计要根据使用场景，灵活变通、恰当运用。