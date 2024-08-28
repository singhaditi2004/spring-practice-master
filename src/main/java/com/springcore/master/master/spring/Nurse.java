package com.springcore.master.master.spring;

public class Nurse implements Staff {
	private String nurName;

	public String getNurName() {
		return nurName;
	}

	public void setNurName(String nurName) {
		this.nurName = nurName;
	}

	public void assist() {
		System.out.println("Nurse is Assisting");
	}

}
