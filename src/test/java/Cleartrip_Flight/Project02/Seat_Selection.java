package Cleartrip_Flight.Project02;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Seat_Selection extends Launch_Quit {
	@Test
	public void roundway() throws InterruptedException, AWTException {

		One_Way_Page o = new One_Way_Page(driver);

		Thread.sleep(2000);
		o.crossbuttonmethod();
		o.drpmethod();
		Thread.sleep(2000);
		o.roundwaymethod();
		// o.onewaymethod();
		Thread.sleep(2000);
		o.chooseclasskmethod();
		Thread.sleep(2000);
		o.plusbuttonkmethod();
		Thread.sleep(2000);
		o.premiumclassmethod();
		Thread.sleep(2000);
		o.chooseclasskmethod();
		Thread.sleep(2000);
		o.frommethod();
		Thread.sleep(4000);
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='mr-4']"));
		for (WebElement option : l1) {
			String s = "Chandigarh, IN - Chandigarh (IXC)";
			//String s = "Hyderabad, IN - Rajiv Gandhi International (HYD)";
			if (option.getText().equals(s)) {
				Thread.sleep(3000);
				option.click();
				break;
			}
		}
		o.tomethod();
		Thread.sleep(3000);
		List<WebElement> l2 = driver.findElements(By.xpath("//div[@class='mr-4']"));
		for (WebElement option1 : l2) {
			String s1 = "Pune, IN - Lohegaon (PNQ)";
			if (option1.getText().equals(s1)) {
				Thread.sleep(3000);
				option1.click();
				break;
			}
		}
		Thread.sleep(4000);

		o.datepickermethod();
		Thread.sleep(2000);
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(485,600)");
		Thread.sleep(2000);
		o.onewaydatemethod();
		// o.returndatepickmethod();
		Thread.sleep(2000);
		j1.executeScript("window.scrollBy(856, -400)");
		Thread.sleep(4000);
		// o.returndatepickmethod();
		o.roundwaydatemethod();
		Thread.sleep(2000);
		// o.searchflightmethod();
		Thread.sleep(6000);
		
		
		
		 driver.findElement(By.xpath("(//button[.='Book'])[1]")).click();
		 
		  Set<String> s = driver.getWindowHandles(); 
		  Iterator<String> it =s.iterator(); 
		  String pAarent = it.next();
		  String child = it.next();
		  
		  driver.switchTo().window(child);
		  
		 
		  driver.findElement(By.xpath("//button[.='Continue']")).click();
		  driver.findElement(By.xpath("//button[.='Select seats']")).click();
		  
		  WebElement seat =
		  driver.findElement(By.xpath("(//div[.='Choose the seat you want'])[2]"));
		  boolean b = seat.isDisplayed(); Assert.assertTrue(b);
		 
	}
}
