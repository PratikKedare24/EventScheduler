package com.eventscheduler.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Event {
	
	@Id
	private Integer eventId;
	private String name;
	private LocalDate eventDate;
	private String venue;
	private Integer maxCount;
	
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Event(Integer eventId, String name, LocalDate eventDate, String venue, Integer maxCount) {
		super();
		this.eventId = eventId;
		this.name = name;
		this.eventDate = eventDate;
		this.venue = venue;
		this.maxCount = maxCount;
	}

	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Integer getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}
	
	
	
	
	

}
