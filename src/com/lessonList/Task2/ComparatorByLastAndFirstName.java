package com.lessonList.Task2;


import java.util.Comparator;

public class ComparatorByLastAndFirstName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int flag = o1.getLastName().compareTo(o2.getLastName());
        if(flag == 0) flag = o1.getFirstName().compareTo(o2.getFirstName());
        return flag;
    }
}
