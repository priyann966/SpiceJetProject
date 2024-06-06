package spicejetFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RoundTripSearchSpiceJet {
	
	final WebDriver driver;

	public RoundTripSearchSpiceJet(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//div[text()='round trip']")
	WebElement clickroundtrip;
	
	public void selRoundTrip() {
		clickroundtrip.click();
	}
	
	public void roundTripPickDate() {
		driver.findElement(By.xpath("//div[text()='16']")).click();
		driver.findElement(By.xpath("//div[text()='18']")).click();
	}
	
	

}
