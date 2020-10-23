package template.java.spring.IoC;

public class DirectorEmployee implements IEmployee {
	
	//Create variable that will be inserted with injection
	private ICreateReports newReport;
	
	//Create fields that will be injected
		private String email;
		private String companyName;
	
	//Create constrictor
	public DirectorEmployee(ICreateReports newReport) {
		this.newReport = newReport;
	}
		
	@Override
	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
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
	public String getInforme() {
		return "Report created by the director: " + newReport.getInforme();
	}

}
