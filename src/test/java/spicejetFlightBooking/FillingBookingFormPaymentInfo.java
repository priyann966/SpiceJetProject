package spicejetFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FillingBookingFormPaymentInfo {

	final WebDriver driver;

	public FillingBookingFormPaymentInfo(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[text()='Mr'][1]")
	WebElement clicktitle;

	public void clickOnTitle() {
		clicktitle.click();
	}

	public void selectTitle() {
		driver.findElement(By.xpath("//div[text()='Mrs']")).click();

	}

	@FindBy(how = How.XPATH, using = "//input[@data-testid='first-inputbox-contact-details']")
	WebElement firstname;

	public void enterFirstname(String first_name) {
		firstname.sendKeys(first_name);
	}

	@FindBy(how = How.XPATH, using = "//input[@data-testid='last-inputbox-contact-details']")
	WebElement lastname;

	public void enterLastname(String last_name) {
		lastname.sendKeys(last_name);
	}

	@FindBy(how = How.XPATH, using = "//input[@data-testid='contact-number-input-box']")
	WebElement mobileno;

	public void enterMobileno(String mobile_no) {
		mobileno.sendKeys(mobile_no);
	}

	@FindBy(how = How.XPATH, using = "//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement email;

	public void enterEmail(String email_) {
		email.sendKeys(email_);
	}

	@FindBy(how = How.XPATH, using = "//input[@data-testid='city-inputbox-contact-details']")
	WebElement city;

	public void enterCity(String city_) {
		city.sendKeys(city_);
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='css-76zvg2 css-bfa6kz r-poiln3 r-ubezar r-j2kj52'][text()='Mr'])[2]")
	WebElement clickpassen1title;

	public void clickOnPassen1Title() {
		clickpassen1title.click();
	}

	@FindBy(how = How.XPATH, using = "//input[@data-testid='traveller-0-first-traveller-info-input-box']")
	WebElement passen1firstname;

	public void enterPassen1Firstname(String passen1first_name) {
		passen1firstname.sendKeys(passen1first_name);
	}

	@FindBy(how = How.XPATH, using = "//input[@data-testid='traveller-0-last-traveller-info-input-box']")
	WebElement passen1lastname;

	public void enterPassen1Lastname(String passen1last_name) {
		passen1lastname.sendKeys(passen1last_name);
	}

	@FindBy(how = How.XPATH, using = "//input[@data-testid='sc-member-mobile-number-input-box']")
	WebElement passen1mobileno;

	public void enterPassen1Mobileno(String passen1mobile_no) {
		passen1mobileno.sendKeys(passen1mobile_no);
	}
	/*
	 * @FindBy(how = How.XPATH, using = "//div[text()='Next']") WebElement
	 * clicknext;
	 * 
	 * public void clickNext() { clicknext.click(); }
	 * 
	 * 
	 * @FindBy(how = How.XPATH, using =
	 * "//input[@data-testid='traveller-1-first-traveller-info-input-box']")
	 * WebElement passen2firstname;
	 * 
	 * public void enterPassen2Firstname(String passen2first_name) {
	 * passen2firstname.sendKeys(passen2first_name); }
	 * 
	 * @FindBy(how = How.XPATH, using =
	 * "//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	 * WebElement passen2lastname;
	 * 
	 * public void enterPassen2Lastname(String passen2last_name) {
	 * passen2lastname.sendKeys(passen2last_name); }
	 * 
	 * @FindBy(how = How.XPATH, using =
	 * "//input[@data-testid='sc-member-mobile-number-input-box']") WebElement
	 * passen2mobileno;
	 * 
	 * public void enterPassen2Mobileno(String passen2mobile_no) {
	 * passen2mobileno.sendKeys(passen2mobile_no); }
	 */

	@FindBy(how = How.XPATH, using = "//div[@data-testid='traveller-info-continue-cta']")
	WebElement clickcontinue;

	public void clickContinue() {
		clickcontinue.click();
	}

	@FindBy(how = How.XPATH, using = "//div[@data-testid=\"add-ons-continue-footer-button\"][3]")
	WebElement continuetopayment;

	public void continueToPayment() {
		continuetopayment.click();

	}

	@FindBy(how = How.XPATH, using = "//span[text()='Skip this to skip comfort.']")
	WebElement skipcomfort;

	public void skipComfort() {
		skipcomfort.click();

	}

	public void switchToIframe() {
		WebElement iframeelement = driver.findElement(By.className("card_number_iframe"));
		driver.switchTo().frame(iframeelement);

	}

	public void switchToNameIframe() {
		driver.switchTo().defaultContent();
		WebElement iframename = driver.findElement(By.className("name_on_card_iframe"));
		driver.switchTo().frame(iframename);

	}

	@FindBy(how = How.ID, using = "card_number")
	WebElement cardno;

	public void enterCardNo(String Card_no) {
		cardno.sendKeys(Card_no);

	}

	@FindBy(how = How.ID, using = "name_on_card")
	WebElement cardname;

	public void enterCardName(String Card_name) {
		cardname.sendKeys(Card_name);

	}

	public void switchToMonthIframe() {
		driver.switchTo().defaultContent();
		WebElement iframemonth = driver.findElement(By.className("card_exp_month_iframe"));
		driver.switchTo().frame(iframemonth);

	}

	@FindBy(how = How.ID, using = "card_exp_month")
	WebElement cardexpmonth;

	public void enterCardExpMonth(String Card_expmonth) {
		cardexpmonth.sendKeys(Card_expmonth);

	}

	public void switchToYearIframe() {
		driver.switchTo().defaultContent();
		WebElement iframeyear = driver.findElement(By.className("card_exp_year_iframe"));
		driver.switchTo().frame(iframeyear);

	}

	@FindBy(how = How.ID, using = "card_exp_year")
	WebElement cardexpyear;

	public void enterCardExpYear(String Card_expyear) {
		cardexpyear.sendKeys(Card_expyear);

	}

	public void switchToSecCodeIframe() {
		driver.switchTo().defaultContent();
		WebElement iframecode = driver.findElement(By.className("security_code_iframe"));
		driver.switchTo().frame(iframecode);

	}

	@FindBy(how = How.ID, using = "security_code")
	WebElement cardseccode;

	public void enterSecurityCode(String Card_code) {
		cardseccode.sendKeys(Card_code);

	}

	public void clickProceedToPay() {
		driver.switchTo().defaultContent();
		WebElement proccedtopay = driver.findElement(By.xpath("//div[@data-testid='common-proceed-to-pay']"));
		proccedtopay.click();

	}

	public String errorvalidation() {
		WebElement m = driver.findElement(By.xpath("//div[text()='Invalid Card Details']"));
		String act = m.getText();
		return act;

	}

}