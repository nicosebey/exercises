package salary;

import java.util.Set;

import school.Subject;

public class TeacherSalary implements SalaryCalculator {

	private Set<Subject> subjects;
	
	
	public TeacherSalary(Set<Subject> subjects) {
		super();
		this.subjects = subjects;
	}


	@Override
	public Double getSalary() {
		Double amount = 0.0;
		for(Subject s : subjects ) {
			amount += s.getCost();
		}
		return amount;
	}
	
}
