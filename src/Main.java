import service.LeitorCSV;
import service.Serializacao;
import service.Desserializacao;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Leitura.ler("lorem.txt");
        LeitorCSV.ler("contas.csv");

        Serializacao.escrever("receita", "Pagamento", 2660.99);
        Desserializacao.ler("receita.bin");
    }
}