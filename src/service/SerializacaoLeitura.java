package service;

import entities.Receita;

import java.io.*;

public class SerializacaoLeitura {

    public static void ler(String fileName) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            Receita receita = (Receita) ois.readObject();
            ois.close();

            System.out.println(receita);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
