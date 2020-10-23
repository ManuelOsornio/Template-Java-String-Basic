package template.java.spring.IoC;

public class SecretaryEmployee implements IEmployee {

	//Create variable that will be inserted with injection
	private ICreateReports newReport;
	
	public SecretaryEmployee(ICreateReports newReport) {
		this.newReport = newReport;
	}

	@Override
	public String getTareas() {
		return "Gestiona la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		return "Report created by Secretary: " + newReport.getInforme();
	}

}
