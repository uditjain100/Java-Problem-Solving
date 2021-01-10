package Lecture24GenericFxn;

public class Car implements Comparable<Car>{

	int speed;
	int price;
	String Colour;

	public Car(int speed, int price, String Colour) {

		this.speed = speed;
		this.price = price;
		this.Colour = Colour;

	}

	@Override
	public String toString() {
		return " S: " + this.speed + " P: " + this.price + " C: " + this.Colour;
	}

	public int compareTo(Car other) {
		//return this.speed - other.speed ;
		//return other.price - this.price ;
		return this.Colour.compareTo(other.Colour) ;
	}
}