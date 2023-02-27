package service;

import java.io.*;

public class SerializacaoLeitura {

    public static void ler() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
            String nome = (String) ois.readObject();
            ois.close();

            System.out.println(nome);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
