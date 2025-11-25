package com.kodilla.reflection;

public class StudentsDTO {
    private int numberOfStudents;
    private int indexLength;


    public StudentsDTO(int numberOfStudents, int indexLength) {
        this.numberOfStudents = numberOfStudents;
        this.indexLength = indexLength;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getIndexLength() {
        return indexLength;
    }
}
