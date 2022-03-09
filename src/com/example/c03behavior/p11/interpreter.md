# 解释器模式 interpreter

    java编程语言
    源代码-编译器-解释器-机器码

1. 用于解释一些相对简单的语法规则。
2. 构建一套规则校验引擎。例如，解释器解耦换做 public boolean validate(String target)

解释器模式其实是一种组合模式的特殊应用。

利用“组合模式”的结构模型构建，语义树Syntax Tree完成翻译工作。  

组合模式强调的是数据结构，解释器模式关注的是解释行为的抽象和多态。

# 组成

* AbstractExpression 抽象表达式
* TerminalExpression 终极表达式
* NonTerminalExpression 非终极表达式
* Context 上下文
* Client