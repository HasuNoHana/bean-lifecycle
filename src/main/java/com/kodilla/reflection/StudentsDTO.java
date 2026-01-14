package com.kodilla.reflection;

public class StudentsDTO {
    @Range(min = 10, max = 20)
    private int numberOfStudents;
    @Range(min = 20, max = 40)
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
