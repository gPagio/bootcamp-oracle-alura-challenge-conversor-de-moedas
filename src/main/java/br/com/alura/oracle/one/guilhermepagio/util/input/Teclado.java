package br.com.alura.oracle.one.guilhermepagio.util.input;

import java.util.Scanner;

public class Teclado {

    private static Scanner scanner = new Scanner(System.in);

    private Teclado(){}

    public static int CapturaInteiroDigitado() {
        String entrada;
        int quantidadeTentativas = 0;

        do {
            quantidadeTentativas++;

            if (quantidadeTentativas > 1) {
                System.out.println("Insira apenas números inteiros!");
            }

            System.out.print("Digite aqui >>> ");
            entrada = scanner.nextLine();
            System.out.println(" ");
        } while (!InputValidator.ContemApenasNumerosInteiros(entrada));

        return Integer.parseInt(entrada);
    }

}
