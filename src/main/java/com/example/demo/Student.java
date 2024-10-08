package com.example.demo;

public class Student {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
        this.name = "김현정";
        this.age = 20;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
