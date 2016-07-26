package com.tejas.springrest.api;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
	 private final Logger slf4jLogger = LoggerFactory.getLogger(Calculator.class);
	public int add(int a, int b){
		System.out.println("sdfkjhsdf");
		slf4jLogger.info("addition of"+a+"and"+b);
		return a+b;
	}
	public int sub(int a, int b){
		System.out.println("sdfkjhsdf");
		slf4jLogger.info("subtraction of"+a+"and"+b);
		return a-b;
	}

}
