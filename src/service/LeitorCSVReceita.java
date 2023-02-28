package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeitorCSVReceita {

    public static void ler(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName), "UTF-8");

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();

                Scanner linhaScanner = new Scanner(linha);
                linhaScanner.useLocale(Locale.US);
                linhaScanner.useDelimiter(";");

                String descricao = linhaScanner.next();
                Double valor = linhaScanner.nextDouble();
                String data = linhaScanner.next();

                System.out.format(Locale.US, "%s - %.2f %s \n",
                        descricao, valor, data);

                linhaScanner.close();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchElementException e) {
            throw new RuntimeException("O arquivo CSV encontrou ',' e o esperado é ';'");
        }
    }

}
