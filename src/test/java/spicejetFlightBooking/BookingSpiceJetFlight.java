package spicejetFlightBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookingSpiceJetFlight {
	
	final WebDriver driver;

	public BookingSpiceJetFlight(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class='css-76zvg2 r-homxoj r-1i10wst r-1kfrs79'])[11]")
	WebElement selflight;

	public void clickBySelFlight() {
		selflight.click();
	}
	@FindBy(how = How.XPATH, using = "//div[@data-testid='continue-search-page-cta']")
	WebElement clickcontinue;

	public void clickOnContinue() {
		clickcontinue.click();
	}
	
	

}
