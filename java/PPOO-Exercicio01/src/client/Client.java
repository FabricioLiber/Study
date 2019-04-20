package client;

import java.util.Scanner;

import builder.ArquivoBuilder;
import factory.EditorFactory;
import factory.SuiteFactory;
import interfaces.Editor;
import model.Arquivo;

public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Opções:
		 * Google Texto | Google Planilha | Google Apresentação
		 * Microsoft Texto | Microsoft Planilha | Microsoft Apresentação
		 * */
		String tipo = scan.nextLine();
		String [] tipoSuiteEditor = tipo.split(" ");
		Editor editor = EditorFactory.get(tipoSuiteEditor[1], SuiteFactory.get(tipoSuiteEditor[0]));
		
		editor.editarArquivo();
		
		ArquivoBuilder arquivoBuilder = new ArquivoBuilder();
		Arquivo arquivo = arquivoBuilder.nome("teste.txt").path("/documents").create();
		
	}
	
}
