import java.text.ParseException;
import java.util.Set;
import java.util.TreeSet;

import conference.Meeting;
import conference.Room;
import conferenceExceptions.InvalidDurationException;
import conferenceExceptions.RoomOverlapException;

public class Main {

	public static void main(String[] args) throws ParseException, RoomOverlapException, InvalidDurationException {
		Set<Room> rooms = new TreeSet<Room>();
		
		          // valid meetings
		Meeting m1 = new Meeting(1,"2021-3-30 20:00","2021-3-30 21:59");
		Meeting m2 = new Meeting(2,"2021-4-30 20:00","2021-4-30 21:59");
		Meeting m3 = new Meeting(3,"2021-5-30 20:00","2021-5-30 21:59");
		          //less than 15 minutes meeting
		//Meeting m4 = new Meeting(4,"2021-6-30 20:00","2021-6-30 20:08");
		          //overlap meeting
		//Meeting m5 = new Meeting(5,"2021-3-30 21:58","2021-3-30 22:59");
		          //more than 3 hours last meeting
		//Meeting m6 = new Meeting(6,"2021-7-30 20:00","2021-7-30 24:59");
		
		Room r1 = new Room(1);
		r1.addMeeting(m1);
		r1.addMeeting(m2);
		r1.addMeeting(m3);
		//r1.addMeeting(m4);
		rooms.add(r1);
		
		Room r2 = new Room(2);
		r2.addMeeting(m1);
		r2.addMeeting(m2);
		r2.addMeeting(m3);
		//r2.addMeeting(m5);
		rooms.add(r2);
		
		Room r3 = new Room(3);
		r3.addMeeting(m1);
		r3.addMeeting(m2);
		r3.addMeeting(m3);
		//r3.addMeeting(m6);
		rooms.add(r3);
		
		System.out.println(rooms);
		
	}

}
