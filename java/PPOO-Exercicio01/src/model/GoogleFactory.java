package model;

import interfaces.EditorApresentacao;
import interfaces.EditorPlanilha;
import interfaces.EditorTexto;
import interfaces.Suite;

public class GoogleFactory implements Suite {

	@Override
	public EditorTexto getEditorTexto() {
		// TODO Auto-generated method stub
		return new GoogleEditorTexto();
	}

	@Override
	public EditorPlanilha getEditorPlanilha() {
		// TODO Auto-generated method stub
		return new GoogleEditorPlanilha();
	}

	@Override
	public EditorApresentacao getEditorApresentacao() {
		// TODO Auto-generated method stub
		return new GoogleEditorApresentacao();
	}

}
