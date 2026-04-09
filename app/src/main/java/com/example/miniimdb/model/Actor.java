package com.example.miniimdb.model;

import java.io.Serializable;
public class Actor implements Serializable {
    private String name;
    private int imageResId;

    public Actor(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }
    public String getName() {
        return name;
    }
    public int getImageResId() {
        return imageResId;
    }
}
