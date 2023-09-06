package ru.mirea.prak6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем студентов по их итоговым баллам в порядке убывания
        return Integer.compare(student2.getScore(), student1.getScore());
    }

    // Метод для сортировки списка студентов с использованием алгоритма быстрой сортировки
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
        students.add(new Student("Иван", "Иванов", 3, 85));
        students.add(new Student("Петр", "Петров", 2, 92));
        students.add(new Student("Анна", "Сидорова", 4, 78));

        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        comparator.quickSort(students, 0, students.size() - 1);

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname() + ": " + student.getScore());
        }
    }
}
