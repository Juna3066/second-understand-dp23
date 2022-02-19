package com.pra02.template.pm;

import java.util.Random;

public class APIProject extends PM {
    private final Random random = new Random();

    @Override
    public String analyze() {
        System.out.println("程序员：调研需求");
        return "市场报表API需求";
    }

    @Override
    public String designCode(String require) {
        System.out.println("程序员：选择开发架构");
        return "代码设计(" + require + ")";
    }

    @Override
    public String develop(String project) {
        System.out.println("程序员：开发...");
        return "开发（" + project.replaceAll("bug", "") + ")" + (random.nextBoolean() ? "bug" : "");
    }

    @Override
    public boolean test(String project) {
        System.out.println("自动化测试...");
        return !project.contains("bug");
    }

    @Override
    public void release(String project) {
        System.out.println("部署上线到云平台：【" + project + "】");
    }
}
