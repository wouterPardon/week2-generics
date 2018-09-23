package be.pxl.generics.demo4;

import be.pxl.generics.demo2.Cat;
import be.pxl.generics.demo3.Habitat;

public class CatShelter implements Habitat<Cat> {
    private Cat inhabitant;

    @Override
    public void addInhabitant(Cat inhabitant) {
        this.inhabitant = inhabitant;
    }

    @Override
    public void removeInhabitant(Cat inhabitant) {
        if (this.inhabitant.equals(inhabitant)) {
            this.inhabitant = null;
        }
    }

    @Override
    public Cat catchInhabintant() {
        return inhabitant;
    }

    @Override
    public int getNumberOfInhabitants() {
        return 1;
    }
}
