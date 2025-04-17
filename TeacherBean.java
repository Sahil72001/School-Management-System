package test;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class TeacherBean implements Serializable
{
	private String tName,tSubjects,tAddress,tMid,tGender;
	private int tId;
	private float tSalary;
	private long tContact;
	private Date dob;
	
	public TeacherBean() {}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettSubjects() {
		return tSubjects;
	}

	public void settSubjects(String tSubjects) {
		this.tSubjects = tSubjects;
	}

	public String gettAddress() {
		return tAddress;
	}

	public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}

	public String gettMid() {
		return tMid;
	}

	public void settMid(String tMid) {
		this.tMid = tMid;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public float gettSalary() {
		return tSalary;
	}

	public void settSalary(float tSalary) {
		this.tSalary = tSalary;
	}

	public long gettContact() {
		return tContact;
	}

	public void settContact(long tContact) {
		this.tContact = tContact;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String gettGender() {
		return tGender;
	}

	public void settGender(String tGender) {
		this.tGender = tGender;
	}
	
	
}
