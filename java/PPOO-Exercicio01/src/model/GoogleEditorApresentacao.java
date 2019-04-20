package model;

import interfaces.EditorApresentacao;

public class GoogleEditorApresentacao implements EditorApresentacao {

	@Override
	public void editarArquivo() {
		System.out.println("Editando com Google Apresentações.");
	}

}
