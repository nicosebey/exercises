package conference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import Person.Person;

public class Meeting implements Comparable<Meeting>{
	
	private Integer id;
	private Date beggingTime;
	private Date endTime; 
	private Set<Person> attendants;
	public Meeting(int id, String beggingTime, String endTime) throws ParseException {
		super();
		this.id = id;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		this.beggingTime = format.parse(beggingTime);
		this.endTime = format.parse(endTime);
		this.attendants = new TreeSet<Person>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getBeggingTime() {
		return beggingTime;
	}
	public void setBeggingTime(Date beggingTime) {
		this.beggingTime = beggingTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Set<Person> getAttendants() {
		return attendants;
	}
	public void setAttendants(Set<Person> attendants) {
		this.attendants = attendants;
	}
	
	public void addAtendant(Person p) {
		attendants.add(p);
	}
	@Override
	public int compareTo(Meeting m) {
		return this.id.compareTo(m.getId());
	}
	public boolean overlap(Meeting newM) {
		return ((newM.getBeggingTime().before(getEndTime()) && newM.getBeggingTime().after(getBeggingTime()))
				|| (newM.getEndTime().before(getEndTime()) && newM.getEndTime().after(getBeggingTime()))
				|| (newM.getBeggingTime().before(getBeggingTime()) && newM.getEndTime().after(getEndTime()))
				|| newM.getBeggingTime().equals(getBeggingTime()) || newM.getEndTime().equals(getEndTime()) ) ;
	}
	
	@Override
    public String toString() {
        return this.id + " from " + this.beggingTime+ " to "+ this.endTime + this.getAttendants() ;
    }
	

}
