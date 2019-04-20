package model;

import interfaces.EditorTexto;

public class GoogleEditorTexto implements EditorTexto{

	@Override
	public void editarArquivo() {
		System.out.println("Editando arquivos com Google Docs.");
	}

}
