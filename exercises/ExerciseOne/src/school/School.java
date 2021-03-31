package school;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

import person.Janitor;
import person.Principal;
import person.Student;
import person.Teacher;
import salary.JanitorSalary;
import salary.PrincipalSalary;
import salary.TeacherSalary;

public class School {
	private Set<Student> students;
	private Set<Teacher> teachers;
	private Janitor janitor;
	private Principal principal;
	
	
	public School(Principal p, Janitor j) {
		this.students = new TreeSet <Student>();
		this.teachers = new TreeSet<Teacher>();
		principal = p;
		janitor = j;
	}
	
	public School() {
		super();
		this.students = new TreeSet <Student>();
		this.teachers = new TreeSet<Teacher>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}


	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}


	public Janitor getJanitor() {
		return janitor;
	}


	public void setJanitor(Janitor janitor) {
		this.janitor = janitor;
	}


	public Principal getPrincipal() {
		return principal;
	}


	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
	public List<Student> getStudentsBySubject(Integer subjectId){
		return students.stream().filter(student -> student.getSubjects() != null && student.getSubjectById(subjectId)!= null).collect(Collectors.toList());
	}
	
	public Map<String, List<Student>> getGroupedStudentsByLetter(){
		Map<String, List<Student>> group = new TreeMap<String, List<Student>>();

		for (Student student : students) {
		    String firstCharacter =  student.getLastName().substring(0,1);
		    
		    if (group.containsKey(firstCharacter)) {
		        group.get(firstCharacter).add(student);
		    } else {
		    	List<Student> list = new ArrayList<Student>();
		        list.add(student);
		        group.put(firstCharacter, list);
		    }
		}
		return group;
	}
	
	
	
	
	public void loadSchool() {
		
		principal = new Principal(1,"principalName","principalLastName", new Date(),new PrincipalSalary(0.1, 100.0, 4));
		janitor = new Janitor(2,"janitorName","janitorLastName", new Date(),new JanitorSalary(20.0));
		
		Subject s1 = new Subject(1, "math", 5.0);
        Subject s2 = new Subject(2, "biology", 11.0);
        Subject s3 = new Subject(3, "history", 3.0);
        Subject s4 = new Subject(4, "philoshopy", 7.0);
        

        Set<Subject> subjectsTeacher1 = new TreeSet<Subject>();
        subjectsTeacher1.add(s1);
        subjectsTeacher1.add(s2);
        subjectsTeacher1.add(s3);
        
        Set<Subject> subjectsTeacher2 = new TreeSet<Subject>();
        subjectsTeacher2.add(s2);
        subjectsTeacher2.add(s3);
        subjectsTeacher2.add(s4);
        
        Set<Subject> subjectsTeacher3 = new TreeSet<Subject>();
        subjectsTeacher3.add(s4);
        subjectsTeacher3.add(s3);
        
        Teacher t1 = new Teacher(3, "jane", "doe", new Date(), new TeacherSalary(subjectsTeacher1));
        Teacher t2 = new Teacher(4, "jhon", "doe", new Date(), new TeacherSalary(subjectsTeacher2));
        Teacher t3 = new Teacher(5, "michael", "jordan", new Date(), new TeacherSalary(subjectsTeacher3));
        
        t1.setSubjects(subjectsTeacher1);
        t2.setSubjects(subjectsTeacher2);
        t3.setSubjects(subjectsTeacher3);
        
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        
        Student st1 = new Student(6, "bart", "simpson", new Date());
        Student st2 = new Student(7, "lisa", "simpson", new Date());
        Student st3 = new Student(8, "milhouse", "van houten", new Date());
        Student st4 = new Student(9, "nelson", "muntz", new Date());
        Student st5 = new Student(10, "tod", "flanders", new Date());
        Student st6 = new Student(11, "rod", "flanders", new Date());
        
        st1.setSubjects(subjectsTeacher1);
        st2.setSubjects(subjectsTeacher2);
        st3.setSubjects(subjectsTeacher2);
        st4.setSubjects(subjectsTeacher3);
        st5.setSubjects(subjectsTeacher3);
        st6.setSubjects(subjectsTeacher1);
      
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        
	}

}
