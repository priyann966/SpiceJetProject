package baseSpiceJet;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUpSpiceJet {
	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
//      ChromeOptions opt =new ChromeOptions();
//      opt.addArguments("--headless=new");
//		driver = new ChromeDriver(opt);
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

	}

	@AfterMethod
	public void TearDown() throws IOException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '0.5'");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		// Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		// Path to the location to save screenshot

		FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen" + new Date().getTime() + ".png"));
		System.out.println("Screenshot is captured");
		driver.quit();
		System.out.println("Browser close");
	}

}
