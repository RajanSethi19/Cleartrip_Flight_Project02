package Cleartrip_Flight.Project02;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class One_Way_Page {

	@FindBy(xpath = "//div[@class='px-1   flex flex-middle nmx-1 pb-1']")
	WebElement cross_btn;
	@FindBy(xpath = "(//div[@class='p-relative'])[1]")
	WebElement drp;
	@FindBy(xpath = "//span[.='One way']")
	WebElement oneway;
	@FindBy(xpath = "//input[@placeholder='Where from?']")
	WebElement from;
	@FindBy(xpath = "//input[@placeholder='Where to?']")
	WebElement to;
	@FindBy(xpath = "//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")
	WebElement datepicker_drp;
	@FindBy(xpath = "(//div[contains(@class,'Day-grid')])[28]")
	WebElement oneway_date;
	@FindBy(xpath = "(//div[@class='col flex flex-middle w-100p']//span)[2]")
	WebElement search_flight;
	@FindBy(xpath = "(//div[@class='bg-white br-4 elevation-5 p-1 p-absolute mt-2 z-50 l-0']//li)[2]")
	WebElement roundway;

	@FindBy(xpath = "(//div[contains(@class,'Day-grid')])[49]")
	WebElement roundwaydate;
	@FindBy(xpath = "//div[@class=' c-neutral-500 fs-4 fw-500 flex-nowrap  ml-6']")
	WebElement return_Datepick;

	@FindBy(xpath = "//div[@class='p-relative br-4']")
	WebElement choose_class;
	@FindBy(xpath = "(//li[@class='flex-inline'])[1]")
	WebElement plus_button;
	@FindBy(xpath = "//div[.='Premium economy']")
	WebElement premium_class;

	public void crossbuttonmethod() {

		cross_btn.click();
	}

	public void drpmethod() {

		drp.click();
	}

	public void onewaymethod() {

		oneway.click();
	}

	public void frommethod() {
		
		from.sendKeys("chand" + Keys.ENTER);

		//from.sendKeys("hyd" + Keys.ENTER);
		 

	}

	public void tomethod() {

		to.sendKeys("Pun" + Keys.ENTER);
	}

	public void datepickermethod() {
		datepicker_drp.click();

	}

	public void onewaydatemethod() {
		oneway_date.click();

	}

	public void searchflightmethod() {
		search_flight.click();

	}

	public void roundwaymethod() {
		roundway.click();
	}

	public void roundwaydatemethod() {
		roundwaydate.click();
	}

	public void returndatepickmethod() {
		return_Datepick.click();
	}

	public void chooseclasskmethod() {
		choose_class.click();
	}

	public void plusbuttonkmethod() {
		plus_button.click();
	}

	public void premiumclassmethod() {
		premium_class.click();
	}

	public One_Way_Page(ChromeDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
