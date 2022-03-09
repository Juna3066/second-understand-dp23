package com.example.c01create.p01;

/**
 * synchronized 使用
 */
public class SunC {
    //关键字volatile对静态变量的修饰,能保证变量值在各线程访问时的同步性、唯一性
    private volatile static SunC instance;

    private SunC() {
    }

    //线程还没进方法内部，加锁排队，会造成线程阻塞，资源和时间被浪费 要保证多线程并发下逻辑的重要性，同步锁一定要用的恰到好处
//    public static synchronized SunC getInstance() {
    public static SunC getInstance() {
        //2个嵌套的判空逻辑，这就是懒加载模式的“双检锁”
        //外层放宽入口，保证线程并发的高效性；内层加锁同步，保证实例化的单次运行
        //单例模式的效果，还完美地保证了构建过程的运行效率
        if (instance == null) {
            synchronized (SunC.class) {
                if (instance == null) {
                    instance = new SunC();
                }
            }
        }
        return instance;
    }
}
