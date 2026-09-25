package com.mycompany.practiceactivitiesweek1;

public class CollegeStudent extends Person {
    private double gpa;

    public CollegeStudent(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    public void study() {
        System.out.println(getName() + " is studying.");
    }
}