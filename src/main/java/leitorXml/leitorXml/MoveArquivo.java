package leitorXml.leitorXml;

import java.io.File;

public class MoveArquivo {

	public static void main(String[] args) {

		// Arquivo a ser movido
		File arquivo = new File("C:\\Oobj\\Integracao\\Rename\\inicial\\01");

		if (!arquivo.exists()) {
			System.out.println("Arquivo não encontrado");
		} else {

			// Diretorio de destino
			File diretorioDestino = new File("C:\\Oobj\\Integracao\\Rename\\teste");

			// Move o arquivo para o novo diretorio
			boolean sucesso = arquivo.renameTo(new File(diretorioDestino, arquivo.getName()));
			if (sucesso) {
				System.out.println("Arquivo movido para '" + diretorioDestino.getAbsolutePath() + "'");
			} else {
				System.out.println("Erro ao mover arquivo '" + arquivo.getAbsolutePath() + "' para '"
						+ diretorioDestino.getAbsolutePath() + "'");
			}
		}
	}
	/**
	 * Move arquivos com nome proc-(chave_acesso) e procEvento-(tipoevento)(01)(chave_acesso) para um diretorio
	 * dividindo por cnpj emitente, ano e mes.
	 * @param pathInicial
	 * @param arquivoNome
	 * @param pathFinal
	 */
	public static void moverArquivo(String pathInicial, String arquivoNome,String pathFinal) {
		// Arquivo a ser movido
		File arquivo = new File(pathInicial + "\\" + arquivoNome);

		if (!arquivo.exists()) {
			System.out.println("Arquivo não encontrado");
		} else {

			// Diretorio de destino
			File diretorioDestino = new File(pathFinal);
//			File diretorioDestino = new File("C:\\Oobj\\Integracao\\Rename\\final");

			//Verifica se o diretorio existe
			if(!diretorioDestino.exists()) {
				diretorioDestino.mkdirs();
			}else {
				System.out.println("Diretorio Encontrado");
			}
			
			
			// Move o arquivo para o novo diretorio
			boolean sucesso = arquivo.renameTo(new File(diretorioDestino, arquivo.getName()));
			if (sucesso) {
				System.out.println("Arquivo movido para '" + diretorioDestino.getAbsolutePath() + "'");
			} else {
				System.out.println("Erro ao mover arquivo '" + arquivo.getAbsolutePath() + "' para '"
						+ diretorioDestino.getAbsolutePath() + "'");
				
			}
		}

	}

	public static void moverDiretorio(String pathInicial,String pathFinal) {
		// Diretorio a ser movido
//				File arquivo = new File("C:\\Oobj\\Integracao\\Rename\\inicial\\01");
				File arquivo = new File(pathInicial);
				System.out.println("Movendo"+pathInicial);
				if (!arquivo.exists()) {
					System.out.println("Diretorio não encontrado");
				} else {

					// Diretorio de destino
//					File diretorioDestino = new File("C:\\Oobj\\Integracao\\Rename\\teste");
					File diretorioDestino = new File(pathFinal);

					// Move o arquivo para o novo diretorio
					boolean sucesso = arquivo.renameTo(new File(diretorioDestino, arquivo.getName()));
					if (sucesso) {
						System.out.println("Arquivo movido para '" + diretorioDestino.getAbsolutePath() + "'");
					} else {
						System.out.println("Erro ao mover arquivo '" + arquivo.getAbsolutePath() + "' para '"
								+ diretorioDestino.getAbsolutePath() + "'");
					}
				}
	}
}
