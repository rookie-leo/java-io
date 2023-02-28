package service;

import entities.Receita;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class ReceitaCSVGenerator {

    private static String toCSV(Receita receita) {
        return String.format("%s;%s;%s", receita.getDescricao(), receita.getValor(), receita.getDataEntrada());
    }

    public static void csvGenerator(List<Receita> receitas) {
        try {
            FileOutputStream fos = new FileOutputStream("receita.csv");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            receitas.forEach(receita -> {
                try {
                    String str = toCSV(receita);
                    bw.write(str);
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
