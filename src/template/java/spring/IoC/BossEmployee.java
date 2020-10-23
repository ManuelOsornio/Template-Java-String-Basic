package template.java.spring.IoC;

public class BossEmployee implements IEmployee{

	//Create variable that will be inserted with injection
	private ICreateReports newReport;
	
	public BossEmployee(ICreateReports newReport) {
		this.newReport = newReport;
	}

	public String getTareas() {
		return "gestiono las cuestiones relativas a mis empleados";
	}

	@Override
	public String getInforme() {
		return "Report created by the boss: " + newReport.getInforme();
	}
}
