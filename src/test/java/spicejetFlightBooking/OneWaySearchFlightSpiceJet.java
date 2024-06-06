package spicejetFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OneWaySearchFlightSpiceJet {
	final WebDriver driver;

	public OneWaySearchFlightSpiceJet(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	@FindBy(how = How.XPATH, using = "//div[text()='One Way']")
//	WebElement oneway;
//	public void clickOneway() {		
//		oneway.click();
//	}

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'From')]")
	WebElement from;

	public void clickFrom() {
		from.click();
	}
	public void setFromPlace() {
		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
	}
	
	
	public void setdestinationPlace() {
		
		WebElement d=driver.findElement(By.xpath("//div[text()='Bengaluru']"));
		d.click();

	}


	public void pickDate() {
		driver.findElement(By.xpath("//div[text()='16']")).click();
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passengers;

	public void clickPassengers() {
		passengers.click();
	}


	public void selPassengers() {
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
	}
	

	@FindBy(how = How.XPATH, using = "//div[normalize-space()='Currency']")
	WebElement clickcurrency;

	public void clickCurrency() {
		clickcurrency.click();
	}


	public void selCurrency() {
		driver.findElement(By.xpath("//div[text()='INR']")).click();
	}


	@FindBy(how = How.XPATH, using = "//div[@data-testid='home-page-flight-cta']")
	WebElement searchflights;

	public void searchFlights() {
		searchflights.click();
	}

}
