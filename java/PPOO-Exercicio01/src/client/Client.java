package client;

import java.util.Scanner;

import factory.EditorFactory;
import factory.SuiteFactory;
import interfaces.Editor;

public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tipo = scan.nextLine();
		String [] tipoSuiteEditor = tipo.split(" ");
		Editor editor = EditorFactory.get(tipoSuiteEditor[1], SuiteFactory.get(tipoSuiteEditor[0]));
		
		editor.editarArquivo();
		
	}
	
}
