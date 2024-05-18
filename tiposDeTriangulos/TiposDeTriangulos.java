import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String verDeNovoTiposDeTriangulos;
        String resultado;

        do {
            System.out.println("_______________________________");
            System.out.println("      TIPOS DE TRIÂNGULOS      ");
            System.out.println("_______________________________");
            System.out.println();
            System.out.print("Qual o valor do lado A: ");
            int ladoA = scanner.nextInt();
            System.out.println();
            System.out.print("Qual o valor do lado B: ");
            int ladoB = scanner.nextInt();
            System.out.println();
            System.out.print("Qual o valor do lado C: ");
            int ladoC = scanner.nextInt();
            System.out.println();

            if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
                if (ladoA == ladoB && ladoB != ladoC || ladoA == ladoC && ladoC != ladoB || ladoB == ladoC && ladoB != ladoA) {
                    resultado = "isósceles";
                } else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
                    resultado = "escaleno";
                } else {
                    resultado = "equilátero";
                }
            } else {
                resultado = "Isso não é um triângulo";
            }

            System.out.println(resultado);
            System.out.print("Você quer ver os tipos de triângulos de novo? (sim/não): ");
            scanner.nextLine(); 
            verDeNovoTiposDeTriangulos = scanner.nextLine();
        } while (verDeNovoTiposDeTriangulos.equalsIgnoreCase("sim"));

        scanner.close();
    }
}

