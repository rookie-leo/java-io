import service.SerializacaoEscrita;
import service.SerializacaoLeitura;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Leitura.ler("lorem.txt");

        SerializacaoEscrita.escrever("receita2");
        SerializacaoLeitura.ler("receita2.bin");
    }
}