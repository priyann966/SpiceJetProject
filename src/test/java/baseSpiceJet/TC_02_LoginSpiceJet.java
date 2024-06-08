package baseSpiceJet;

import org.testng.Assert;
import org.testng.annotations.Test;

import spicejetFlightBooking.LoginSpiceJet;

public class TC_02_LoginSpiceJet extends SetUpSpiceJet {
	@Test(priority=2)
	public void testLoginSpicsJet() throws InterruptedException {
		
		
		LoginSpiceJet login=new LoginSpiceJet(driver);
		login.clickLogin();
		login.clickEmail();
		
		login.enterEmail("cekewej120@acuxi.com");
		login.enterPassword("");
		login.clickOnLogin();
		String exp="Please enter a valid password";
		try {
		      Assert.assertEquals(exp, login.negativeScenario());
		} catch (Exception e) {
			System.out.println("could validate this scenario because of " + e.getMessage());
		}
	  
		
		login.enterPassword("Priyanka@123");
		login.clickOnLogin();
		Thread.sleep(5000);
		
	}

}
