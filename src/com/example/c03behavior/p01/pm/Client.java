package com.example.c03behavior.p01.pm;

public class Client {
    public static void main(String[] args) {
        PM project = new HRProject();
        project.kickoff();

        project = new APIProject();
        project.kickoff();
    }
}
