package leitorXml.leitorXml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	lerArquivo.lerArquivo();
    	String path = "c:/arquivos/";
    	System.out.println("Obtendo as notas do diretorio: " + path);
    	List<Object> listaDeNotas = new ArrayList<Object>();
    	File diretorio = new File(path);
    	
    	for (File arquivoEncontrado : diretorio.listFiles()) {
    		String nomeArquivo = arquivoEncontrado.getName();
    		System.out.println("Arquivo encontrado: " + nomeArquivo);
    		try {
				FileInputStream fis = new FileInputStream(arquivoEncontrado);
				System.out.println("teste");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
    	}
    	
    }
}
