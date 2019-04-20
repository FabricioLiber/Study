package model;

import interfaces.EditorPlanilha;

public class GoogleEditorPlanilha implements EditorPlanilha {

	@Override
	public void editarArquivo() {
		System.out.println("Editando arquivo com Google Sheets");
	}	
	
}
