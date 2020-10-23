package template.java.spring.IoC;

public class DirectorEmployee implements IEmployee {
	
	//Create variable that will be inserted with injection
	private ICreateReports newReport;
	
	//Create constrictor
	public DirectorEmployee(ICreateReports newReport) {
		this.newReport = newReport;
	}
		
	@Override
	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		return "Report created by the director: " + newReport.getInforme();
	}

}
