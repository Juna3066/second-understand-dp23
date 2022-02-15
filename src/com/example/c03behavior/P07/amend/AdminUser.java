package com.example.c03behavior.P07.amend;

public class AdminUser extends User {

    protected AdminUser(String name) {
        super(name);
    }

    public void kick(User user) {
        user.logout();
    }
}
