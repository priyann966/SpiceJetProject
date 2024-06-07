package baseSpiceJet;

import org.testng.annotations.Test;

import spicejetFlightBooking.OneWaySearchFlightSpiceJet;
import spicejetFlightBooking.RoundTripSearchSpiceJet;

public class TC_04_RoundTripSearchFlight extends SetUpSpiceJet {
	@Test
	public void testRoundTripSearch() throws InterruptedException {

		OneWaySearchFlightSpiceJet searchflight = new OneWaySearchFlightSpiceJet(driver);
		RoundTripSearchSpiceJet roundtrip = new RoundTripSearchSpiceJet(driver);
		roundtrip.selRoundTrip();
		searchflight.clickFrom();
		searchflight.setFromPlace();

		searchflight.setdestinationPlace();

		roundtrip.roundTripPickDate();

		searchflight.clickPassengers();

		searchflight.selPassengers();

		// searchflight.clickOnDone();

		searchflight.clickCurrency();

		searchflight.selCurrency();

		searchflight.searchFlights();

		Thread.sleep(6000);

	}

}
