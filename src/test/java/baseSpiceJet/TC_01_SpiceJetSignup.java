package baseSpiceJet;

import org.testng.Assert;
import org.testng.annotations.Test;

import spicejetFlightBooking.SignupSpiceJet;

public class TC_01_SpiceJetSignup extends SetUpSpiceJet {
	@Test(priority = 1)
	public void testSignUp() throws InterruptedException {

		SignupSpiceJet signupspicejet = new SignupSpiceJet(driver);
		signupspicejet.signUp();
		signupspicejet.switchToNewWindow();
		signupspicejet.selectTitle();

		signupspicejet.firstName("P");
		String exp1 = "Please enter minimum 2 characters";
		try {
			Assert.assertEquals(exp1, signupspicejet.negativeSce1Validation());
		} catch (Exception e) {
			System.out.println("could validate this scenario because of " + e.getMessage());
		}
		signupspicejet.firstName("riya");

		signupspicejet.lastName("MS");
		Thread.sleep(2000);
		signupspicejet.selectCountry();

		signupspicejet.selectDateOfBirth();

		signupspicejet.mobileNo("98763");
		signupspicejet.enterEmail("priya98765@gmail.com");
		
		String exp = "Please enter valid mobile number";
		
		//signupspicejet.enterEmail("priya98765@gmail.com");
		signupspicejet.enterPassword("Priyanka@123");
		signupspicejet.confirmPassword("Priyanka@123");
		signupspicejet.clickCheckbox();
		try {
			Assert.assertEquals(exp, signupspicejet.negativeSceValidation());
		} catch (Exception e) {
			System.out.println("could validate this scenario because of " + e.getMessage());
		}
		signupspicejet.mobileNo("28763");
		signupspicejet.clickSubmit();
		
//facing issue with the website after clicking on the submit button any of the fields are missing and not showing any error 
	}

}
