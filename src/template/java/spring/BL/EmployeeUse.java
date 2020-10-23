package template.java.spring.BL;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import template.java.spring.IoC.BossEmployee;
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
		
		context.close();
		
		
	}

}
