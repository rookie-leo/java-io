package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class LeitorCSV {

    public static void ler(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName), "UTF-8");

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                //System.out.println(linha);

                Scanner linhaScanner = new Scanner(linha);
                linhaScanner.useLocale(Locale.US);
                linhaScanner.useDelimiter(",");

                String tipoConta = linhaScanner.next();
                int agencia = linhaScanner.nextInt();
                int numero = linhaScanner.nextInt();
                String titular = linhaScanner.next();
                double saldo = linhaScanner.nextDouble();

                System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f %n",
                        tipoConta, agencia, numero, titular, saldo);

                linhaScanner.close();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
