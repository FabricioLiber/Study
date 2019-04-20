package factory;

import interfaces.Editor;
import interfaces.Suite;

public class EditorFactory {
	
	public static Editor get (String tipo, Suite suite) {
		Editor editor = null;
		if (tipo.equalsIgnoreCase("Texto"))
			editor = suite.getEditorTexto();
		else if (tipo.equalsIgnoreCase("Planilha"))
			editor = suite.getEditorPlanilha();
		else if (tipo.equalsIgnoreCase("Apresentação"))
			editor = suite.getEditorApresentacao();
		return editor;		
	}
	
}
