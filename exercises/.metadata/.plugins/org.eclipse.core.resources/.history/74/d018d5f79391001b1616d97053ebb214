package salary;

public class PrincipalSalary implements SalaryCalculator {
	

	Double bonus;
	Double salary;
	int yearsAsPrincipal;
	
	
	public PrincipalSalary(Double bonus, Double salary, int yearsAsPrincipal) {
		super();
		this.bonus = bonus;
		this.salary = salary;
		this.yearsAsPrincipal = yearsAsPrincipal;
	}

	@Override
	public Double getSalary() {
		return calculateSalary(salary,yearsAsPrincipal,bonus);
	}

	public Double calculateSalary(Double salary, int yearsAsPrincipal, Double bonus) {
		 return salary+(yearsAsPrincipal*bonus);
	}

}
