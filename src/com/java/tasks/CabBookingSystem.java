package com.java.tasks;

class Cab {
	double distance;
	int waitingMinutes;
	boolean rideStarted;

	public void calculateFare(double distance) {
		System.out.println("Total fare to be paid" + distance * 10);
	}

	public void calculateWaitingCharge(int waitingMinutes) {
		System.out.println("Waiting Charges " + waitingMinutes * 2);

	}

	public void startRide() {
		rideStarted = true;
		System.out.println("Ride Started");
	}

	public void endRide() {
		rideStarted = false;
		System.out.println("Ride Ended");
	}

}

class MiniCab extends Cab {
	@Override
	public void calculateFare(double distance) {
		System.out.println("Total fare to be paid" + distance * 12);
	}

	@Override
	public void calculateWaitingCharge(int waitingMinutes) {
		System.out.println("Waiting Charges " + waitingMinutes * 3);

	}

	@Override
	public void startRide() {
		rideStarted = true;
		System.out.println("Ride started");
	}

	@Override
	public void endRide() {
		rideStarted = false;
		System.out.println("Ride ended");
	}
}

class SedanCab extends Cab {
	@Override
	public void calculateFare(double distance) {
		System.out.println("Total fare to be paid" + distance * 15);
	}

	@Override
	public void calculateWaitingCharge(int waitingMinutes) {
		System.out.println("Waiting Charges " + waitingMinutes * 5);

	}

	@Override
	public void startRide() {
		rideStarted = true;
		System.out.println("Ride Started");
	}

	@Override
	public void endRide() {
		rideStarted = false;
		System.out.println("Ride Ended");
	}

}

class LuxuryCab extends Cab {
	@Override
	public void calculateFare(double distance) {
		System.out.println("Total fare to be paid" + distance * 17);
	}

	@Override
	public void calculateWaitingCharge(int waitingMinutes) {
		System.out.println("Waiting Charges " + waitingMinutes * 6);

	}

	@Override
	public void startRide() {
		rideStarted = true;
		System.out.println("Ride Started");
	}

	@Override

	public void endRide() {
		rideStarted = false;
		System.out.println("Ride Ended");
	}
}

public class CabBookingSystem {

	public static void main(String[] args) {
		Cab cab;
		cab = new MiniCab();
		cab.calculateFare(12.5);
		cab.calculateWaitingCharge(3);
		cab.startRide();
		cab.endRide();

		System.out.println();

		cab = new SedanCab();
		cab.calculateFare(14);
		cab.calculateWaitingCharge(5);
		cab.startRide();
		cab.endRide();

		System.out.println();

		cab = new LuxuryCab();
		cab.calculateFare(15);
		cab.calculateWaitingCharge(2);
		cab.startRide();
		cab.endRide();

	}

}
