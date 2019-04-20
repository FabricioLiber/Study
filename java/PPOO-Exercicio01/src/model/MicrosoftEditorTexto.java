package model;

import interfaces.EditorTexto;

public class MicrosoftEditorTexto implements EditorTexto {

	@Override
	public void editarArquivo() {
		System.out.println("Editando arquivo com Microsoft Word.");		
	}

}
