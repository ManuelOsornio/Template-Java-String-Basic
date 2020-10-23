package template.java.spring.BL;

import template.java.spring.IoC.IEmployee;

public class DirectorEmployee implements IEmployee {

	@Override
	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
	}

}
