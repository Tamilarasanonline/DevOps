package com.tamil.iot.apiui.entity;

public class MyEntity {
	
	private String firstName ;
	
	private String lastName;

	/**
	 * 
	 */
	public MyEntity() {
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public MyEntity(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
