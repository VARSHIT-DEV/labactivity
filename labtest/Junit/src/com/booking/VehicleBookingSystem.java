package com.booking;

public class VehicleBookingSystem {
    private BookingService bookingService;

    public VehicleBookingSystem() {
        this.bookingService = new BookingService();
    }

    public String loadHomePage() {
        return bookingService.loadHomePage();
    }

    public boolean openBookingWindow() {
        return bookingService.openBookingWindow();
    }

    public String selectPickup(String point) {
        return bookingService.selectPickup(point);
    }

    public String selectDestination(String dest) {
        return bookingService.selectDestination(dest);
    }

    public String selectVehicle(String vehicle) {
        return bookingService.selectVehicle(vehicle);
    }

    public String confirmBooking() {
        return bookingService.confirmBooking();
    }

    public boolean selectPaymentMode(String mode) {
        return bookingService.selectPaymentMode(mode);
    }

    public boolean checkIfDriverAccepted() {
        return bookingService.checkIfDriverAccepted();
    }

    public String trackDriver() {
        return bookingService.trackDriver();
    }

    public boolean verifyOTP(String otp) {
        return bookingService.verifyOTP(otp);
    }

    public String reachDestination() {
        return bookingService.reachDestination();
    }

    public boolean completePayment(String mode, int amount) {
        return bookingService.completePayment(mode, amount);
    }
}

