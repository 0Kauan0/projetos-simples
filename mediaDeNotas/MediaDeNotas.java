import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String MediaNovaMente;
        String recuperacao;

        do {
            System.out.print("nota do bimestre1? ");
            double nota1 = scanner.nextDouble();
            System.out.print("nota do bimestre2? ");
            double nota2 = scanner.nextDouble();
            System.out.print("nota do bimestre3? ");
            double nota3 = scanner.nextDouble();
            System.out.print("nota do bimestre4? ");
            double nota4 = scanner.nextDouble();
            scanner.nextLine();

            double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;

            if (mediaNotas >= 7) {
                System.out.println("Boa, pia! Passar bem.");
            } if (mediaNotas > 5 && mediaNotas < 7) {
                System.out.println("Você está de recuperação. Você quer fazer a recuperação? (sim/não)");
                recuperacao = scanner.nextLine();
                if (recuperacao.equalsIgnoreCase("sim")) {
                    System.out.println("Vamos fazer a recuperação então.");
                } else{
                    System.out.println("Você não passou.");
                }
            } else if (mediaNotas < 5){
                System.out.println("Você não passou.");
            }

            System.out.print("Você quer ver sua media novamente? (sim/não) ");
            MediaNovaMente = scanner.next();

        }while (MediaNovaMente.equalsIgnoreCase("sim"));
        scanner.close();
    }
}
