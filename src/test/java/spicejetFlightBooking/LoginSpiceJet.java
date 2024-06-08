package spicejetFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginSpiceJet {
	final WebDriver driver;

	public LoginSpiceJet(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[text()='Login']")
	WebElement login;

	@FindBy(how = How.XPATH, using = "//div[text()='Email']")
	WebElement clickemail;
	@FindBy(how = How.XPATH, using = "(//input[@type='email'])[1]")
	WebElement enteremail;
	
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//div[text()='LOGIN']")
	WebElement clicklogin;
	
	public void clickLogin() {		
		login.click();
	}
	
	public void clickEmail() {
		clickemail.click();
	}
	
	public void enterEmail(String email_) {
		enteremail.sendKeys( email_);
	}
	
	public void enterPassword(String password_) {
		password.sendKeys(password_);
	}
	
	public void clickOnLogin() {

		Actions actions = new Actions(driver);
		actions.moveToElement(clicklogin).click().perform();		
	}
	public String negativeScenario() {
		WebElement m = driver.findElement(By.xpath("//div[text()='Please enter a valid password']"));
		String act = m.getText();
		return act;

	}

}
