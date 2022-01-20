package com.pra01.template;

import java.util.Random;

public class PersonManageSys extends PM {
    private Random random = new Random();

    @Override
    public String analyze() {
        System.out.println("JUNA3066：个人管理需求分析");
        return "个人管理系统";
    }

    @Override
    public String design(String project) {
        System.out.println("JUNA3066：代码架构设计");
        return String.format("设计（%s）", project);
    }

    @Override
    public String develop(String project) {
        if (project.contains("bug")){
            System.out.println("JUNA3066：修复bug");
            project = project.replace("bug","");
            if (random.nextBoolean()){
                project += "bug";
            }
            return String.format("修复（%s）",project);
        }

        System.out.println("JUNA3066：开发code");
        if (random.nextBoolean()){
            project += "bug";
        }
        return  String.format("开发（%s）",project);
    }

    @Override
    public boolean test(String project) {
        System.out.println("JUNA3066：用自动化测试程序");
        return !project.contains("bug");
    }

    @Override
    public void release(String project) {
        System.out.println("======最终成果======");
        System.out.println(project);
        System.out.println("==================");
    }
}
