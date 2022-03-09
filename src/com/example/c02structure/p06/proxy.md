## Proxy

## 代理模式 区别 装饰器模式 的地方
    接口其他实现的引用 是 构造方法中主动实现，而非外部注入。
    一个起到管控作用，一个起到增强作用。

    被代理对象，被封装 或隐藏，使得客户端不可见。

    经常用到
        多个类方法前后 写日志
        业务类加上数据库 事务控制

        事务开始  业务 事务结束  出问题回滚，通过代理，每个业务类就不必重复写 事务控制的代码。
        已经达到整个系统的事务管控，提高了开发效率。

        想到了注解@After @Before ...

        编译时的静态代理 || 运行时生成的动态代理，原理一样。


##组成

Subject 业务接口 定义了业务的接口标准
RealSubject 被代理业务   被代理的实际业务
Proxy  代理   同样实现业务接口，并且 包含被代理业务对象 管控，对外提供管控后的业务方法
Client 客户端
    调用代理业务

 代理模式有 增强、管控（侧重）原业务的功能，隐藏了实际业务，提供代理业务。
    避免客户端直接调用实际业务 而造成可能的安全隐患。



















