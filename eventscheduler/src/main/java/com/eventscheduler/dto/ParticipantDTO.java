package com.eventscheduler.dto;

import java.time.LocalDate;

import com.eventscheduler.entity.Event;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

public class ParticipantDTO {
	private Integer parcipantId;
	
	@NotNull(message = "{participant.name.notpresent}")
	private String name;
	private String emailId;
	private String gender;
	private LocalDate registrationDate;
	
	
	private EventDTO eventDTO;
	
	
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
