package org.PojoClass;

import org.BaseClass.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPojo extends baseClass{
	
	public loginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement Usertext;
	
	@FindBy(id="password")
	private WebElement Passwordtext;
	
	@FindBy(id="login")
	private WebElement ButClick;
	
	@FindBy(id="location")
	private WebElement locat;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	
	@FindBy(id="datepick_out")
	private WebElement checkinout;
	
	@FindBy(id="adult_room")
	private WebElement adultsroom;
	
	@FindBy(id="Submit")
	private WebElement submitbtn;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutn;
	
	@FindBy(id="continue")
	private WebElement countineclick;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardnumber;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement ccnum;
	
	@FindBy(id="book_now")
	private WebElement bookbutton;

	public WebElement getUsertext() {
		return Usertext;
	}

	public WebElement getPasswordtext() {
		return Passwordtext;
	}

	public WebElement getButClick() {
		return ButClick;
	}

	public WebElement getLocat() {
		return locat;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckinout() {
		return checkinout;
	}

	public WebElement getAdultsroom() {
		return adultsroom;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getRadiobutn() {
		return radiobutn;
	}

	public WebElement getCountineclick() {
		return countineclick;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getBookbutton() {
		return bookbutton;
	}

	
	
	
	

}
