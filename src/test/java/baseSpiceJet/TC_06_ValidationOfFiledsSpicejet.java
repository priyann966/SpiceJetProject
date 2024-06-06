package baseSpiceJet;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import spicejetFlightBooking.ValidationOfFileldsSpicejet;

public class TC_06_ValidationOfFiledsSpicejet extends SetUpSpiceJet {
	@Test
	public void validationOfFiledsSpicejet() throws InterruptedException {
		
		ValidationOfFileldsSpicejet fields=new ValidationOfFileldsSpicejet(driver);
		fields.clickCheckIn();
		fields.validateCheckIn();
		assertEquals(fields.validateCheckIn(),"Web Check-In");

		fields.clickFlightStatus();
		fields.validateFlightStatus();
		assertEquals(fields.validateFlightStatus(),"Flight Status");

		fields.clickManageBooking();
		fields.validateManageBooking();
    	assertEquals(fields.validateManageBooking(),"View / Manage Booking");




	}

	
	
}
