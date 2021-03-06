package person;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import salary.SalaryCalculator;
import school.Subject;

public class Teacher extends Person{
	
	private Set<Subject> subjects;
	private SalaryCalculator calculator;
	
	public Teacher(int id, String firstName, String lastName, Date birthDate, SalaryCalculator calculator) {
		super(id, firstName, lastName, birthDate);
		this.subjects= new TreeSet<Subject>();
		this.calculator = calculator;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}
	

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public void setNewSubject(Subject subject) {
		this.subjects.add(subject);
	}

	public double getSalary() {
		return calculator.getSalary();
	}
	
	

}
