package be.pxl.generics.opgave1.opgave_b;

import be.pxl.generics.opgave1.Car;
import be.pxl.generics.opgave1.Vehicle;

import java.net.CacheRequest;

public class WorkingPlace<T extends Vehicle> {
	private T thingToFix;
	private int numberOfThingsFixed = 0;

	public boolean isEmpty() {
		return thingToFix == null;
	}

	public void startFixing(T vehicle) {
		if (!isEmpty()) {
			System.out.println("Already busy.");
		} else {
			this.thingToFix = vehicle;
		}
	}

	public void finished() {
		thingToFix = null;
		numberOfThingsFixed++;
	}

	public int getNumberOfThingsFixed() {
		return numberOfThingsFixed;
	}

}
