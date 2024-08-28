package com.springcore.master.master.spring;

public class Doctor implements Staff {

	private String qual;
	private Nurse nurse;

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}

	public void assist() {
		System.out.println("Assisting");
	}

	public String getQual() {
		return qual;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	@Override
	public String toString() {
		return "Doctor [qual=" + qual + ", nurse=" + nurse + "]";
	}
}
