package service;

import java.io.*;

public class CopiarArquivo {

	public static void copiar(String fileName) throws IOException {
		
//		Socket s = new Socket();		
		InputStream fis = new FileInputStream(fileName);
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = new FileOutputStream("copia.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while( !(linha == null || linha.isEmpty()) ) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
	
		br.close();
		bw.close();
		
	}
}
