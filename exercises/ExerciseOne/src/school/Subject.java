package school;

public class Subject  implements Comparable<Subject>{
	
	private Integer subjectId;
	private String name;
	private Double cost;
	
	public Subject(Integer subjectId, String name, Double cost){
		this.subjectId = subjectId;
		this.name = name;
		this.cost = cost;
	}

	public Integer getSubjectId() {
		return subjectId;
	}
	

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj) {
		if((obj == null) || ( this.getClass() != obj.getClass())) {
			return false;
		}
		Subject subject = (Subject) obj;
		if (this.subjectId == null) {
			if (subject.getSubjectId() != null)
				return false;
		} else { 
			if (!this.subjectId.equals(subject.getSubjectId()))
				return false;
		}
		return true;
	}
	@Override
	public int compareTo(Subject subject) {
		return this.getSubjectId().compareTo(subject.getSubjectId());
	}
	
	
}
