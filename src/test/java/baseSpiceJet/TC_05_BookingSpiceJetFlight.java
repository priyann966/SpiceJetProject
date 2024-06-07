package baseSpiceJet;

import org.testng.annotations.Test;

import spicejetFlightBooking.BookingSpiceJetFlight;
import spicejetFlightBooking.OneWaySearchFlightSpiceJet;

public class TC_05_BookingSpiceJetFlight extends SetUpSpiceJet {
	@Test
	public void bookingFlight() throws InterruptedException {

		OneWaySearchFlightSpiceJet searchflight = new OneWaySearchFlightSpiceJet(driver);
		searchflight.clickFrom();
		searchflight.setFromPlace();

		searchflight.setdestinationPlace();

		searchflight.pickDate();

		searchflight.clickCurrency();

		searchflight.selCurrency();

		searchflight.searchFlights();

		// Thread.sleep(2000);

		BookingSpiceJetFlight booking = new BookingSpiceJetFlight(driver);

		booking.clickOnContinue();
		Thread.sleep(6000);

	}

}
