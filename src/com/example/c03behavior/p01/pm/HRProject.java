package com.example.c03behavior.p01.pm;

import java.util.Random;

/**
 * 行为 和 结果（结果 加括号）
 */
public class HRProject extends PM{
    private Random random = new Random();
    @Override
    public String analyze() {
        System.out.println("分析师：分析需求...");
        return "人力资源管理系统需求";
    }

    @Override
    public String design(String project) {
        System.out.println("架构师：设计架构...");
        return "设计（"+project+"）";
    }

    @Override
    public String develop(String project) {
        if (project.contains("bug")){
            System.out.println("开发：修复bug...");
            project = project.replace("bug","");
            project = "修复（"+project+"）";
            if (random.nextBoolean()){
                project += "bug";
            }
            return project;
        }

        System.out.println("开发：开发代码...");
        if (random.nextBoolean()){
            project += "bug";
        }
        return "开发（"+project+"）";
    }

    @Override
    public boolean test(String project) {
        if (project.contains("bug")){
            System.out.println("测试：发现bug...");
            return false;
        }
        System.out.println("测试：用例通过...");
        return true;
    }

    @Override
    public void release(String code) {
        System.out.println("管理员：上线发布...");
        System.out.println("======最终产品======");
        System.out.println(code);
        System.out.println("==================");
    }
}
