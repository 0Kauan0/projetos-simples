package application;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        Student student = new Student();
        student.questions();
        student.percentageOfTheAverageToPass();
    }
}
