package model;

import interfaces.EditorApresentacao;
import interfaces.EditorPlanilha;
import interfaces.EditorTexto;
import interfaces.Suite;

public class MicrosoftFactory implements Suite {

	@Override
	public EditorTexto getEditorTexto() {
		// TODO Auto-generated method stub
		return new MicrosoftEditorTexto();
	}

	@Override
	public EditorPlanilha getEditorPlanilha() {
		// TODO Auto-generated method stub
		return new MicrosoftEditorPlanilha();
	}

	@Override
	public EditorApresentacao getEditorApresentacao() {
		// TODO Auto-generated method stub
		return new MicrosoftEditorApresentacao();
	}

}
