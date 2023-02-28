package service;

import entities.Receita;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Serializacao {

    public static void escrever(String fileName, String descricao, Double valor) {
        Receita receita = new Receita();
        receita.setDescricao(descricao);
        receita.setValor(BigDecimal.valueOf(valor).setScale(2, RoundingMode.HALF_EVEN));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName+".bin"));
            oos.writeObject(receita);

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
