package com.pra02.template.pm;

/**
 * 瀑布模型：
 * 需求分析、软件设计、代码开发、质量测试、上线发布
 */
public abstract class PM {
    //抽象方法默认修饰符
    public abstract String analyze();

    public abstract String designCode(String require);

    public abstract String develop(String project);

    public abstract boolean test(String project);

    public abstract void release(String project);

    //final 定义开发过程不能改变
    public final void kickoff() {
        String require = analyze();
        String project = designCode(require);
        //开发、测试 测试不通过 继续开发
        do {
            project = develop(project);
        } while (!test(project));
        release(project);
    }
}
