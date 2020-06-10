package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BestBuyLogin {
	
	
	

//	static WebDriver driver;
////	static String text,s1;
//	
//	@Given("User has to be there in the BestBuy Login Page")
//	public void user_has_to_be_there_in_the_BestBuy_Login_Page() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\SIVA\\eclipse-workspace\\Day1cumer\\driver1\\chromedriver.exe");
//
//		driver = new ChromeDriver();
////		driver.get("https://www.bestbuy.ca/en-ca");
//		driver.get("https://www.bestbuy.ca/identity/en-ca/signin?tid=vptjxnRWJ3ioOLj4OP9AzOxO5Zz0HIc53%252FMxGzCT7aJSkQi%252BbhUBinBYLnjiDT922Sos6yda1vKSBtx41BE9QrE1Xh58jcrkYx%252BKP%252BuDShN9MXx5KtX%252FPSc%252BZtfgfr%252F42kTFcUGqV2VLcK3wAmmCyIGC2oAhMTPhm%252BMwUWY05knpAs5dNrkmNxSWkQGaxuBbLjL8Oze0oSU3qkxaUs7UWOF6QyydpDGurUQUpgkvoRCM55PPL0dUzOXiriI%252Fh1uhqhv2NeWPSsDD4t2Qjuubh2orqxOfLaMQf4kv46aU2Yj62dG3JbVANWJjsuCloA4M");	   
//	}
//
//	@When("User ahs to fill the username and password")
//	public void user_ahs_to_fill_the_username_and_password(io.cucumber.datatable.DataTable dt) throws InterruptedException {
//		
//		Thread.sleep(10000);
//		
//		List<Map<String, String>> mp = dt.asMaps();
//		WebElement text1 = driver.findElement(By.id("email"));
//	    text1.sendKeys(mp.get(0).get("username"));
//	    
//	    driver.findElement(By.id("password")).sendKeys(mp.get(2).get("password"));
//	    
//	}
//
//	@When("User click the login button")
//	public void user_click_the_login_button() {
//		WebElement signinButton = driver.findElement(By.xpath("(//span[text()='Sign In'])[2]"));
//    	signinButton.click();
//	    
//	}
//
//	@Then("Verify user in navigating the login page")
//	public void verify_user_in_navigating_the_login_page() {
//		Assert.assertEquals("https://www.bestbuy.ca/account/en-ca", driver.getCurrentUrl());
//        System.out.println("User able To Login ");
//	}
//	
//	@When("User has to able to click the Create an Account link")
//	public void user_has_to_able_to_click_the_Create_an_Account_link() {
//	    driver.findElement(By.xpath("//span[text()='Create an account']")).click();
//	}
//
//	@When("User has to fill the firstname, lastname,Emailid and password")
//	public void user_has_to_fill_the_firstname_lastname_Emailid_and_password() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.id("firstName")).sendKeys("Gnanasunari");
//	    driver.findElement(By.id("lastName")).sendKeys("Gnanavel");
//	    driver.findElement(By.id("email")).sendKeys("sundari.4g@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("sumdfawe39");
//	}
//
//	@When("User has to able to click the signup button")
//	public void user_has_to_able_to_click_the_signup_button() {
//	   driver.findElement(By.xpath("//span[text()='Create Account']")).click();
//	   
//	}
//
//	@Then("USer can able to create an account successfully")
//	public void user_can_able_to_create_an_account_successfully() {
//		Assert.assertEquals("https://www.bestbuy.ca/account/en-ca", driver.getCurrentUrl());
//        System.out.println("User able To Login ");
//	    
//	}
//	@Given("User has to be there in the BestBuy home Page")
//	public void user_has_to_be_there_in_the_BestBuy_home_Page() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\SIVA\\eclipse-workspace\\Day1cumer\\driver\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.get("https://www.bestbuy.ca/en-ca");
//	   
//	}
//
//	@When("User has to enter the search item in {string} bar")
//	public void user_has_to_enter_the_search_item_in_bar(String s1) {
//	    WebElement searchbar = driver.findElement(By.xpath("//input[@type=\"search\"]"));
//	    searchbar.sendKeys(s1);
//	    
//	    String text = searchbar.getAttribute("value");
//	    System.out.println();
//	    System.out.println(text);
//	}
//
//	@When("User Click the search icon")
//	public void user_Click_the_search_icon() {
//	    WebElement button = driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
//	    button.click();
//	    
//	}
//
//	@Then("Verify the user is navigating into the search page")
//	public void verify_the_user_is_navigating_into_the_search_page() {
//		Assert.assertEquals("verify", s1, text);
//		
//	    
//	}


//	@Given("User has to be there in the BestBuy Login Page")
//	public void user_has_to_be_there_in_the_BestBuy_Login_Page() {
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\SIVA\\eclipse-workspace\\Day1cumer\\driver\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.get(
//				"https://www.bestbuy.ca/identity/en-ca/signin?tid=APn0wI1ii610bB2YExopQ2B5o6EDndut4Q2Tv%252FAMsdM7nvvNZgXno8By1KQdtVEBan0uY9LofgZniXTkApEPiwgFR6mTX7NdAEO9thRo%252B4hdilcp0U%252BL2p65BG5Bs%252B1MmElU3V4%252FYgbTgZrz8o%252FdWB%252F94WkT7lh02Ae2IxFJHcvfNt%252Bshp5xoRD5G%252BEawy2B4GMgGYVGfp81yglVYqBaR9tzLzcjifpsLM3%252FyTq%252F1LG3fC8KxfJoUE%252BtiTWrOHKQoPzlMHsM10BIy%252BROlUwiNXQBPFKhz22iIivJkDxcO7su8LEHR0Z%252F0PdJLuuTmDm6");
//	}
//
//	@When("User has to fill the UserName and Password")
//	public void user_has_to_fill_the_UserName_and_Password() throws InterruptedException {
//	    Thread.sleep(4000);
//		
//		WebElement UserMailid = driver.findElement(By.id("email"));
//		UserMailid.sendKeys("sundari.4g@gmail.com");
//		
//		WebElement UserPswrd = driver.findElement(By.id("password"));
//		UserPswrd.sendKeys("sundari18&");
//	}
//
//	@When("User Click the Login button")
//	public void user_Click_the_Login_button() {
//		
//		WebElement signinButton = driver.findElement(By.xpath("(//span[text()='Sign In'])[2]"));
//		signinButton.click();
//	}
//	
//	@Then("Verify the user is navigating the login page")
//	public void verify_the_user_is_navigating_the_login_page() {
//		Assert.assertEquals("https://www.bestbuy.ca/account/en-ca", driver.getCurrentUrl());
//		
//		System.out.println("User able To Login ");
//	}

}
