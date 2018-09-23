package be.pxl.generics.demo3;

import be.pxl.generics.demo2.Animal;

public interface Habitat<A extends Animal> {
    void addInhabitant(A inhabitant);

    void removeInhabitant(A inhabitant);

    A catchInhabintant();

    int getNumberOfInhabitants();
}
