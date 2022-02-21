package com.pra03.strategy.cal;

//重载的话 简化if逻辑 用访问者  对应购物车案例
//简化if逻辑 还有一个是状态模式 对应红绿灯案例
public interface Strategy {
    int calculate(int a,int b);
}
