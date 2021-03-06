import java.util.List;
import java.util.Map;

import person.Student;
import school.School;

public class Main {

	public static void main(String[] args) {
		School school = new School();
		school.loadSchool();
		
		Map<String, List<Student>> groupedStudents = school.getGroupedStudentsByLetter();
		System.out.println(groupedStudents);
		
		List<Student> studingSubject = school.getStudentsBySubject(1);
		System.out.println(studingSubject);

	}

}
