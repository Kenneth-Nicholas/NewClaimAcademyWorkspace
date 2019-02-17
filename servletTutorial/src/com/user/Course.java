package com.user;

import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private String professor;
	private ArrayList<WeekDay> weekDays = new ArrayList<WeekDay>();
	private String time;
	private String roomNumber;
	private String startDate;
	
	public Course() {
		
		super();
		
	}

	public Course(String courseName, String professor, ArrayList<WeekDay> weekDays, String time, String roomNumber, String startDate) {
		
		super();
		
		this.courseName = courseName;
		this.professor = professor;
		this.weekDays = weekDays;
		this.time = time;
		this.roomNumber = roomNumber;
		this.startDate = startDate;
		
	}

	public String getCourseName() {
		
		return courseName;
		
	}

	public void setCourseName(String courseName) {
		
		this.courseName = courseName;
		
	}

	public String getProfessor() {
		
		return professor;
		
	}

	public void setProfessor(String professor) {
		
		this.professor = professor;
		
	}

	public ArrayList<WeekDay> getWeekDays() {
		
		return weekDays;
		
	}

	public void setWeekDays(ArrayList<WeekDay> weekDays) {
		
		this.weekDays = weekDays;
		
	}

	public String getTime() {
		
		return time;
		
	}

	public void setTime(String time) {
		
		this.time = time;
		
	}

	public String getRoomNumber() {
		
		return roomNumber;
		
	}

	public void setRoomNumber(String roomNumber) {
		
		this.roomNumber = roomNumber;
		
	}

	public String getStartDate() {
		
		return startDate;
		
	}

	public void setStartDate(String startDate) {
		
		this.startDate = startDate;
		
	}

	@Override
	public String toString() {
		
		return courseName + ", " + professor + ", " + weekDays + ", " + time + ", " + roomNumber + ", " + startDate;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Course other = (Course) obj;
		
		if (courseName == null) {
			
			if (other.courseName != null)
				return false;
			
		} else if (!courseName.equals(other.courseName))
			return false;
		
		if (professor == null) {
			
			if (other.professor != null)
				return false;
			
		} else if (!professor.equals(other.professor))
			return false;
		
		if (roomNumber == null) {
			
			if (other.roomNumber != null)
				return false;
			
		} else if (!roomNumber.equals(other.roomNumber))
			return false;
		
		if (startDate == null) {
			
			if (other.startDate != null)
				return false;
			
		} else if (!startDate.equals(other.startDate))
			return false;
		
		if (time == null) {
			
			if (other.time != null)
				return false;
			
		} else if (!time.equals(other.time))
			return false;
		
		if (weekDays == null) {
			
			if (other.weekDays != null)
				return false;
			
		} else if (!weekDays.equals(other.weekDays))
			
			return false;
		
		return true;
		
	}
		
}