package com.eventscheduler.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Paricipant {
	
	public Paricipant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Paricipant(Integer parcipantId, String name, String emailId, String gender, LocalDate registrationDate,
			Event event) {
		super();
		this.parcipantId = parcipantId;
		this.name = name;
		this.emailId = emailId;
		this.gender = gender;
		this.registrationDate = registrationDate;
		this.event = event;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer parcipantId;
	private String name;
	private String emailId;
	private String gender;
	private LocalDate registrationDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "event_id")
	private Event event;
	
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public Integer getParcipantId() {
		return parcipantId;
	}
	public void setParcipantId(Integer parcipantId) {
		this.parcipantId = parcipantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	

}
