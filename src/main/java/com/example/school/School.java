package com.example.school;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="school121")
public class School {
	@Id
	@GeneratedValue
	private int sId;
	private String sName;
	public School(String sName) {
		super();
		
		this.sName = sName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "School [sId=" + sId + ", sName=" + sName + "]";
	}
	
}
