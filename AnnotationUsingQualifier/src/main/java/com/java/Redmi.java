package com.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Redmi {
	@Autowired
	@Qualifier("testModel")
	 private MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	 
	 public void redmifun()
	 {
		 if(cpu!=null)
		 {
			 cpu.processor();
		 }
	 }
	

	
	

}
