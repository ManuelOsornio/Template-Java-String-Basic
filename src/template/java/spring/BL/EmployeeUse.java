package template.java.spring.BL;

import template.java.spring.IoC.BossEmployee;
import template.java.spring.IoC.IEmployee;
import template.java.spring.IoC.SecretaryEmployee;

public class EmployeeUse {

	public static void main(String[] args) {
		//Create objects of Employee type
		
		IEmployee employee1 = new DirectorEmployee();
		
		//Use of the objects created
		
		System.out.println(employee1.getTareas());
	}

}
