package baseSpiceJet;

import org.testng.annotations.Test;

import spicejetFlightBooking.OneWaySearchFlightSpiceJet;

public class TC_03_OneWaySearchFlightSpiceJet extends SetUpSpiceJet{
	@Test(priority=3)
	public void testSearchFlights() throws InterruptedException {
		
		OneWaySearchFlightSpiceJet searchflight=new OneWaySearchFlightSpiceJet(driver);
		searchflight.clickFrom();
		searchflight.setFromPlace();

		searchflight.setdestinationPlace();
		

		searchflight.pickDate();
		searchflight.clickCurrency();
		searchflight.selCurrency();
		searchflight.clickPassengers();

		searchflight.selPassengers();
		
		searchflight.searchFlights();
        Thread.sleep(5000);


	}

	
	
}
