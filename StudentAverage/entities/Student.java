package entities;

import java.util.Scanner;

public class Student {


    public void percentageOfTheAverageToPass(double totalGrades) {
        double percentage = 60;

        if (totalGrades > percentage) {
            System.out.print("\nFINAL GRADE = " + totalGrades);
        } else {
            double missingPoints = percentage - totalGrades;
            System.out.print("\nFINAL GRADE = " + totalGrades + "\nFAILED\nMISSING " + missingPoints + " POINTS");
        }
    }
}