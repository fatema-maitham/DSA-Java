package com.mycompany.practiceactivitiesweek1;

public class Lecturer extends Person {
    private String subject;

    public Lecturer(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(getName() + " teaches " + subject);
    }
}