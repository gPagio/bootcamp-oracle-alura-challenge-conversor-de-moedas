package br.com.alura.oracle.one.guilhermepagio.api.extrator;

import br.com.alura.oracle.one.guilhermepagio.api.network.HttpRequester;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.math.BigDecimal;
import java.net.URI;

public class ExtratorCotacao {

    private ExtratorCotacao(){}

    public static BigDecimal extraiCotacaoMoedaJsonBody(String moedaBase, String moedaConvertida){

        String url = "https://v6.exchangerate-api.com/v6/654b9a7627718f07cffb7901/latest/" + moedaBase;
        URI uri = URI.create(url);
        Gson gson = new Gson();

        try {
            String response =  HttpRequester.disparaRequisicaoget(uri).body();
            JsonObject jsonObjectBody = gson.fromJson(response, JsonObject.class);
            JsonObject jsonObjectConversionRatesKey = jsonObjectBody.getAsJsonObject("conversion_rates");
            return jsonObjectConversionRatesKey.get(moedaConvertida).getAsBigDecimal();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }




        return BigDecimal.valueOf(0);
    }

}
