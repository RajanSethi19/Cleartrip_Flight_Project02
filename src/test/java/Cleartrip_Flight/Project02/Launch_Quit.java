package Cleartrip_Flight.Project02;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit {
	public static ChromeDriver driver;

	@BeforeMethod
	public void Launch_Browser() {
		ChromeOptions Ch = new ChromeOptions();
		Ch.addArguments("--disable-notifications");
		Ch.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void Quit_Browser() throws InterruptedException {
		Thread.sleep(5000);
		//driver.quit();
	}
}
