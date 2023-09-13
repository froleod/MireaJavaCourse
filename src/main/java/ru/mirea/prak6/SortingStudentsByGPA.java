package ru.mirea.prak6;

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

    // Метод для сортировки списка студентов быстрой сортировкой
    public void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(students.get(j), pivot) > 0) {
                i++;
                swap(students, i, j);
            }
        }

        swap(students, i + 1, high);
        return i + 1;
    }

    private void swap(List<Student> students, int i, int j) {
        Student temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
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
