package com.serializable;

import java.io.Serializable;

public class Student implements Serializable{

	
	int studId;
	String studName;
	String studClgName;
	int studMob;
	String studAddress;
	String studCity;
	
	public Student(int studId, String studName, String studClgName, int studMob, String studAddress, String studCity) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studClgName = studClgName;
		this.studMob = studMob;
		this.studAddress = studAddress;
		this.studCity = studCity;
	}
	
	
}
