package com.lllllll.entity;

import java.io.Serializable;

public class StudentCase implements Serializable {
    private String name;
    private String surname;
    private double GPA;
    private String speciality;
    private String id;

    public StudentCase() {}

    public StudentCase(String name, String surname, double GPA, String speciality, String id)  {
        this.name = name;
        this.surname = surname;
        this.GPA = GPA;
        this.speciality = speciality;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "StudentCase{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", GPA=" + GPA +
                ", speciality='" + speciality + '\'' +
                ", id=" + id +
                '}';
    }
}
