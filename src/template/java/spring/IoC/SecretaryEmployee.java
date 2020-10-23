package template.java.spring.IoC;

public class SecretaryEmployee implements IEmployee {

	@Override
	public String getTareas() {
		return "Gestiona la agenda de los jefes";
	}

}
