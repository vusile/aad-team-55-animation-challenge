package com.vusile.myapplication.lakes;

public class Lake {
    private String name;
    private String description;
    private int imageResourceId;

    public Lake(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Lake{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageResourceId=" + imageResourceId +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageName() {
        return imageResourceId;
    }

    public void setImageName(int imageName) {
        this.imageResourceId = imageName;
    }
}


