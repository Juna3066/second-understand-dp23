## 观察者
* 对象属性是反应对象状态的重要特征。
如何设计对象间的交互决定着软件的运行效率。


* 轮询策略 polling
http无状态连接的特点，服务器无法主动推送push消息给客户端
我们常用 轮询策略，持续轮番询问服务器状态有无更新，
访问高峰期，服务器（被观察者）不堪重负，可能会宕机瘫痪。

* 反客为主
商店通知买家，类似Websocket协议的交互方式（http轮询相反）
允许服务器端主动推送消息到 客户端

## 组成
* subject 主题
* concretedSubject 主题实现
* observer 观察者
* concretedObserver 观察者实现

subject - > observer