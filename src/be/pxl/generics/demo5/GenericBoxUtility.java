package be.pxl.generics.demo5;

import be.pxl.generics.demo1.GenericBox;
import be.pxl.generics.demo2.Animal;
import be.pxl.generics.demo2.Cat;

public class GenericBoxUtility {
    public static <T extends Animal> boolean isSick(GenericBox<T> animalBox) {
        return animalBox.getItem().isSick();
    }

    public static String displayBox(GenericBox<? super Animal> surpriseBox) {
        return surpriseBox.getItem().getClass().getSimpleName();
    }
}
