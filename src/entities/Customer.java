package entities;


import java.util.Calendar;

import Abstract.ICustomerService;
import Abstract.IEntity;

public class Customer implements IEntity {
	
	private int id;
	private String firstName;
	private String lastName;
	private Calendar  dateTime;
	private String nationalityId;
	
	
	
	public Customer(int id, String firstName, String lastName, Calendar dateTime, String nationalityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateTime = dateTime;
		this.nationalityId = nationalityId;
		
	}
	
	
	
	
	
	
	
	
	public int getId() {
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
	public Calendar getDateTime() {
		return dateTime;
	}
	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
}
