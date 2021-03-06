package person;

import java.util.Date;

public abstract class Person implements Comparable<Person> {
	private Integer id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	
	public Person(int id, String firstName, String lastName, Date birthDate){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public int compareTo(Person p) {
		return this.getId().compareTo(p.getId());
	}

	@Override
    public String toString() {
        return this.lastName + " " + this.firstName;
    }
	
	
}
