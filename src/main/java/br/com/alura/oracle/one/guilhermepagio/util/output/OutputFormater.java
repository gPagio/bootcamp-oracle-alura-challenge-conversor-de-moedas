package br.com.alura.oracle.one.guilhermepagio.util.output;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class OutputFormater {

    private static DecimalFormat formatoNumeroDuasCasasDecimais = new DecimalFormat("0.00");

    private OutputFormater () {}

    public static String numeroDuasCasasDecimais(BigDecimal d){
        return formatoNumeroDuasCasasDecimais.format(d);
    }
}
