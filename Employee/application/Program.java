package application;

import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.questions();
        employee.answer();
        employee.questionsTwo();
        String text = employee.toString();
        System.out.println(text);
    }
}
