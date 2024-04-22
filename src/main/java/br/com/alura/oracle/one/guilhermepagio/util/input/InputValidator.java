package br.com.alura.oracle.one.guilhermepagio.util.input;

public class InputValidator {

    private InputValidator (){}

    public static boolean ContemApenasNumerosInteiros(String entrada) {
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
