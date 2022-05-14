package com.java;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class TestModel implements MobileProcessor {

	public void processor() {
		System.out.println("World Second Best Processor");
		
	}

}
