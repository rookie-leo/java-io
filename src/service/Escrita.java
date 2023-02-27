package service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Escrita {

	public static void escrever(String fileName) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//		bw.newLine();
		bw.newLine();
		bw.write("asfasdfsafdas dfs sdf asf assdß");
				
		bw.close();
		
	}
}
