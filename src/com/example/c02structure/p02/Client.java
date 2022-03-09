package com.example.c02structure.p02;

/**
 * 关于继承、想看看 编译器 再执行一些编译后的代码情况、这里表述可能不太清楚
 * 疑问待解决
 */
public class Client {
    public static void main(String[] args) {
        Folder driveD = getFolder();
        //driveD.tree(0);
        driveD.tree();
    }

    private static Folder getFolder() {
        Folder driveD = new Folder("D盘");

        Folder doc = new Folder("文档");
        doc.add(new File("简历.doc"));
        doc.add(new File("项目介绍.ppt"));

        driveD.add(doc);

        Folder music = new Folder("音乐");
        Folder jay = new Folder("周杰伦");
        jay.add(new File("告白气球.mp3"));
        jay.add(new File("彩虹.mp3"));

        Folder kondor = new Folder("Kondor");
        kondor.add(new File("The wide world"));
        kondor.add(new File("Eternal life"));

        music.add(jay);
        music.add(kondor);

        driveD.add(music);
        return driveD;
    }
}
