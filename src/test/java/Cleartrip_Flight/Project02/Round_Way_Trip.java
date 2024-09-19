package Cleartrip_Flight.Project02;

import java.awt.AWTException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Round_Way_Trip extends Launch_Quit {

	@Test
	public void roundway() throws InterruptedException, AWTException {

		One_Way_Page o = new One_Way_Page(driver);

		Thread.sleep(2000);
		o.crossbuttonmethod();
		o.drpmethod();
		Thread.sleep(2000);
		Thread.sleep(2000);
		o.roundwaymethod();
		o.frommethod();
		Thread.sleep(3000);
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='mr-4']"));
		for (WebElement option : l1) {
			String s = "Chandigarh, IN - Chandigarh (IXC)";
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
		Thread.sleep(2000);
		o.datepickermethod();
		Thread.sleep(2000);
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(485,600)");
		Thread.sleep(2000);
		o.onewaydatemethod();
		Thread.sleep(2000);
		j1.executeScript("window.scrollBy(856, -400)");
		// return date
		Thread.sleep(4000);
		// o.returndatepickmethod();
		o.roundwaydatemethod();
		Thread.sleep(2000);
		o.searchflightmethod();

		String url = driver.getCurrentUrl();
		if (url.contains("return_date")) {
			Assert.assertTrue(true);
			System.out.println("Reurn way page is visible, Testcase its passed");
		}

		else {
			Assert.assertTrue(false);
			System.out.println("Reurn way page is visible, Testcase its failed");
		}

	}

}
