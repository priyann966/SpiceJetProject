package baseSpiceJet;

import org.testng.annotations.Test;

import spicejetFlightBooking.SignupSpiceJet;

public class TC_01_SpiceJetSignup extends SetUpSpiceJet {
	@Test(priority = 1)
	public void testSignUp() throws InterruptedException {

		SignupSpiceJet signupspicejet = new SignupSpiceJet(driver);
		signupspicejet.signUp();
		signupspicejet.switchToNewWindow();
		signupspicejet.selectTitle();
		signupspicejet.firstName("Priya");
		signupspicejet.lastName("MS");

		signupspicejet.selectCountry();
		Thread.sleep(2000);

		signupspicejet.selectDateOfBirth();

		signupspicejet.mobileNo("9876353535");
		signupspicejet.enterEmail("priya98765@gmail.com");

		signupspicejet.enterPassword("Priyanka@123");
		signupspicejet.confirmPassword("Priyanka@123");

		signupspicejet.clickCheckbox();

		signupspicejet.clickSubmit();

	}

}
