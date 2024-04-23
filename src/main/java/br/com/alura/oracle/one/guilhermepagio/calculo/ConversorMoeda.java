package br.com.alura.oracle.one.guilhermepagio.calculo;

import br.com.alura.oracle.one.guilhermepagio.api.extrator.ExtratorCotacao;

import java.math.BigDecimal;

public class ConversorMoeda {

    private ConversorMoeda () {}

    public static BigDecimal converteMoeda (String moedaBase, BigDecimal quantiadeMoedaBase, String moedaConvertida) {
        return ExtratorCotacao.extraiCotacaoMoedaJsonBody(moedaBase, moedaConvertida).multiply(quantiadeMoedaBase);
    }

}
