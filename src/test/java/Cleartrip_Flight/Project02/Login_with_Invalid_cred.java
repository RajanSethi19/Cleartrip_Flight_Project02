package Cleartrip_Flight.Project02;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login_with_Invalid_cred extends Launch_Quit {
	
	
	@Test
	public void invalidlogin() throws InterruptedException {
		
		One_Way_Page o= new One_Way_Page(driver);
		o.crossbuttonmethod();
		Thread.sleep(3000);
		Login_with_valid_page lo= new Login_with_valid_page(driver);
		Thread.sleep(3000);
		lo.loginmethod();
		Thread.sleep(3000);
		lo.wrongphnomethod();
		WebElement invalidphno=driver.findElement(By.xpath("(//div[.='Please enter a valid phone number'])[2]"));
		if(invalidphno.isDisplayed()) {	
			Assert.assertTrue(true);
			System.out.println("text is present , Testcase Passed");
		}
		
		else {
			Assert.assertTrue(false);
			System.out.println("text is not present , Testcase Failed");	
		}
	}


}
