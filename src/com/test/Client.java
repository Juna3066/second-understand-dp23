package com.test;

import java.io.File;


public class Client {

    public static void main(String[] args) {
        String url = "E:\\code\\second-understand-dp23\\src\\com\\example";
        File file = new File(url);
        printName(file);
    }

    private static void printName(File file) {
        File[] fs = file.listFiles();
        for (File f : fs) {
            if (f.isFile()){
                String path = f.getAbsolutePath();
                if (path.endsWith("txt")){
                    String newName = path.replace("txt", "md");
                    f.renameTo(new File(newName));
                }
            }else {
                printName(f);
            }
        }
    }
}
