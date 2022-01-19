package com.example.c03behavior.p01.pm;

import java.util.Random;

public class APIProject extends PM{
    private Random random = new Random();
    @Override
    public String analyze() {
        System.out.println("开发：了解需求");
        return "市场占比统计报表API";
    }

    @Override
    public String design(String project) {
        System.out.println("开发：调研微服务框架");
        return "设计（"+project+"）";
    }

    @Override
    public String develop(String project) {
        System.out.println("开发：业务代码修改和开发...");
         project = project.replaceAll("bug", "");
         project = "开发（"+project+(random.nextBoolean() ? "bug" : "") +"）";
        return project;
    }

    @Override
    public boolean test(String project) {
        System.out.println("平台：自动化单元测试、集成测试...");
        return !project.contains("bug");
    }

    @Override
    public void release(String project) {
        System.out.println("开发：发布到云服务平台...");
        System.out.println("======最终产品======");
        System.out.println(project);
        System.out.println("==================");
    }
}
