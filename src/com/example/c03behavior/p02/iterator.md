## 迭代器模式 提供了一种按顺序遍历集合的接口,
并且不需要知道 集合内部的数据结构。

## 集合类
* Collection
  * List
    * ArrayList
    * LinkedList
    * Vector
  * Set
    * HashSet
    * TreeSet
    * LinkedHashSet
  * Queue
  * Map
    * HashMap
    * TreeMap
    * HashTable

对class文件进行反编译，会发现foreach本质：通过获取iterator 迭代器 来遍历

## 汽车行车记录仪案例
用户如果获取原始数据，我们提供的两个接口 display 和 displayByOrder 好像有点死板，扩展性不够？
直接暴漏records 破坏封装性，而且索引如果随便改，会导致 数据 错乱问题。

这个时候，我们应该 提供给用户 方便、统一的数据遍历接口。

集合是容器，不负责迭代
抽离迭代逻辑，独立于迭代器中。


## 迭代器组成：
* Aggregate 集合接口（Iterable）
* ConcreteAggregate 集合实现（行车记录仪）
* Iterator (迭代器接口)
* ConcreteIterator (迭代器实现)

CA 依赖 CI

CI 关联 CA (迭代器实现 必会 访问 集合实现的 数据)


