package be.pxl.generics.demo5;

import be.pxl.generics.demo1.GenericBox;
import be.pxl.generics.demo2.Animal;
import be.pxl.generics.demo2.Fish;
import be.pxl.generics.demo2.LivingCreature;

public class Demo5 {
    public static void main(String[] args) {
        GenericBox<LivingCreature> livingCreatureBox = new GenericBox<>();
        livingCreatureBox.setItem(new LivingCreature());

        GenericBox<Animal> animalBox = new GenericBox<>();
        Animal animal = new Animal();
        animal.setSick(true);
        animalBox.setItem(animal);

        GenericBox<Fish> fishBox = new GenericBox<>();
        fishBox.setItem(new Fish());

        System.out.println(GenericBoxUtility.isSick(fishBox));
        System.out.println(GenericBoxUtility.isSick(animalBox));
        //System.out.println(GenericBoxUtility.isSick(livingCreatureBox));

        //System.out.println(GenericBoxUtility.displayBox(fishBox));
        System.out.println(GenericBoxUtility.displayBox(animalBox));
        System.out.println(GenericBoxUtility.displayBox(livingCreatureBox));
    }
}
