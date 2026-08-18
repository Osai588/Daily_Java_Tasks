package com.java.tasks;

import java.util.Scanner;

abstract class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;

	public Product(int productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	abstract void calculateDiscount();

	abstract void calculateFinalPrice();

	abstract void displayProduct();
	public abstract double getFinalPrice();

	public void setproductId(int productId) {
		this.productId = productId;
	}

	public int getproductId() {
		return productId;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}

	public String getproductName() {
		return productName;
	}

	public void setproductPrice(double price) {
		this.price = price;
	}

	public double getproductPrice() {
		return price;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

	public int getquantity() {
		return quantity;
	}

}

class Electronics extends Product {

	public Electronics(int productId, String productName, double price, int quantity) {
		super(productId, productName, price, quantity);

	}

	double discount = 0;

	@Override
	void calculateDiscount() {
		discount = this.getproductPrice() * 0.15;
	}

	double FinalPrice = 0;

	@Override
	void calculateFinalPrice() {
		FinalPrice = (this.getproductPrice() - discount) * getquantity();
	}

	@Override
	void displayProduct() {
		System.out.println("Product Name : " + getproductName());
		System.out.println("Product Price : " + getproductPrice());
		System.out.println("Quantity : " + getquantity());
		System.out.println("Discount : " + discount);
		System.out.println("Final Price : " + FinalPrice);
	}
	@Override
	public double getFinalPrice() {
		return FinalPrice;
	}

}

class Clothing extends Product {

	public Clothing(int productId, String productName, double price, int quantity) {
		super(productId, productName, price, quantity);
	}

	double discount = 0;

	@Override
	void calculateDiscount() {
		discount = this.getproductPrice() * 0.20;
	}

	double FinalPrice = 0;

	@Override
	void calculateFinalPrice() {
		FinalPrice = (this.getproductPrice() - discount) * getquantity();
	}

	@Override
	void displayProduct() {
		System.out.println("Product Name : " + getproductName());
		System.out.println("Product Price : " + getproductPrice());
		System.out.println("Quantity : " + getquantity());
		System.out.println("Discount : " + discount);
		System.out.println("Final Price : " + FinalPrice);
	}

	@Override
	public double getFinalPrice() {
		return FinalPrice;
	}

}

class Grocery extends Product {

	public Grocery(int productId, String productName, double price, int quantity) {
		super(productId, productName, price, quantity);

	}

	double discount = 0;

	@Override
	void calculateDiscount() {
		discount = this.getproductPrice() * 0.05;
	}

	double FinalPrice = 0;

	@Override
	void calculateFinalPrice() {
		FinalPrice = (this.getproductPrice() - discount) * getquantity();
	}

	@Override
	void displayProduct() {
		System.out.println("Product Name : " + getproductName());
		System.out.println("Product Price : " + getproductPrice());
		System.out.println("Quantity : " + getquantity());
		System.out.println("Discount : " + discount);
		System.out.println("Final Price : " + FinalPrice);
	}

	@Override
	public double getFinalPrice() {
		
		return FinalPrice;
	}

}

public class OnlineShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalBill=0;
		System.out.println("---------------- ELECTRONICS ----------------");

		System.out.println("Enter the product Id");
		int eproductId = sc.nextInt();

		sc.nextLine();

		System.out.println("enter the product name");
		String eproductName = sc.nextLine();

		System.out.println("Enter the  price");
		double eprice = sc.nextDouble();

		System.out.println("Enter the  quantity");
		int equantity = sc.nextInt();

		Product pro;

		pro = new Electronics(eproductId, eproductName, eprice, equantity);
		pro.calculateDiscount();
		pro.calculateFinalPrice();
		pro.displayProduct();

	    totalBill += pro.getFinalPrice();

		System.out.println("---------------- CLOTHING ----------------");
		System.out.println();

		System.out.println("Enter the product Id");
		int pproductId = sc.nextInt();

		sc.nextLine();

		System.out.println("enter the product name");
		String pproductName = sc.nextLine();

		System.out.println("Enter the  price");
		double pprice = sc.nextDouble();

		System.out.println("Enter the  quantity");
		int pquantity = sc.nextInt();
           
		pro = new Clothing(pproductId, pproductName, pprice, pquantity);
		pro.calculateDiscount();
		pro.calculateFinalPrice();
		pro.displayProduct();

	    totalBill += pro.getFinalPrice();

		System.out.println("---------------- GROCERY ----------------");

		System.out.println();

		System.out.println("Enter the product Id");
		int gproductId = sc.nextInt();

		sc.nextLine();

		System.out.println("enter the product name");
		String gproductName = sc.nextLine();

		System.out.println("Enter the  price");
		double gprice = sc.nextDouble();

		System.out.println("Enter the  quantity");
		int gquantity = sc.nextInt();

		pro = new Grocery(gproductId, gproductName, gprice, gquantity);
		pro.calculateDiscount();
		pro.calculateFinalPrice();
		pro.displayProduct();

	    totalBill += pro.getFinalPrice();
		
		System.out.println("---------------- TOTAL BILL ----------------");
		
		System.out.println("Total Shopping Bill : " + totalBill);


		sc.close();
	}

}
