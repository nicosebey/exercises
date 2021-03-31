package person;

import java.util.Date;

import salary.SalaryCalculator;

public class Janitor extends Person{
	
	private SalaryCalculator calculator;
	
	public Janitor(int id, String firstName, String lastName, Date birthDate, SalaryCalculator calculator) {
		super(id, firstName, lastName, birthDate);
		this.calculator = calculator;
	}

	
	public double getSalary() {
		return calculator.getSalary();
	}

}
