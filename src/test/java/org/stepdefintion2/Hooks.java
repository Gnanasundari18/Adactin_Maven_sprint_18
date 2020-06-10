package org.stepdefintion2;

import java.util.Date;

import org.BaseClass.baseClass;
import org.junit.After;
import org.junit.Before;

public class Hooks{ 
	@Before
	public void beforeScenario() {
		System.out.println("Scenario Starts");

	}
	
	@After
	public void afterScenario() {
		System.out.println("Scenario Ends");
	}
	
	@Before
	public void before() {
		System.out.println(new Date());
	}

	@After
	public void after() {
		System.out.println(new Date());
	}
	
//	@Before
//	public void beforeSc() {
//		LanuchBrowser();
//	}
//	
//	@After
//	
	
	
}
