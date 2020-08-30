package com.lessonList.Task2;

import java.util.*;


/**
 * Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и
 * среднем балле за год.
 *           . Найти и вывести ученика с
 * самым высоким средним баллом используя итератор.
 *           Отсортировать и вывести список учеников по полному имени
 * (имя + фамилия), возрасту и среднему баллу, используя
 * компараторы.
 */
public class StudentRun {


    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("ivan2", "ivanov3", 20, 4),
                new Student("ivan1", "ivanov4", 21, 5),
                new Student("ivan3", "ivanov2", 22, 10),
                new Student("ivan4", "ivanov1", 19, 8),
                new Student("ivan1", "ivanov5", 19, 8)
        );

        showtArray(students); // массив вывели

        Collections.sort(students); // сорт по are
        showtArray(students);// массив вывели

        students.sort(Student.AverageScoreYear);// сорт по AverageScoreYear
        showtArray(students);
        System.out.println("Ученика самым высоким средним баллом = " + students.get(students.size() - 1));

        students.sort(Student.FirstName);// сорт по FirstName
        showtArray(students);

        students.sort(Student.LastName);// сорт по LastName
        showtArray(students);

        students.sort(new ComparatorByLastAndFirstName());// сорт по LastName end FirstName
        showtArray(students);

    }

    private static void showtArray(Iterable<? extends Student> students) {
        System.out.println("Массив студентов:");
        int counter = 1;
        for (Student student : students) {
            System.out.println(counter + "." + student);
            counter++;
        }
    }
}

