## 备忘录 memento
具有恢复的作用

* 备忘录类一定独立于数据类 独立存在，生成的历史记录也应该在元数据类之外进行维护。
这样，不但确保了元数据的封装不被破坏，而且实现了对其内部状态历史变化的捕获和恢复。

## 组成
* 元 Originator
* 备忘录 Memento
* 看护人 Taker

使用的时候需要注意，当元对象状态数据量过大的时候，或者无限制对元对象进行快照备份操作，
会导致内存空间浪费。
可以加上历史记录容量限制，比如20条。
