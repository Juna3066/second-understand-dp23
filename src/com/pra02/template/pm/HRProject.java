package com.pra02.template.pm;

import java.util.Random;

public class HRProject extends PM {
    //读jvm 这里是否加 final 比较好？
    private final Random random = new Random();

    @Override
    public String analyze() {
        System.out.println("调研员工：需求分析");
        return "人力资源管理系统需求";
    }

    @Override
    public String designCode(String require) {
        System.out.println("架构师：设计架构");
        return "代码设计（" + require + "）";
    }

    @Override
    public String develop(String project) {
        if (project.contains("bug")) {
            System.out.println("程序员：修复bug");
            project = project.replace("bug", "");
            if (random.nextBoolean()) {
                project += "bug";
            }
            return "修复（" + project + "）";
        }

        System.out.println("程序员：开发");
        if (random.nextBoolean()) {
            project += "bug";
        }
        return "开发（" + project + "）";
    }

    @Override
    public boolean test(String project) {
        System.out.println("测试：测试代码");
        boolean bug = project.contains("bug");
        if (bug) {
            System.out.println("测试不通过");
        } else {
            System.out.println("测试通过");
        }
        return !bug;
    }

    @Override
    public void release(String project) {
        System.out.println("运维：部署发布项目【" + project + "】");
    }
}
