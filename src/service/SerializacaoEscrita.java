package service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializacaoEscrita {

    public static void escrever() {
        String nome = "Leonardo Paulino";

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
            oos.writeObject(nome);

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
