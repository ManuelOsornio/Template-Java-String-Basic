package template.java.spring.IoC;

public class SecretaryEmployee implements IEmployee {

	//Create variable that will be inserted with injection
	private ICreateReports newReport;
	
	//Create fields that will be injected
	private String email;
	private String companyName;
	
	public SecretaryEmployee(ICreateReports newReport) {
		this.newReport = newReport;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
