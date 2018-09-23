package be.pxl.generics.opgave1.opgave_f;

import be.pxl.generics.opgave1.Motorized;
import be.pxl.generics.opgave1.Vehicle;

public class WorkingPlaceUtility {
	public static int getScore(WorkingPlace<?> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
