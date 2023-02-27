package service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Leitura {

	public static void ler(String fileName) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		br.lines().forEach(linha -> System.out.println(linha));
	
		br.close();
		
	}
}
