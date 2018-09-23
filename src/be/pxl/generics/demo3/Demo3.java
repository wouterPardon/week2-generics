package be.pxl.generics.demo3;

import be.pxl.generics.demo2.Fish;

public class Demo3 {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addInhabitant(new Fish());
        aquarium.addInhabitant(new Fish());
        aquarium.addInhabitant(new Fish());
        System.out.println(aquarium.getNumberOfInhabitants());
    }
}
