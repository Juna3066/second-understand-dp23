package com.pra02.template.pm;

public class Client {
    public static void main(String[] args) {
        PM prj = new HRProject();
        //prj.kickoff();
        prj = new APIProject();
        prj.kickoff();
    }
}
