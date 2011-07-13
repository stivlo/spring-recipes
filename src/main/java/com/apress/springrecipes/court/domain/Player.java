package com.apress.springrecipes.court.domain;

public class Player {

    private String name;
    private String phone;

    public Player(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name;
    }

}
