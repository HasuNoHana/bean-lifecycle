package com.kodilla.reflection;

public class Student {
    private String indexNumber;

    public Student(int z) {
        this.indexNumber = RandomStringGenerator.getRandomString(z);
    }
}
