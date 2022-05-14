package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);
		Redmi rd=cxt.getBean(Redmi.class);
         rd.redmifun();
	}

}
