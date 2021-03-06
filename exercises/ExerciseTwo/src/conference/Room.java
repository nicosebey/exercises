package conference;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import conferenceExceptions.InvalidDurationException;
import conferenceExceptions.RoomOverlapException;

public class Room implements Comparable<Room>{
	
	Integer id;
	private Set<Meeting>meetings;
	
	public Room(int id) {
		this.id = id;
		this.meetings = new TreeSet<Meeting>();
	}
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public void addMeeting(Meeting meeting) throws RoomOverlapException, InvalidDurationException {
		if (validDuration(meeting)) {
			if (meetings.stream().filter(meet -> meet.overlap(meeting)).count() > 0) {
					throw new RoomOverlapException("The meeting "+meeting.getId()+ " overlaps with an existing meeting");
				}
			}
			meetings.add(meeting);
		}

	public boolean validDuration(Meeting meeting) throws InvalidDurationException {
		if (meeting.getBeggingTime() != null && meeting.getEndTime() != null) {
			long interval = meeting.getEndTime().getTime() - meeting.getBeggingTime().getTime();
			long intervalInMins = TimeUnit.MILLISECONDS.toMinutes(interval);
			if(!(intervalInMins >= 15 && intervalInMins <= 180)) {
				throw new InvalidDurationException("the meeting "+meeting.getId()+ " duration time is invalid. It must be more than 15 mins and less than 3 hours");
			}
			return true;
		}
		return false;
	}
	
	@Override
    public String toString() {
        return this.meetings.toString();
    }

	@Override
	public int compareTo(Room r) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(r.getId());
	}
	
}
