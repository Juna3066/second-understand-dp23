package com.example.c03behavior.p01.pm;

/**
 * 简单的项目开发，一般使用的是 瀑布模型，五步骤：需求分析、软件设计、代码开发、质量测试、上线发布
 */
public abstract class PM {
    public abstract String analyze();
    public abstract String design(String project);
    public abstract String develop(String project);
    public abstract boolean test(String project);
    public abstract void release(String project);

    /**
     * kickoff 卫星与运载火箭）分离;（足球）开球，（社会集会等）开始
     */
    public final void kickoff(){
        String requirement = analyze();
        String designCode = design(requirement);
        do {
            designCode = develop(designCode);
        }while (!test(designCode));
        release(designCode);
    }
}
