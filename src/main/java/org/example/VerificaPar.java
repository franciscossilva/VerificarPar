package org.example;

import java.util.Scanner;

public class VerificaPar {

    public boolean Par(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        VerificaPar verificaPar = new VerificaPar();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = scanner.nextInt();

        if (verificaPar.Par(numeroDigitado)) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número não é par.");
        }

        scanner.close();
    }
}
