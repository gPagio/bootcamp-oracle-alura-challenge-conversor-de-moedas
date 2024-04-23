package br.com.alura.oracle.one.guilhermepagio;

import br.com.alura.oracle.one.guilhermepagio.calculo.ConversorMoeda;
import br.com.alura.oracle.one.guilhermepagio.helper.DecodificadorMoeda;
import br.com.alura.oracle.one.guilhermepagio.view.Menus;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.MIN_VALUE;

        while (opcao != 0){
            String moedaBase = "";
            String moedaConvertida = "";

            opcao = Menus.obterOpcoesMenuPrincipal();
            String [] moedas = DecodificadorMoeda.decodifica(opcao);

            try {
                BigDecimal moeda = ConversorMoeda.converteMoeda(moedas[0], 100, moedas[1]);
                System.out.println(moeda);
            } catch (Exception e){
                System.out.println("Deu ruim");
                System.out.println(e.getMessage());
            }
        }
    }
}