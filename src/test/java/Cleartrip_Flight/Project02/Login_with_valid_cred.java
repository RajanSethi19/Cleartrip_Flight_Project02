package Cleartrip_Flight.Project02;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login_with_valid_cred extends Launch_Quit{
	
	
	@Test
	public void login() throws InterruptedException {
		
		One_Way_Page o= new One_Way_Page(driver);
		o.crossbuttonmethod();
		Thread.sleep(3000);
		Login_with_valid_page lo= new Login_with_valid_page(driver);
		Thread.sleep(3000);
		lo.loginmethod();
		Thread.sleep(3000);
		lo.phnomethod();
		Thread.sleep(3000);
		WebElement keep_login=driver.findElement(By.xpath("//span[.='Keep me logged in']"));
		Thread.sleep(3000);
		if(keep_login.isDisplayed()) {	
			Assert.assertTrue(true);
			System.out.println("Resend text is present , Testcase Passed");
		}
		
		else {
			Assert.assertTrue(false);
			System.out.println("Resend text is not present , Testcase Failed");	
		}
	}

}
