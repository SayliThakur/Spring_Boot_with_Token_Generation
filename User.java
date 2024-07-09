package com.springsecurity.springsecurity.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="movieDetails")
public class User 
{

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String sname;
	private Integer tid;
	private String username;
	private String password;
	
	@ElementCollection
	@CollectionTable(name="schedules",
	joinColumns = @JoinColumn(name="id")		
			)
	@Column(name="dateandtime")
	private Set<Date> date;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Set<Date> getDate() {
		return date;
	}

	public void setDate(Set<Date> date) {
		this.date = date;
	}
	
	
}
