package org.stepdefinition3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoganAir {
	
	public  static WebDriver driver;
	

	@Given("User has to be there in Home Page.")
	public void user_has_to_be_there_in_Home_Page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIVA\\eclipse-workspace\\Day1cumer\\driver1\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.loganair.co.uk/");
	}
	@When("User has to fill the From, To,Journey Type,Departure Date,Passengers")
	public void user_has_to_fill_the_From_To_Journey_Type_Departure_Date_Passengers() {
	    WebElement fromtext = driver.findElement(By.id("origin"));
	    Select S= new Select(fromtext);
	    S.selectByVisibleText("London City");
	    
	    WebElement Totext = driver.findElement(By.id("destination"));	
	    Select S1=new Select(Totext);
	    S1.selectByVisibleText("Dundee");
	   	    
	    WebElement journeytext = driver.findElement(By.id("journeyType"));
	    Select S2=new Select(journeytext);
	    S2.selectByVisibleText("One-way");
	        
	    WebElement date = driver.findElement(By.id("date-field-Departure date"));
	    
	}

	@When("User Click the Find Flights")
	public void user_Click_the_Find_Flights() {
	   
	}

	@Then("Verify the user is navigating to Search Flights page")
	public void verify_the_user_is_navigating_to_Search_Flights_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@Given("User has to select the flight")
	public void user_has_to_select_the_flight() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User has to select the Cabin as FLY, FLY FLEX, FLY FLEX PLUS")
	public void user_has_to_select_the_Cabin_as_FLY_FLY_FLEX_FLY_FLEX_PLUS() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User has able to click the next")
	public void user_has_able_to_click_the_next() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@Given("User can select the seats")
	public void user_can_select_the_seats() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User has to click the next")
	public void user_has_to_click_the_next() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


	
	@Given("User has to fill the USERNAME , LASTNAME,")
	public void user_has_to_fill_the_USERNAME_LASTNAME() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("PHONE NO, CONTENT EMAIL, VERIFY EMAIL")
	public void phone_NO_CONTENT_EMAIL_VERIFY_EMAIL() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User has to fill the card number, exp month and year")
	public void user_has_to_fill_the_card_number_exp_month_and_year() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User has to fill the security code and address")
	public void user_has_to_fill_the_security_code_and_address() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("To verify the user has to get the alert box")
	public void to_verify_the_user_has_to_get_the_alert_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	
	

	




}
