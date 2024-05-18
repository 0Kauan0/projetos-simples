import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String jogarDeNovo;
        do {
            System.out.print("\n\n_____________________Pedra Papel Tesoura_____________________\n                       1     2      3 \nEscolha um numero: ");
            byte numeroEscolhido = scanner.nextByte();
            byte pedra = 1;
            byte papel = 2;
            byte tesoura = 3;
            int pc = random.nextInt(3) + 1;
            String resultado;
            if (pc == numeroEscolhido) {
                resultado = "Empate";
            } else if (pc == pedra && numeroEscolhido == papel || pc == tesoura && numeroEscolhido == pedra || pc == papel && numeroEscolhido == tesoura) {
                resultado = "Você ganhou";
            } else {
                resultado = "Você perdeu";
            }

            String escolhaComputador;
            if (pc == pedra) {
                escolhaComputador = "Pedra";
            } else if (pc == papel) {
                escolhaComputador = "Papel";
            } else {
                escolhaComputador = "Tesoura";
            }

            String escolhaUsuario;
            if (numeroEscolhido == pedra) {
                escolhaUsuario = "Pedra";
            } else if (numeroEscolhido == papel) {
                escolhaUsuario = "Papel";
            } else {
                escolhaUsuario = "Tesoura";
            }

            System.out.println("Computador escolheu: " + escolhaComputador);
            System.out.println("Você escolheu: " + escolhaUsuario);
            System.out.println(resultado);
            System.out.print("\nVocê quer jogar de novo? (sim/não): ");
            scanner.nextLine();
            jogarDeNovo = scanner.nextLine();
        } while(jogarDeNovo.equalsIgnoreCase("sim"));

        System.out.println("Obrigado por jogar!");
        scanner.close();
    }
}
