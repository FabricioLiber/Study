package model;

import interfaces.EditorPlanilha;

public class MicrosoftEditorPlanilha implements EditorPlanilha {

	@Override
	public void editarArquivo() {
		System.out.println("Editando arquivo com Microsoft Excel.");
	}	
	
}