import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EntradaDeDados entradaDeDados = new EntradaDeDados();

        String verDeNovoTiposDeTriangulos;
        do {
            System.out.println("_______________________________");
            System.out.println("      TIPOS DE TRIÂNGULOS      ");
            System.out.println("_______________________________");

            Triangulos triangulos = entradaDeDados.pegandoDadosDeTriangulo();

            System.out.println(triangulos.eumTriangulo());


            System.out.print("Você quer ver os tipos de triângulos de novo? (sim/não): ");
            Scanner scanner = new Scanner(System.in);
            verDeNovoTiposDeTriangulos = scanner.nextLine();

        }while (verDeNovoTiposDeTriangulos.equalsIgnoreCase("sim"));

        entradaDeDados.fechandoScanner();
    }
}
