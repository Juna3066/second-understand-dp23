## 享元
* 计算机的无穷无尽的可能，本质是 0 1 两个元 的组合变化而成。

* 享元，共享原件，flyweight ,享元模式能使程序变得轻量化。

* 当系统存在大量对象，这些对象又有相同的内部状态，我们就可以用该模式，以避免对象泛滥 造成资源浪费。


* 对于游戏地图案例，材料相同，坐标不同。 材料可以作为 享元，坐标不能。
坐标不能作为享元属性，从tile中抽离出来维护。

* 享元类 即将共享的元数据 叫 内蕴状态（例如案例image）
不能共享的数据 叫 外蕴状态（例如案例坐标）

## 优化案例中：

* 内蕴状态（图片）自己维护
* 外蕴状态（坐标）抽离出去，在接口中维护

## 组成
* FlyweightFactory 享元工厂 getFlyweight(key);
* Flyweight 享元接口
  * doOperation(extrinsicState);
* ConcreteFlyweight
  * intrinsicState 内蕴状态
  * doOperation(extrinsicState);

