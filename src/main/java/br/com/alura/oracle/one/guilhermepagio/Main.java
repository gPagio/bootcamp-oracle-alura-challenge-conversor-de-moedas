package br.com.alura.oracle.one.guilhermepagio;

import br.com.alura.oracle.one.guilhermepagio.calculo.ConversorMoeda;
import br.com.alura.oracle.one.guilhermepagio.view.Menus;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.MIN_VALUE;

        while (opcao != 0){
            String moedaBase = "";
            String moedaConvertida = "";

            opcao = Menus.obterOpcoesMenuPrincipal();

            switch (opcao){
                case 0:
                    break;
                case 1:
                    moedaBase = "BRL";
                    moedaConvertida = "USD";
                    break;
                case 2:
                    moedaBase = "BRL";
                    moedaConvertida = "EUR";
                    break;
                case 3:
                    moedaBase = "BRL";
                    moedaConvertida = "JPY";
                    break;
                case 4:
                    moedaBase = "USD";
                    moedaConvertida = "BRL";
                    break;
                case 5:
                    moedaBase = "USD";
                    moedaConvertida = "EUR";
                    break;
                case 6:
                    moedaBase = "USD";
                    moedaConvertida = "JPY";
                    break;
                case 7:
                    moedaBase = "EUR";
                    moedaConvertida = "BRL";
                    break;
                case 8:
                    moedaBase = "EUR";
                    moedaConvertida = "USD";
                    break;
                case 9:
                    moedaBase = "EUR";
                    moedaConvertida = "JPY";
                    break;
                case 10:
                    moedaBase = "JPY";
                    moedaConvertida = "BRL";
                    break;
                case 11:
                    moedaBase = "JPY";
                    moedaConvertida = "USD";
                    break;
                case 12:
                    moedaBase = "JPY";
                    moedaConvertida = "EUR";
                    break;
                default:
                    break;
            }

            try {
                BigDecimal moeda = ConversorMoeda.converteMoeda(moedaBase, 100, moedaConvertida);
                System.out.println(moeda);
            } catch (Exception e){
                System.out.println("Deu ruim");
                System.out.println(e.getMessage());
            }
        }
    }
}