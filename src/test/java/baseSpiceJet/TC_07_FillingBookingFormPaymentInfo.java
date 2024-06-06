package baseSpiceJet;

import org.testng.Assert;
import org.testng.annotations.Test;

import spicejetFlightBooking.BookingSpiceJetFlight;
import spicejetFlightBooking.FillingBookingFormPaymentInfo;
import spicejetFlightBooking.OneWaySearchFlightSpiceJet;

public class TC_07_FillingBookingFormPaymentInfo extends SetUpSpiceJet {

	@Test
	public void fillingBookingInfo() throws InterruptedException {

		OneWaySearchFlightSpiceJet searchflight = new OneWaySearchFlightSpiceJet(driver);
		searchflight.clickFrom();
		searchflight.setFromPlace();

		searchflight.setdestinationPlace();


		searchflight.pickDate();

		searchflight.clickCurrency();

		searchflight.selCurrency();

		searchflight.searchFlights();


		BookingSpiceJetFlight booking = new BookingSpiceJetFlight(driver);

		booking.clickOnContinue();

		FillingBookingFormPaymentInfo bookingform = new FillingBookingFormPaymentInfo(driver);

		bookingform.enterFirstname("Rajesh");
		bookingform.enterLastname("K");
		bookingform.enterMobileno("9876623456");
		bookingform.enterEmail("Rajesh123@gmail.com");
		bookingform.enterCity("Hyderabad");
		bookingform.enterPassen1Firstname("Rajesh");
		bookingform.enterPassen1Lastname("k");
		bookingform.enterPassen1Mobileno("9876623456");
		bookingform.clickContinue();
		Thread.sleep(2000);

		bookingform.continueToPayment();
		bookingform.skipComfort();
		bookingform.continueToPayment();
		Thread.sleep(2000);
		bookingform.switchToIframe();
		bookingform.enterCardNo("3742 454554 00126");
		bookingform.switchToNameIframe();
		bookingform.enterCardName("Rajesh");
		bookingform.switchToMonthIframe();
		bookingform.enterCardExpMonth("10");
		bookingform.switchToYearIframe();
		bookingform.enterCardExpYear("26");
		bookingform.switchToSecCodeIframe();
		bookingform.enterSecurityCode("234");
		bookingform.clickProceedToPay();
		
		String exp="Invalid Card Details";
	      Assert.assertEquals(exp, bookingform.errorvalidation());

	}

}
