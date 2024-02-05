package com.example.rcreviewcompanion;

public class Achievement {
    private String name;
    private String meaning;
    private int imageResourceId;

    public Achievement(String name, String meaning, int imageResourceId) {
        this.name = name;
        this.meaning = meaning;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getMeaning() {
        return meaning;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}

