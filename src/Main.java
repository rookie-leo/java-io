import entities.Receita;
import service.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Receita> receitas = new ArrayList<>();
        receitas.add(new Receita("Pagamento", BigDecimal.valueOf(2015.99).setScale(2, RoundingMode.HALF_EVEN)));
        receitas.add(new Receita("Pagamento", BigDecimal.valueOf(245.99).setScale(2, RoundingMode.HALF_EVEN)));
        receitas.add(new Receita("Receita aluguel casas", BigDecimal.valueOf(5400.00).setScale(2, RoundingMode.HALF_EVEN)));

        ReceitaCSVGenerator.csvGenerator(receitas);
        LeitorCSVReceita.ler("receita.csv");
    }
}