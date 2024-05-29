package entities;

import java.io.PrintStream;
import java.util.Random;

public class JogoAdivinhacao {
    static Random random = new Random();

    public static void dificuldade(int nivel){
        try {
            if (nivel < 10){
                System.out.println("Boa");
            }
        }catch (Exception e) {
            System.out.print("Nao pode numeros maior que 10!!!");
        }
    }

    public static String mensagemSecreta(int nivel) {

        int i = 0;
        String mensagemSecretaV = "";
        while (nivel > i) {
            int numeroSorteado = random.nextInt(25) + 65;
            char letra = (char) numeroSorteado;
            mensagemSecretaV = mensagemSecretaV + letra;
            i++;
        }
        return mensagemSecretaV;
    }
}
