package be.pxl.generics.opgave1.opgave_g;

import be.pxl.generics.opgave1.Motorized;
import be.pxl.generics.opgave1.Vehicle;

public class WorkingPlaceUtility {
	public static int getScore(WorkingPlace<? extends Vehicle> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
