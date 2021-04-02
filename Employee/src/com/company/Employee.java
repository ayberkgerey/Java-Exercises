package com.company;

public class Employee {
    private String name;
    private String surName;
    private String sex;
    private Integer age;
    private boolean isGraduated;

    public Employee(String name, String surName, String sex, Integer age, boolean isGraduated) {
        this.name = name;
        this.surName = surName;
        this.sex = sex;
        this.age = age;
        this.isGraduated = isGraduated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", isGraduated=" + isGraduated +
                '}';
    }
}
