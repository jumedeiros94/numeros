package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ConversaoDataHora {
    public static void main(String[] args) {
        long valorInteiro = 1693225566;

        Date data = new Date(valorInteiro * 1000L);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

        String dataFormatada = sdf.format(data);

        System.out.println("Entrada: " + valorInteiro);
        System.out.println("Saída: " + dataFormatada);
    }
}
