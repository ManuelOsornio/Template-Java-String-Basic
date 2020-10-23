package template.java.spring.IoC;

public class ReportsCreator implements ICreateReports {

	@Override
	public String getInforme() {
		return "This is the presentation of report";
	}

}
