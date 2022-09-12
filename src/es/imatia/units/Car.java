package es.imatia.units;

import java.util.Scanner;


public class Car {
	public String brand;
	public String model;
	public int max_speed;
	public String fuel;
	public int speedometer = 0;
	public int tachometer = 0;
	public String gear = "N";
	public boolean reverse = false;
	public int steeringWheelAngle = 0;
	
	
	public Car(String brand, String model, String fuel, int max_speed) {
		this.brand = brand;
		this.model = model;
		this.fuel = fuel;
		this.max_speed = max_speed;
	}
	
	
	public Car() {
		this.brand = "Renault";
		this.model = "Laguna";
		this.fuel = "Diesel";
	}

	
	public static void main(String[] args) {
		Car myCar = new Car("Citroen", "Xsara", "Diesel", 120);
		myCar.start();
		myCar.start();
		myCar.stop();
		myCar.stop();
		myCar.speedometer = 20;
		myCar.stop();
		myCar.start();
		myCar.speedometer = 0;
		myCar.stop();
		myCar.turnSteeringWheel(25);
		myCar.showSteeringWheelDetail();
		myCar.turnSteeringWheel(30);
		myCar.showSteeringWheelDetail();
		myCar.turnSteeringWheel(-50);
		myCar.showSteeringWheelDetail();
		myCar.turnSteeringWheel(25);
		myCar.showSteeringWheelDetail();
	}
	
	
	public void start() {
		if (this.tachometer == 0) {
			this.tachometer = 1000;
			System.out.println("Vehicle turned on");
		}else {
			System.out.println("The vehicle is already turned on");
		}
	}
	
	
	public void stop() {
		if (this.speedometer == 0 && this.tachometer == 0) {
		System.out.println("the vehicle is already stopped");
		} else if (this.speedometer == 0) {
			this.tachometer = 0;
			System.out.println("Vehicle turned off");
		}else {
			System.out.println("You must stop the vehicle first");			
		}
	}
	
	
	public void accelerate() {
		if (!isReverse() && this.speedometer == this.max_speed) {
			System.out.println("You have already reached max speed");
		}else if (this.gear == "R" && this.speedometer < 25) {
			this.speedometer += 5;
		}
	}
	
	
	private void calculateTachometer() {
		double gearVel = (float) this.speedometer / 25;
		double gearVelInt = Math.floor(gearVel);
		this.gear = Integer.toString((int) (gearVelInt) + 1);
		double fract = gearVel - gearVelInt;
		this.tachometer = (int) ((fract * 100 * 1500) / 100) + 1000;
	}
	
	
	public void brake() {
		if (this.speedometer == 0) {
			System.out.println("The vehicle is already stopped");
		}else if(this.speedometer != 0 && gear == "N") {
			this.speedometer -= 5;
			System.out.println("Your speed is" + this.speedometer);
		}else {
			System.out.println("You must turn on the vehicle first");
		}
	}
	
	
	public void turnSteeringWheel(int angle) {
		int angleResult = this.steeringWheelAngle + angle;
		if (angleResult < -45 || angleResult > 45){
			System.out.println("You can't turn this angle");
		}else {
			this.steeringWheelAngle = angleResult;
			System.out.println("Your turning angle is " + this.steeringWheelAngle);
		}
	}

	
	public String showSteeringWheelDetail() {
		String steeringWheelAngleToString = String.valueOf(this.steeringWheelAngle);		
		if (this.steeringWheelAngle < 0) {
			System.out.println("You'r turning " + steeringWheelAngleToString + " degrees to the left" );
			return steeringWheelAngleToString;
		} else if (this.steeringWheelAngle > 0) {
			System.out.println("You'r turning " + steeringWheelAngleToString + " degrees to the right");
			return steeringWheelAngleToString;			
		}else {
			System.out.println("Your turning angle is " + steeringWheelAngleToString + " you'r going straight");
			return steeringWheelAngleToString;
		}
	}
	
	
	public boolean isReverse() {
		if (!this.reverse) {
			
		}
	}
	
	
	public void setReverse(boolean reverse) {
		if (this.reverse == false) {
			this.reverse = reverse;
			System.out.println("You are now in reverse");
		}else {
			System.out.println("You are already in reverse");
		}
	}
	
	
	public void showDetails() {
		
	}
	
	
};