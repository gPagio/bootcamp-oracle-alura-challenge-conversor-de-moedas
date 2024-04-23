package br.com.alura.oracle.one.guilhermepagio;

import br.com.alura.oracle.one.guilhermepagio.calculo.ConversorMoeda;
import br.com.alura.oracle.one.guilhermepagio.helper.Decodificador;
import br.com.alura.oracle.one.guilhermepagio.util.output.OutputFormater;
import br.com.alura.oracle.one.guilhermepagio.view.Menus;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        int opcao;

        do {
            opcao = Menus.obterOpcoesMenuPrincipal();
            String [] moedas = Decodificador.decodificaMoedasDasOpcaoesDoMenu(opcao);

            if (opcao == 0) {
                break;
            }
            BigDecimal quantidadeMoedaBase = Menus.obterQuantidadeMoedaBase();

            try {
                BigDecimal moedaConvertida = ConversorMoeda.converteMoeda(moedas[0], quantidadeMoedaBase, moedas[1]);
                System.out.println(moedas[0] + " " + OutputFormater.numeroDuasCasasDecimais(quantidadeMoedaBase) + " é equivalente a " + moedas[1] + " " + OutputFormater.numeroDuasCasasDecimais(moedaConvertida));
            } catch (Exception e){
                System.out.println("Deu ruim");
                System.out.println(e.getMessage());
            }
        } while (opcao != 0);
    }
}