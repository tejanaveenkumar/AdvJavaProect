package com.app.bean;

public class Student {
	private int stdId;
	private String stdName; 
	private String stdGen;
	private String stdEmail;
	private String stdContact;
	private String stdQual;
	private String stdAddr;
	public Student() {
		super();
	}
	
	public Student(int stdId) {
		super();
		this.stdId = stdId;
	}
	
	public Student(int stdId, String stdName, String stdGen, String stdEmail, String stdContact, String stdQual,
			String stdAddr) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdGen = stdGen;
		this.stdEmail = stdEmail;
		this.stdContact = stdContact;
		this.stdQual = stdQual;
		this.stdAddr = stdAddr;
	}

	public Student(String stdName, String stdGen, String stdEmail, String stdContact, String stdQual, String stdAddr) {
		super();
		this.stdName = stdName;
		this.stdGen = stdGen;
		this.stdEmail = stdEmail;
		this.stdContact = stdContact;
		this.stdQual = stdQual;
		this.stdAddr = stdAddr;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdGen=" + stdGen + ", stdEmail=" + stdEmail
				+ ", stdContact=" + stdContact + ", stdQual=" + stdQual + ", stdAddr=" + stdAddr + "]";
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdGen() {
		return stdGen;
	}
	public void setStdGen(String stdGen) {
		this.stdGen = stdGen;
	}
	public String getStdEmail() {
		return stdEmail;
	}
	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}
	public String getStdContact() {
		return stdContact;
	}
	public void setStdContact(String stdContact) {
		this.stdContact = stdContact;
	}
	public String getStdQual() {
		return stdQual;
	}
	public void setStdQual(String stdQual) {
		this.stdQual = stdQual;
	}
	public String getStdAddr() {
		return stdAddr;
	}
	public void setStdAddr(String stdAddr) {
		this.stdAddr = stdAddr;
	}
	
	

}


