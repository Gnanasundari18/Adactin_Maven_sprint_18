package org.stepdefintion2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.BaseClass.baseClass;
import org.PojoClass.loginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Adactin extends baseClass {

	@Given("User to be there in Adactin login page")
	public void user_to_be_there_in_Adactin_login_page() {
	LanuchBrowser();
		loadURl("http://adactinhotelapp.com/");
	}
	
	
	@When("User has to fill the {string} and {string}")
	public void user_has_to_fill_the_and(String username, String password) {
		
		loginPojo l=new loginPojo();
		fill(l.getUsertext(),username);
		fill(l.getPasswordtext(), password);
	}

	@When("User has to click the Login button")
	public void user_has_to_click_the_Login_button() {
		loginPojo l1=new loginPojo();
		btnClick(l1.getButClick());
	}
	
	@When("User has to select the Location Field")
	public void user_has_to_select_the_Location_Field() {
		WebElement locat = driver.findElement(By.id("location"));
		Select s = new Select(locat);
		s.selectByVisibleText("New York");
	}

	@When("User has to select the Hotels")
	public void user_has_to_select_the_Hotels() {
		loginPojo l3=new loginPojo();
		fill(l3.getHotel(),"Hotel Sunshine");
	
	}

	@When("User has to select the Roomtype")
	public void user_has_to_select_the_Roomtype() throws AWTException {
		loginPojo l4=new loginPojo();
		btnClick(l4.getRoomtype());
		
		Robot r = new Robot();
		for (int i = 1; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("User has to select the Number of rooms")
	public void user_has_to_select_the_Number_of_rooms() throws AWTException {
		loginPojo l5=new loginPojo();
		btnClick(l5.getRoomnos());
		
		Robot r = new Robot();
		for (int i = 1; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
	@When("User has to choose the check in Date")
	public void user_has_to_choose_the_check_in_Date() {
		loginPojo l6=new loginPojo();
		fill(l6.getCheckindate(), "14/06/2020");
	}
	
	
	@When("User has to choose the Check out Date")
	public void user_has_to_choose_the_Check_out_Date() {
		loginPojo l7=new loginPojo();
		fill(l7.getCheckinout(), "14/06/2020");
	
	}

	@When("User has to fill the Select hotel page")
	public void user_has_to_Select_the_Adults_per_room() throws InterruptedException {
		loginPojo l8=new loginPojo();
		fill(l8.getAdultsroom(),"2");

		loginPojo l9=new loginPojo();
		btnClick(l9.getSubmitbtn());
		
		loginPojo l10=new loginPojo();
		btnClick(l10.getRadiobutn());
		
		loginPojo l11=new loginPojo();
		btnClick(l11.getCountineclick());
		
	}
	
	@When("User has to fill the Book a hotel page")
	public void user_has_to_fill_the_Book_a_hotel_page() throws InterruptedException {
		Thread.sleep(4000);
		
		loginPojo l12=new loginPojo();
		fill(l12.getFirstname(), "Gnanasundari");
	
		loginPojo l13=new loginPojo();
		fill(l13.getLastname(), "Gnanavel");

		loginPojo l14=new loginPojo();
		fill(l14.getAddress(), "ABC Street, XYZ Town, Londan");

		loginPojo l15=new loginPojo();
		fill(l15.getCardnumber(), "2345 0987 4335 7280");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s=new Select(cardtype);
		s.selectByValue("VISA");
		
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select s1=new Select(expmonth);
		s1.selectByValue("11");
		
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select s2=new Select(expyear);
		s2.selectByIndex(5);
		
		loginPojo l16=new loginPojo();
		fill(l16.getCcnum(), "345");
		
		loginPojo l17=new loginPojo();
		btnClick(l17.getBookbutton());
	}

	
	@Then("Verify user is able to print the orderno")
	public void verify_user_is_able_to_print_the_orderno() throws InterruptedException {
		Thread.sleep(10000);
		WebElement orderno = driver.findElement(By.id("order_no"));
		String text = orderno.getAttribute("value");
		System.out.println();
		System.out.println("Generated Order No: "+ text);
		System.out.println();
	    
	}

	
	
}


	