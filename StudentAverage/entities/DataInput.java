package entities;

import java.util.Scanner;

    public class DataInput {

        public void questions() {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("\ngrades1: ");
        double grades1 = scanner.nextDouble();
        System.out.print("\ngrades2: ");
        double grades2 = scanner.nextDouble();
        System.out.print("\ngrades3: ");
        double grades3 = scanner.nextDouble();

        double result = grades1 + grades2 + grades3;
        Student student = new Student();
        student.percentageOfTheAverageToPass(result);
        }
}
