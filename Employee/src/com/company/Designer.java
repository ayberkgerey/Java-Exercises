package com.company;

public class Designer extends Employee{
    private final String department = "Art";
    private final String team = "Design Team";
    private String designProgramme;

    public Designer(String name, String surName, String sex, Integer age, boolean isGraduated, String designProgramme) {
        super(name, surName, sex, age, isGraduated);
        this.designProgramme = designProgramme;
    }

    public String getDepartment() {
        return department;
    }

    public String getTeam() {
        return team;
    }

    public String getDesignProgramme() {
        return designProgramme;
    }

    public void setDesignProgramme(String designProgramme) {
        this.designProgramme = designProgramme;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "department='" + department + '\'' +
                ", team='" + team + '\'' +
                ", designProgramme='" + designProgramme + '\'' +
                '}';
    }
}
