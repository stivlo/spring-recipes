package com.apress.springrecipes.court.domain;

public class SportType {

    private int id;
    private String name;

    public SportType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

}
