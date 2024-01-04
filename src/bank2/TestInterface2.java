package bank2;

interface FlyingObject{}
interface Camera{}
class Vehicle{}

class FourWheeler extends Vehicle{}
class Car extends FourWheeler{}

class Aeroplane extends Vehicle implements FlyingObject{}
class Drone extends Vehicle implements FlyingObject, Camera{}

public class TestInterface2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Drone d1 = new Drone();
	}
}
