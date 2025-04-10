package com.booking;

public class BookingService {
    public String loadHomePage() {
        return "https://vehicles.com";
    }

    public boolean openBookingWindow() {
        return true;
    }

    public String selectPickup(String pickupPoint) {
        return pickupPoint;
    }

    public String selectDestination(String destination) {
        return destination;
    }

    public String selectVehicle(String vehicle) {
        return vehicle;
    }

    public String confirmBooking() {
        return "Booking confirmed";
    }

    public boolean selectPaymentMode(String mode) {
        return mode.equals("UPI") || mode.equals("Card");
    }

    public boolean checkIfDriverAccepted() {
        return true;
    }

    public String trackDriver() {
        return "Driver is arriving";
    }

    public boolean verifyOTP(String otp) {
        return otp.equals("456789");
    }

    public String reachDestination() {
        return "Arrived";
    }

    public boolean completePayment(String mode, int amount) {
        return amount > 0;
    }
}

