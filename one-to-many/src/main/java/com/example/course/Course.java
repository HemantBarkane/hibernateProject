package com.example.course;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.example.subject.Subject;
@Entity
public class Course {
	@Id
	@GeneratedValue
	private int courseId;
	private String courseName;
	@OneToMany
	@JoinColumn(name="courseId")
	@Fetch(FetchMode.SUBSELECT)
	//@BatchSize(size=3)
	private Set<Subject> sub = new HashSet<Subject>();
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseName) {
		super();
		
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Set<Subject> getSub() {
		return sub;
	}
	public void setSub(Set<Subject> sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", sub=" + sub + "]";
	}
	
	
	
	

}
