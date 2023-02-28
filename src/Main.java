import entities.Receita;
import service.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        ReceitaCSVGenerator.csvGenerator(List.of((new Receita("Pagamento", BigDecimal.valueOf(2015.99).setScale(2, RoundingMode.HALF_EVEN)))));
        LeitorCSVReceita.ler("receita.csv");
    }
}