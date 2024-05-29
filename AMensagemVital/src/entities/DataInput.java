package entities;

import java.util.Scanner;

public class DataInput {
    private static Scanner scanner;
    public DataInput(){
        this.scanner = new Scanner(System.in);
    }

    public void data(){
        System.out.print("Escolha o seu nivel: ");
        int nivel = scanner.nextInt();
        JogoAdivinhacao.dificuldade(nivel);
        JogoAdivinhacao.mensagemSecreta(nivel);
    }
}
