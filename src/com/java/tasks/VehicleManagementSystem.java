package com.java.tasks;

abstract class Vehicle {
	private String ModelName;
	private String VehicleNumber;
	private String Company;
	
	public Vehicle(String ModelName,String VehicleNumber,String Company) {
		this.ModelName=ModelName;
		this.VehicleNumber=VehicleNumber;
		this.Company=Company;
	}

	public void setModelName(String ModelName) {
		this.ModelName = ModelName;
	}

	public String getModelName() {
		return ModelName;
	}

	public void setVechicelNumber(String VehicleNumber) {
		this.VehicleNumber = VehicleNumber;
	}

	public String getVehicleNumber() {
		return VehicleNumber;
	}

	public void setCompany(String Company) {
		this.Company = Company;
	}

	public String getCompany() {
		return Company;
	}

	public abstract void startEngine();

	public void fuelType() {
		System.out.println("Petrol");
	}
	
}
class Car extends Vehicle{
	int numberOfDoors;
	boolean hasSunroof;
	public Car(String ModelName, String VehicleNumber, String Company,int numberOfDoors,boolean hasSunroof) {
		super(ModelName, VehicleNumber, Company);
		
	}
	@Override
	public void startEngine() {
		System.out.println("Starting engine with key ignition.");
	}	
}
class Bike extends Vehicle{
	boolean hasSidecar;
	public Bike(String ModelName, String VehicleNumber, String Company,boolean hasSidecar) {
		super(ModelName, VehicleNumber,Company);
	}
	@Override
	public void startEngine() {
		System.out.println("Starting engine with kick-start.");
	}	
	
}
class Truck extends Vehicle{
	int cargoCapacity;
	public Truck(String ModelName, String VehicleNumber, String Company,int cargoCapacity) {
		super( ModelName, VehicleNumber,  Company);
	}
	@Override
	public void startEngine() {
		System.out.println("Starting engine with heavy-load warm-up.");
	}
	@Override
	public void fuelType() {
		System.out.println("Diesel");
	}
	
}

public class VehicleManagementSystem {

	public static void main(String[] args) {
     Vehicle v;
     
     v=new Car("Toyota Camry", "ABC123", "Toyota", 4, true);
     v.startEngine();
     v.fuelType();
     System.out.println();
     
     v=new Bike("Yamaha R1", "XYZ789", "Yamaha", false);
     v.startEngine();
     v.fuelType();
     System.out.println();
     
     v=new Truck("Volvo FH", "DEF456", "Volvo", 20000);
     v.startEngine();
     v.fuelType();
	}

}
