package com.example.cricketstats.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class cricket {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long  id;
private String name;
private long  T20;
private long  ODI;
private long  Test;


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getT20() {
	return T20;
}
public void setT20(long t20) {
	T20 = t20;
}
public long getODI() {
	return ODI;
}
public void setODI(long oDI) {
	ODI = oDI;
}
public long getTest() {
	return Test;
}
public void setTest(long test) {
	Test = test;
}






}
