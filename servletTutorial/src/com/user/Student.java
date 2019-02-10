package com.user;

public class Student {
	
	private String firstName = "";
	private String lastName = "";
	private String email = "";
	private String schoolName = "";
	private String password = "";
	private double gpa;
	private Address address = new Address();
	
	public Student() {
		
		super();
		
	}

	public Student(String firstName, String lastName, String email, String schoolName, String password, double gpa, Address address) {
		
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.schoolName = schoolName;
		this.password = password;
		this.gpa = gpa;
		this.address = address;
		
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

	public String getEmail() {
		
		return email;
		
	}

	public void setEmail(String email) {
		
		this.email = email;
		
	}

	public String getSchoolName() {
		
		return schoolName;
		
	}

	public void setSchoolName(String schoolName) {
		
		this.schoolName = schoolName;
		
	}

	public String getPassword() {
		
		return password;
		
	}

	public void setPassword(String password) {
		
		this.password = password;
		
	}

	public double getGpa() {
		
		return gpa;
		
	}

	public void setGpa(double gpa) {
		
		this.gpa = gpa;
		
	}

	public Address getAddress() {
		
		return address;
		
	}

	public void setAddress(Address address) {
		
		this.address = address;
		
	}

	@Override
	public String toString() {
		
		return firstName + " " + lastName + ", " + email + ", "
				+ schoolName + ", " + password + ", " + gpa;
		
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		
		int result = 1;
		
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		
		long temp;
		
		temp = Double.doubleToLongBits(gpa);
		
		result = prime * result + (int) (temp ^ (temp >>> 32));
		
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		
		result = prime * result + ((schoolName == null) ? 0 : schoolName.hashCode());
		
		return result;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		
		if (email == null) {
			
			if (other.email != null)
				return false;
			
		} else if (!email.equals(other.email))
			return false;
		
		if (firstName == null) {
			
			if (other.firstName != null)
				return false;
			
		} else if (!firstName.equals(other.firstName))
			return false;
		
		if (Double.doubleToLongBits(gpa) != Double.doubleToLongBits(other.gpa))
			return false;
		
		if (lastName == null) {
			
			if (other.lastName != null)
				return false;
			
		} else if (!lastName.equals(other.lastName))
			return false;
		
		if (password == null) {
			
			if (other.password != null)
				return false;
			
		} else if (!password.equals(other.password))
			return false;
		
		if (schoolName == null) {
			
			if (other.schoolName != null)
				return false;
			
		} else if (!schoolName.equals(other.schoolName))
			return false;
		
		return true;
		
	}
		
}
