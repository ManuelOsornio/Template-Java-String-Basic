package template.java.spring.BL;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import template.java.spring.IoC.BossEmployee;
import template.java.spring.IoC.DirectorEmployee;
import template.java.spring.IoC.IEmployee;
import template.java.spring.IoC.SecretaryEmployee;

public class EmployeeUse {

	public static void main(String[] args) {
		/*
		//Traditional way to create employees
		
		//Create objects of Employee type
		IEmployee employee1 = new DirectorEmployee();
		
		//Use of the objects created
		System.out.println(employee1.getTareas());
		*/
		
		//Using spring
		//1.- Create context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.- Create the bean
		IEmployee John = context.getBean("myEmployee", IEmployee.class);
		
		System.out.println(John.getTareas());
		System.out.println(John.getInforme());
		
		//Using a specific class for we can use its fields
		
		SecretaryEmployee Mary = context.getBean("mySecretary", SecretaryEmployee.class);
		System.out.println(Mary.getTareas());
		System.out.println(Mary.getInforme());
		System.out.println("The email configured for the secretaries is: " + Mary.getEmail());
		System.out.println("The company asociated to all secretaries is:" + Mary.getCompanyName());
		
		DirectorEmployee Peter = context.getBean("myDirector", DirectorEmployee.class);
		System.out.println(Peter.getTareas());
		System.out.println(Peter.getInforme());
		System.out.println("The email configured for the directors is: " + Peter.getEmail());
		System.out.println("The company asociated to all directors is:" + Peter.getCompanyName());
		
		
		
		
		context.close();
		
		
	}

}
