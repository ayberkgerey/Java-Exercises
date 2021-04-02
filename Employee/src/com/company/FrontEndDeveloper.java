package com.company;

public class FrontEndDeveloper extends Employee{
    private final String department = "Software";
    private final String team = "FrontEnd Team";
    private String languages;
    private boolean isWebDeveloper;
    private boolean isMobileDeveloper;

    public FrontEndDeveloper(String name, String surName, String sex, Integer age, boolean isGraduated, String languages, boolean isWebDeveloper) {
        super(name, surName, sex, age, isGraduated);
        this.languages = languages;
        this.isWebDeveloper = isWebDeveloper;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public boolean isWebDeveloper() {
        return isWebDeveloper;
    }
    public boolean isMobileDeveloper() {
        return isMobileDeveloper;
    }

    public void setWebDeveloper(boolean webDeveloper) {
        isWebDeveloper = webDeveloper;
        isMobileDeveloper = !webDeveloper;
    }

    @Override
    public String toString() {
        return "FrontEndDeveloper{" +
                "department='" + department + '\'' +
                ", team='" + team + '\'' +
                ", languages='" + languages + '\'' +
                ", isWebDeveloper=" + isWebDeveloper +
                ", isMobileDeveloper=" + isMobileDeveloper +
                '}';
    }
}
