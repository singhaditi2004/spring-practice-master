package com.springcore.master.master.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;

public class Doctor implements Staff,BeanNameAware {

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

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Set bean name is called");
		
	}
	
	@PostConstruct
	public void postConst() {
		System.out.println("Post constructor is called");
	}
}
