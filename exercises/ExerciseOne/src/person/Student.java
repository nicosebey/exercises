package person;

import java.util.Date;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import school.Subject;

public class Student extends Person{
	private Set<Subject> subjects;
	
	public Student(int id, String firstName, String lastName, Date birthDate) {
		super(id, firstName, lastName, birthDate);
		this.subjects = new TreeSet<Subject>();
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}
	
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public Subject getSubjectById(int id) {
		Optional<Subject>s = subjects.stream().filter(subject -> subject.getSubjectId() == id).findFirst();
		return s.isPresent() ? s.get() : null;
	}

	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
}
