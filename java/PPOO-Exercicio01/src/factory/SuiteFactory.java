package factory;

import interfaces.Suite;
import model.GoogleFactory;
import model.MicrosoftFactory;

public class SuiteFactory {

	private static Suite instancia = null;
	
	public static Suite get (String tipo) {
		Suite suite = null;
		if (instancia == null) {
			if (tipo.equalsIgnoreCase("Google"))
				suite = new GoogleFactory();
			else if (tipo.equalsIgnoreCase("Microsoft"))
				suite = new MicrosoftFactory();
		} else
			suite = instancia;
		return suite;		
	}
	
}
