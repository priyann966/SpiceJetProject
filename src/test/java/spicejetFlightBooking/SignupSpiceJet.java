package spicejetFlightBooking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupSpiceJet {
final WebDriver driver;
	
	public SignupSpiceJet(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[text()='Signup']")
	 WebElement signup;
	
	@FindBy(how = How.CSS, using = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2)")
	 WebElement title;
	
	
	@FindBy(how = How.ID, using = "first_name")
	 WebElement firstname;
	
	@FindBy(how = How.ID, using = "last_name")
	 WebElement lastname;
	
	@FindBy(how = How.XPATH, using = "(//select[@class='form-control form-select'])[1]")
	 WebElement country;
	
	
	@FindBy(how = How.XPATH, using = "//img[@alt='date']")
	 WebElement DOB;
	
	@FindBy(how = How.XPATH, using = "//select[@class='react-datepicker__month-select']")
	 WebElement month;
	
	
	@FindBy(how = How.XPATH, using = "//select[@class='react-datepicker__year-select']")
	 WebElement year;

	@FindBy(how = How.XPATH, using = "//div[contains(@aria-label,'Choose Tuesday, April 14th, 1998')]")
	 WebElement date;
	
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='+91 01234 56789']")
	 WebElement mobileno;
	
	@FindBy(how = How.ID, using = "email_id")
	 WebElement email;
	
	@FindBy(how = How.ID, using = "new-password")
	 WebElement password;
	
	@FindBy(how = How.ID, using = "c-password")
	 WebElement confirmpassword;
	
//	@FindBy(how = How.XPATH, using = "(//input[@id='defaultCheck1'])[1]")	 
//	WebElement checkbox;
//	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Submit']")
	 WebElement submit;
	
	public void signUp() {
		signup.click();
	}
	public void switchToNewWindow() {
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	}
	
	public void selectTitle() {
		title.click();
		Select selobj = new Select(title);
		selobj.selectByValue("MR");
	}
	
	
	public void firstName(String first_name) {
		firstname.sendKeys(first_name);
	}
	public void lastName(String last_name) {
		lastname.sendKeys(last_name);
	}
	
	public void selectCountry() {
		country.click();
		Select selobj = new Select(country);
		selobj.selectByValue("IN");
	}
	
	public void selectDateOfBirth()  {
		DOB.click();
		month.click();
		Select selobj = new Select(month);
		selobj.selectByValue("3");
		year.click();
		Select selobj1 = new Select(year);
		selobj1.selectByValue("1998");
		date.click();	

	}
	
	public void mobileNo(String mobile_no) {
		
		mobileno.sendKeys(mobile_no);
	}
	public void enterEmail(String email_) {		
		email.sendKeys(email_);
	}

	public void enterPassword(String password_) {
		password.sendKeys(password_);
	}
	public void confirmPassword(String confirm_password) {
		confirmpassword.sendKeys(confirm_password);
	}
	public void clickCheckbox() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("(//input[@id='defaultCheck1'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);
		element.click();
	}
	public void clickSubmit() {

		submit.click();
	}
	
	public String negativeSceValidation() {
		WebElement m = driver.findElement(By.xpath("//div[text()='Please enter valid mobile number']"));
		String f = m.getText();
		return f;

	}
	
	public String negativeSce1Validation() {
		WebElement m1 = driver.findElement(By.xpath("//div[text()='Please enter minimum 2 characters']"));
		String f1 = m1.getText();
		return f1;

	}
	
}
