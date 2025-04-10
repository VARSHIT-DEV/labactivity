package com.booking.test;
import com.booking.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleBookingSystemTest {

    VehicleBookingSystem bookingSystem;
    AuthService authService;

    @BeforeEach
    void setUp() {
        bookingSystem = new VehicleBookingSystem();
        authService = new AuthService();
    }

    @Test void testGoToWebsite() {
        assertEquals("https://vehicles.com", bookingSystem.loadHomePage());
    }

    @Test void testSignInForNewUser() {
        assertTrue(authService.login("username", "password"));
    }

    @Test void testVerificationOf2FA() {
        assertTrue(authService.verify2FA("123456"));
    }

    @Test void testOpenBookVehicleWindow() {
        assertTrue(bookingSystem.openBookingWindow());
    }

    @Test void testSelectPickupPoint() {
        assertEquals("Main Street", bookingSystem.selectPickup("Main Street"));
    }

    @Test void testSelectDestinationPoint() {
        assertEquals("Airport", bookingSystem.selectDestination("Airport"));
    }

    @Test void testSelectVehicleToBook() {
        assertEquals("Sedan", bookingSystem.selectVehicle("Sedan"));
    }

    @Test void testAskToConfirmBooking() {
        assertEquals("Booking confirmed", bookingSystem.confirmBooking());
    }

    @Test void testSelectModeOfPayment() {
        assertTrue(bookingSystem.selectPaymentMode("UPI"));
    }

    @Test void testAcceptYourRequest() {
        assertTrue(bookingSystem.checkIfDriverAccepted());
    }

    @Test void testTrackAndWaitForDriver() {
        assertEquals("Driver is arriving", bookingSystem.trackDriver());
    }

    @Test void testProvideOTP() {
        assertTrue(bookingSystem.verifyOTP("456789"));
    }

    @Test void testVehicleArrivesAtDestination() {
        assertEquals("Arrived", bookingSystem.reachDestination());
    }

    @Test void testPayDriver() {
        assertTrue(bookingSystem.completePayment("UPI", 250));
    }

    @Test void testAdminLogin() {
        assertTrue(authService.adminLogin("admin", "admin123"));
    }
}

