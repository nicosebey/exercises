package salary;

public class JanitorSalary implements SalaryCalculator{
	
	Double salary;
	
	public JanitorSalary(Double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public Double getSalary() {
		return salary;
	}

}
