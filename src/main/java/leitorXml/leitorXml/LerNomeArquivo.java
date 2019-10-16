package leitorXml.leitorXml;

import java.util.ArrayList;

public class LerNomeArquivo {

	public static ArrayList<String> lerChaveAcessoProcNFE(String nomeArquivo) {

		String chaveAcesso = nomeArquivo.replaceAll("[^0-9]+", "");
		String ano = (String) chaveAcesso.subSequence(2, 4);
		String mes = (String) chaveAcesso.subSequence(4, 6);
		String cnpj = (String) chaveAcesso.subSequence(6, 20);
		System.out.println("ano: " + ano + " mes: " + mes + " cnpj: " + cnpj);
		ArrayList<String> listaReturn = new ArrayList<String>();
		listaReturn.add(cnpj);
		listaReturn.add(ano);
		listaReturn.add(mes);
		return listaReturn;

	}

	public static ArrayList<String> lerChaveAcessoProcEvento(String nomeArquivo) {
		String chaveAcessoComEvento = nomeArquivo.replaceAll("[^0-9]+", "");
		String chaveAcesso = (String) chaveAcessoComEvento.subSequence(7, chaveAcessoComEvento.length());
		System.out.println(chaveAcesso);
		String ano = (String) chaveAcesso.subSequence(2, 4);
		String mes = (String) chaveAcesso.subSequence(4, 6);
		String cnpj = (String) chaveAcesso.subSequence(6, 20);
		System.out.println("ano: " + ano + " mes: " + mes + " cnpj: " + cnpj);
		ArrayList<String> listaReturn = new ArrayList<String>();
		listaReturn.add(cnpj);
		listaReturn.add(ano);
		listaReturn.add(mes);
		return listaReturn;
	}

}
