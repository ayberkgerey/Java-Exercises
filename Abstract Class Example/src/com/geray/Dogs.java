package com.geray;

public abstract class Dogs {

    private String color;
    private boolean isHairy;
    private boolean isMale;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHairy() {
        return isHairy;
    }

    public void setHairy(boolean hairy) {
        isHairy = hairy;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String bark(){
    return "bark!";
}

    @Override
    public String toString() {
        return "Dogs{" +
                "color='" + color + '\'' +
                ", isHairy=" + isHairy +
                ", isMale=" + isMale +
                '}';
    }
}
