package Lecture24GenericFxn;

import java.util.Comparator;

public class CarColourComparator implements Comparator<Car>{

	@Override
	public int compare(Car t, Car o) {
		
		return t.Colour.compareTo(o.Colour);
	}

}
