package com.lessonList.Task2;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;
    private final Integer are;
    private final Integer averageScoreYear;

    public Student(String firstName, String lastName, Integer are, Integer averageScoreYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.are = are;
        this.averageScoreYear = averageScoreYear;
    }

    @Override
    public int compareTo(Student o) {
        return this.getAre() - o.getAre();
    }

    public static Comparator<Student> AverageScoreYear = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAverageScoreYear() - o2.getAverageScoreYear();
        }
    };

    public static Comparator<Student> FirstName = new Comparator<Student>() {
        @Override
        public int compare(Student e1, Student e2) {
            return e1.getLastName().compareTo(e2.getLastName());
        }
    };

    public static Comparator<Student> LastName = new Comparator<Student>() {
        @Override
        public int compare(Student e1, Student e2) {
            return e1.getLastName().compareTo(e2.getLastName());
        }
    };

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAre() {
        return are;
    }

    public Integer getAverageScoreYear() {
        return averageScoreYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", are=" + are +
                ", averageScoreYear=" + averageScoreYear +
                '}';
    }
}
