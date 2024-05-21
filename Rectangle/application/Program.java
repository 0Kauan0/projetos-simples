package application;

import entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura do retangulo: ");
        rectangle.altura = scanner.nextDouble();
        System.out.print("Digite a largura do retangulo: ");
        rectangle.largura = scanner.nextDouble();
        System.out.println();
        System.out.println(rectangle.toString());
    }
}
