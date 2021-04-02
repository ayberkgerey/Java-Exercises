package com.company;

public class BackEndDeveloper extends Employee {

    private final String department = "Software";
    private final String team = "Backend Team";
    private String database;
    private byte backendLevel; //1 to 10

    public BackEndDeveloper(String name, String surName, String sex, Integer age, boolean isGraduated, String database, byte backendLevel) {
        super(name, surName, sex, age, isGraduated);
        this.database = database;
        this.backendLevel = backendLevel;
    }

    @Override
    public String toString() {
        return "BackEndDeveloper{" +
                "department='" + department + '\'' +
                ", team='" + team + '\'' +
                ", database='" + database + '\'' +
                ", backendLevel=" + backendLevel +
                '}';
    }
}
