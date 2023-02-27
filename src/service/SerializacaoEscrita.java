package service;

import entities.Receita;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class SerializacaoEscrita {

    public static void escrever(String fileName) {
        Receita receita = new Receita();
        receita.setDescricao("Pagamento");
        receita.setValor(new BigDecimal(2015.09));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName+".bin"));
            oos.writeObject(receita);

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
