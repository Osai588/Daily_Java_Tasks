package com.java.tasks;

class FoodDelivery {
	double distance;
	double amount;
	double time;

	public void calculateDeliveryCharge(double distance) {
		this.distance = distance;
		System.out.println("DeliveryCharge : " + distance * 1.5);
	}

	public void calculateDiscount(double amount) {
		if (amount > 150 && amount <= 220) {
			System.out.println("Discount : " + amount * 0.1);
		} else if (amount > 220 && amount <= 320) {
			System.out.println("Discount : " + amount * 0.2);

		} else if (amount > 320 && amount <= 420) {
			System.out.println("Discount : " + amount * 0.3);

		} else if (amount > 420 && amount <= 1020) {
			System.out.println("Discount  : " + amount * 0.4);

		} else if (amount > 1020) {
			System.out.println("Discount : " + amount * 0.5);
		} else {
			System.out.println("no discount");
		}

	}

	public void estimateDeliveryTime(int speed) {
		time = (distance / speed) * 60;
		System.out.println("DeliveryTime : " + time + "minutes");

	}

	public void displayOrderStatus() {
		System.out.println("order to be delivered......");
	}

}

class SwiggyDelivery extends FoodDelivery {
	@Override
	public void calculateDeliveryCharge(double distance) {
		this.distance = distance;
		System.out.println("DeliveryCharge :" + distance * 1.5);
	}

	@Override
	public void calculateDiscount(double amount) {
		if (amount > 200 && amount <= 230) {
			System.out.println("Discount : " + amount * 0.1);
		} else if (amount > 230 && amount <= 410) {
			System.out.println("Discount : " + amount * 0.2);

		} else if (amount > 410 && amount <= 500) {
			System.out.println("Discount : " + amount * 0.3);

		} else if (amount > 500 && amount <= 800) {
			System.out.println("Discount : " + amount * 0.4);

		} else if (amount > 800) {
			System.out.println("Discount : " + amount * 0.5);
		} else {
			System.out.println("no discount");
		}
	}

	@Override
	public void estimateDeliveryTime(int speed) {
		time = (distance / speed) * 60;
		System.out.println("DeliveryTime : " + time + " " + "minutes");

	}

	@Override
	public void displayOrderStatus() {
		System.out.println("order to be deliverd......");
	}

}

class ZomatoDelivery extends FoodDelivery {
	@Override
	public void calculateDeliveryCharge(double distance) {
		this.distance = distance;
		System.out.println("DeliveryCharge :" + distance * 1.5);
	}

	@Override
	public void calculateDiscount(double amount) {
		if (amount > 100 && amount <= 170) {
			System.out.println("Discount : " + amount * 0.1);
		} else if (amount > 170 && amount <= 240) {
			System.out.println("Discount : " + amount * 0.2);

		} else if (amount > 240 && amount <= 320) {
			System.out.println("Discount : " + amount * 0.3);

		} else if (amount > 320 && amount <= 420) {
			System.out.println("Discount : " + amount * 0.4);

		} else if (amount > 520) {
			System.out.println("Discount : " + amount * 0.5);
		} else {
			System.out.println("no discount");
		}
	}

	@Override
	public void estimateDeliveryTime(int speed) {
		time = (distance / speed) * 60;
		System.out.println("DeliveryTime" + time + " " + "minutes");

	}

	@Override
	public void displayOrderStatus() {
		System.out.println("order delivered........");
	}
}

class RestaurantDelivery extends FoodDelivery {
	@Override
	public void calculateDeliveryCharge(double distance) {
		this.distance = distance;
		System.out.println("DeliveryCharge : " + distance * 1.5);
	}

	@Override
	public void calculateDiscount(double amount) {
		if (amount > 190 && amount <= 220) {
			System.out.println("Discount : " + amount * 0.1);
		} else if (amount > 220 && amount <= 290) {
			System.out.println("Discount : " + amount * 0.2);

		} else if (amount > 290 && amount <= 400) {
			System.out.println("Discount : " + amount * 0.3);

		} else if (amount > 400 && amount <= 520) {
			System.out.println("Discount : " + amount * 0.4);

		} else if (amount > 520) {
			System.out.println("Discount : " + amount * 0.5);
		} else {
			System.out.println("no discount");
		}
	}

	@Override
	public void estimateDeliveryTime(int speed) {
		time = (distance / speed) * 60;
		System.out.println("DeliveryTime : " + time + " " + "minutes");

	}

	@Override
	public void displayOrderStatus() {
		System.out.println("order will be delivered in 5 mins");
	}
}

public class FoodDeliverySystem {

	public static void main(String[] args) {
		FoodDelivery food;

		food = new SwiggyDelivery();

		food.calculateDeliveryCharge(7);
		food.calculateDiscount(120);
		food.estimateDeliveryTime(60);
		food.displayOrderStatus();

		System.out.println();

		food = new ZomatoDelivery();
		food.calculateDeliveryCharge(15);
		food.calculateDiscount(1700);
		food.estimateDeliveryTime(40);
		food.displayOrderStatus();

		System.out.println();

		food = new RestaurantDelivery();
		food.calculateDeliveryCharge(7);
		food.calculateDiscount(340);
		food.estimateDeliveryTime(25);
		food.displayOrderStatus();

	}

}
