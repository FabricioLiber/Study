package model;

import interfaces.EditorApresentacao;

public class MicrosoftEditorApresentacao implements EditorApresentacao {

	@Override
	public void editarArquivo() {
		System.out.println("Editando com Microsoft Powerpoint.");
	}

}