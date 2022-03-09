## Bridge
* 抽象 和 实现 分离，相互不受约束、最后使用的时候 再组合到一起，像桥梁一样把他们连接到一起。
降低 抽象 和 实现 两个维度 的 耦合，提高系统的可扩展性。

* 相似于全球化分工的经济模式。

* 例子  
```
形色
抽象和实现解耦，两个维度（尺子、颜色） 各自扩展
```
## 组成：
* Abstraction 抽象一方的高层接口，多是抽象类的形式、并且引用实现接口
* AbstractionImpl 抽象方子类，在其抽象维度上扩展
* Implementor 实现方接口定义
* ConcretedImplementor 实现方 接口实现，在自己维度扩展

整体类图 想一个桥 把 Abstraction 、Implementor 连接在一起