import java.util.Scanner;

public class EntradaDeDados {
    private Scanner scanner;

    public EntradaDeDados(){
        this.scanner = new Scanner(System.in);
    }

    public Triangulos pegandoDadosDeTriangulo(){
        System.out.print("Qual o valor do lado A: ");
        int ladoA = scanner.nextInt();
        System.out.println();
        System.out.print("Qual o valor do lado B: ");
        int ladoB = scanner.nextInt();
        System.out.println();
        System.out.print("Qual o valor do lado C: ");
        int ladoC = scanner.nextInt();
        System.out.println();

        return new Triangulos(ladoA, ladoB, ladoC);
    }

    public void fechandoScanner(){
        scanner.close();
    }
}
