package entities;

import java.util.Scanner;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;
    public Scanner scanner;

    public void questions(){
        this.scanner = new Scanner(System.in);
        System.out.print("\nName: ");
        name = scanner.nextLine();
        System.out.print("\nGross salary: ");
        grossSalary = scanner.nextDouble();
        System.out.print("\nTax: ");
        tax = scanner.nextDouble();
    }

    public double taxApplied(){
        return grossSalary - tax;
    }

    public void answer() {
        System.out.printf("\nEmployee: %s, $ %.2f", name, taxApplied());
    }

    public void questionsTwo(){
        System.out.println("\nWhich percentage to increase salary? " );
        percentage = scanner.nextDouble();
    }

    public void closeScanner(){
        scanner.close();
    }

    public double increasedSalaryPercentage() {
        return taxApplied() + (grossSalary * (percentage / 100.0));
    }


    public String toString() {
        return String.format("Updated data: %s, $ %.2f", name, increasedSalaryPercentage());

    }
}
