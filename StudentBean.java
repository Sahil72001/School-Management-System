package test;
import java.io.*;
import java.sql.Date;

@SuppressWarnings("serial")
public class StudentBean implements Serializable
{
	public static final Float classDays=200.0F;
	private String sName,sAddress,sMid,sSection,sGender;
	private int sRoll,sClass;
	private static int sAttendance=0;
	private long sContact;
	private Date dob;
	private Float attendancePercent;
	
	public StudentBean() {}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public int getsRoll() {
		return sRoll;
	}

	public void setsRoll(int sRoll) {
		this.sRoll = sRoll;
	}

	public int getsClass() {
		return sClass;
	}

	public void setsClass(int sClass) {
		this.sClass = sClass;
	}

	public String getsSection() {
		return sSection;
	}

	public void setsSection(String sSection) {
		this.sSection = sSection;
	}

	public long getsContact() {
		return sContact;
	}

	public void setsContact(long sContact) {
		this.sContact = sContact;
	}

	public String getsMid() {
		return sMid;
	}

	public void setsMid(String sMid) {
		this.sMid = sMid;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getsGender() {
		return sGender;
	}

	public void setsGender(String sGender) {
		this.sGender = sGender;
	}

	public int getsAttendance() {
		return sAttendance;
	}

	public void setsAttendance(int sAttendance) {
		StudentBean.sAttendance = sAttendance;
	}

	public Float getAttendancePercent() {
		return attendancePercent;
	}

	public void setAttendancePercent(Float attendancePercent) {
		this.attendancePercent = attendancePercent;
	}
	
	
}
