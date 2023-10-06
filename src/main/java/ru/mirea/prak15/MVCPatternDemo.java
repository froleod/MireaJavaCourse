package ru.mirea.prak15;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Alex");
        controller.setStudentRollNo("rollNo2");

        System.out.println("After updating, Student details are: ");

        controller.updateView();
    }

    public static Student retrieveStudentFromDataBase() {
        Student student = new Student();
        student.setName("Jason");
        student.setRollNo("rollNo1");
        return student;
    }
}
