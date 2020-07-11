package com.geray;

public class Cat {

    private String name;
    private String gender;
    private String color;
    private byte age;
    private boolean isPlaying;
    private boolean isHungry;


    public Cat() {
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.age = age;
        this.isPlaying = isPlaying;
        this.isHungry = isHungry;
  }

    private void playGame(boolean isPlaying){
        if(isPlaying)
            System.out.println(name.toUpperCase() + " playing games!");
        else
            System.out.println(name.toUpperCase()+ " doesn't play!");
    }

    private void isOld(byte age){
        if(age > 12)
            System.out.println(name.toUpperCase() + " is old!");
        else if(age > 6)
            System.out.println(name.toUpperCase() + " is middleAged!");
        else if(age > 3)
            System.out.println(name.toUpperCase() + " is a teen!");
        else
            System.out.println(name.toUpperCase() + " is a baby!");
    }


    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
        isSleeping(isHungry);

    }

    private void isSleeping(boolean hunger){
        if(hunger)
            System.out.println(name.toUpperCase() + " is looking for something to eat");
        else
            System.out.println(name.toUpperCase() + " is sleeping");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
        isOld(age);
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
        playGame(isPlaying);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Name='" + name + '\'' +
                ", Gender='" + gender + '\'' +
                ", Color='" + color + '\'' +
                ", Age=" + age +
                ", Is it playing=" + isPlaying +
                '}';
    }

}
