package Cleartrip_Flight.Project02;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_with_valid_page {

	@FindBy(xpath = "//button[.='Log in / Sign up']")
	WebElement login;
	@FindBy(xpath = "//input[@placeholder='Enter mobile number']")
	WebElement phno;
	
	

	public void loginmethod() {
		login.click();
	}
	
	public void phnomethod() {
		phno.sendKeys("9996464204"+Keys.ENTER);
	}
	public void wrongphnomethod() {
		phno.sendKeys("999646420"+Keys.ENTER);
	}

	
	
	
	
	
	
	
	Login_with_valid_page(ChromeDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
