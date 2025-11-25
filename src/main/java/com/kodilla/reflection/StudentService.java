package com.kodilla.reflection;

import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.*;

@Service
public class StudentService {


    public Map<Integer, String> getStudents(int numberOfStudents, int indexLength) throws NoSuchFieldException, IllegalAccessException {
        List<Student> students = this.generateStudents(numberOfStudents, indexLength);
        Map<Integer, String> result = new HashMap<>();
        for (Student student : students) {
            Field index = Student.class.getDeclaredField("indexNumber");
            index.setAccessible(true);
            result.put(System.identityHashCode(student), (String) index.get(student));
        }
        return result;
    }

    private List<Student> generateStudents(int numberOfStudents, int indexLength) {
        List<Student> students = new ArrayList<>();
        for (int i=0; i<numberOfStudents; i++) {
            students.add(new Student(indexLength));
        }
        return students;
    }
}
