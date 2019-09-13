package leitorXml.leitorXml;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lerArquivo {
	public static void lerArquivo() {
		BufferedReader br=null;
    	try {
			 br = new BufferedReader(new FileReader("c:/arquivo.xml")); 
    	} catch (FileNotFoundException e) {
			System.out.println("Falha na leitura do arquivo");
			System.out.println(e);
		}
    	
    	try {
			while(br.ready()){
				String linha = br.readLine();
				System.out.println(linha);
				}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
