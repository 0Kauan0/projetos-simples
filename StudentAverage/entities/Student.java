package entities;

import java.util.Scanner;

public class Student {
    public String name;
    private Scanner scanner;

    public double questions() {
        this.scanner = new Scanner(System.in);

        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("\ngrades1: ");
        double grades1 = scanner.nextDouble();
        System.out.print("\ngrades2: ");
        double grades2 = scanner.nextDouble();
        System.out.print("\ngrades3: ");
        double grades3 = scanner.nextDouble();
        double result = grades1 + grades2 + grades3;

        return result;
    }

    public void closeScanner() {
        scanner.close();
    }

    public void percentageOfTheAverageToPass() {
        double percentage = 60;
        double totalGrades = questions();

        if (totalGrades > percentage) {
            System.out.print("\nFINAL GRADE = " + totalGrades);
        } else {
            double missingPoints = percentage - totalGrades;
            System.out.print("\nFINAL GRADE = " + totalGrades + "\nFAILED\nMISSING " + missingPoints + " POINTS");
        }
    }
}