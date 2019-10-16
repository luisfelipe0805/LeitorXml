package leitorXml.leitorXml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Diretorio {

	public void lerDiretorio(String path) {

		System.out.println("Obtendo as notas do diretorio: " + path);
		File diretorio = new File(path);

		for (File arquivoEncontrado : diretorio.listFiles()) {
			String nomeArquivo = arquivoEncontrado.getName();

			if (nomeArquivo.startsWith("proc-")) {
				try {
					ArrayList<String> chaveAcessoDestrinchada = LerNomeArquivo.lerChaveAcessoProcNFE(nomeArquivo);
					MoveArquivo.moverArquivo(path, nomeArquivo,
							"C:\\Oobj\\Integracao\\Rename\\final" + "\\" + chaveAcessoDestrinchada.get(0) + "\\"
									+ chaveAcessoDestrinchada.get(1) + "\\" + chaveAcessoDestrinchada.get(2));
				} catch (Exception e) {
					System.out.println(e);
					MoveArquivo.moverArquivo(path, nomeArquivo, "C:\\Oobj\\Integracao\\Rename\\erro");
				}
			}
			else {
				try {
					ArrayList<String> chaveAcessoDestrinchada = LerNomeArquivo.lerChaveAcessoProcEvento(nomeArquivo);
					MoveArquivo.moverArquivo(path, nomeArquivo,
							"C:\\Oobj\\Integracao\\Rename\\evento" + "\\" + chaveAcessoDestrinchada.get(0) + "\\"
									+ chaveAcessoDestrinchada.get(1) + "\\" + chaveAcessoDestrinchada.get(2));
				} catch (Exception e) {
					System.out.println(e);
					MoveArquivo.moverArquivo(path, nomeArquivo, "C:\\Oobj\\Integracao\\Rename\\erro");
				}
			}
			
		}
	}

}
