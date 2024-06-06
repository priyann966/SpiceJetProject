package spicejetFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ValidationOfFileldsSpicejet {
	
	final WebDriver driver;

	public ValidationOfFileldsSpicejet(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[text()='check-in']")
	WebElement checkin;
	
	public void clickCheckIn() {
		checkin.click();
	}
	
	public String validateCheckIn() {
		WebElement d=driver.findElement(By.xpath("//div[text()='Web Check-In']"));
		String check=d.getText();
		return check;
	}
	
	
	@FindBy(how = How.XPATH, using = "//div[text()='flight status']")
	WebElement flightstatus;
	
	public void clickFlightStatus() {
		flightstatus.click();

	}
	
	public String validateFlightStatus() {
		WebElement f=driver.findElement(By.xpath("//div[text()='Flight Status']"));
		String flight=f.getText();
		return flight;

	}
	
	@FindBy(how = How.XPATH, using = "//div[text()='manage booking']")
	WebElement managebooking ;
	
	public void clickManageBooking() {
		managebooking.click();

	}
	
	public String validateManageBooking() {
		WebElement m=driver.findElement(By.xpath("//div[text()='View / Manage Booking']"));
		String manage=m.getText();
		return manage;
	}
}
