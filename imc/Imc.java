import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calcularNovamente;
        do {


            System.out.print("Qual é o seu nome? ");
            String nome = scanner.next();
            System.out.print("Quanto você pesa? ");
            double peso = scanner.nextDouble();
            System.out.print("Qual é a sua altura? ");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);

            System.out.printf("O seu IMC é %.2f. ", imc);

            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Você está no peso ideal. Parabéns!!!");
            } else if (imc < 16.9) {
                System.out.println("Você está muito magro!!!");
                System.out.print("Deseja fazer dieta? (sim/não) ");
                scanner.nextLine();
                String dietaParaMuitoMagro = scanner.nextLine();
                if (dietaParaMuitoMagro.equalsIgnoreCase("sim")) {
                    System.out.println("Dieta para ganho de peso.");
                } else {
                    System.out.printf("Tá bom, %s. Boa sorte.\n", nome);
                }
            } else if (imc >= 17 && imc <= 18.4) {
                System.out.println("Você está um pouco abaixo do peso!!!");
                System.out.print("Você quer fazer dieta? (sim/não) ");
                scanner.nextLine();
                String dietaUmPoucoAbaixoDoPeso = scanner.nextLine();
                if (dietaUmPoucoAbaixoDoPeso.equalsIgnoreCase("não")) {
                    System.out.println("Tá bom então.");
                } else if (dietaUmPoucoAbaixoDoPeso.equalsIgnoreCase("sim")) {
                    System.out.printf("%s, você quer fazer dieta para ganho de massa muscular ou somente ganho de peso? ", nome);
                    String opcaoDieta = scanner.nextLine();
                    if (opcaoDieta.equalsIgnoreCase("ganho de peso")) {
                        System.out.println("Dieta para ganho de peso.");
                    } else if (opcaoDieta.equalsIgnoreCase("ganho de massa muscular")) {
                        System.out.println("Dieta para ganho de massa muscular.");
                    } else {
                        System.out.println("Você não escolheu uma opção válida.");
                    }
                } else {
                    System.out.println("Você não escolheu uma opção válida.");
                }
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.println("Você está um pouco acima do peso!!!");
                System.out.print("Você quer fazer dieta? (sim/não) ");
                scanner.nextLine();
                String umPoucoAcimaDoPeso = scanner.nextLine();
                if (umPoucoAcimaDoPeso.equalsIgnoreCase("sim")) {
                    System.out.println("Dieta para emagrecimento.");
                } else if (umPoucoAcimaDoPeso.equalsIgnoreCase("não")) {
                    System.out.println("Tá bom então.");
                } else {
                    System.out.println("Você não escolheu uma opção válida!!!");
                }
            } else if (imc >= 30) {
                System.out.println("Você está um muito acima do peso ideal. Recomenda-se procurar um profissional de saúde.");
            }
            System.out.print("Vc quer calcular o seu Imc denovo? (sim/nao)");
            calcularNovamente = scanner.nextLine();

        }while (calcularNovamente.equalsIgnoreCase("sim"));
        scanner.close();
    }
}