package com.example.restfulwebservices.todo;

import java.util.Date;

public class Todo {
	private long id;
	private String userename;
	private String description;
	private Date targetDate;
	private boolean isDone;
	
	protected Todo() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserename() {
		return userename;
	}

	public void setUserename(String userename) {
		this.userename = userename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTargetDate() {
		return targetDate ;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public Todo(long id, String userename, String description, Date date, boolean isDone) {
		super();
		this.id = id;
		this.userename = userename;
		this.description = description;
		this.targetDate = date;
		this.isDone = isDone;
	}
}
