package ru.mirea.prak11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getScore() > student2.getScore()) {
            return -1;
        } else if (student1.getScore() < student2.getScore()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void quickSort(List<Student> students, int left, int right) {
        if (left < right) {
            Student pivot = students.get(right);
            int i = left - 1;
            for (int j = left; j < right; j++) {
                if (compare(students.get(j), pivot) < 0) {
                    i++;
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }

            Student temp = students.get(i + 1);
            students.set(i + 1, students.get(right));
            students.set(right, temp);

            int pivotIndex = i + 1;
            quickSort(students, left, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, right);
        }
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Иван", "Иванов", 3, 8.5));
        students.add(new Student(2, "Петр", "Петров", 2, 9.2));
        students.add(new Student(3, "Анна", "Сидорова", 4, 7.8));

        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        comparator.quickSort(students, 0, students.size() - 1);


        for (Student student : students) {
            System.out.println(student);
        }
    }
}
