package be.pxl.generics.demo4;

import be.pxl.generics.demo2.Animal;
import be.pxl.generics.demo3.Habitat;

public class AnimalUtility {
    public static <E extends Animal> void moveAnimals(E animalToMove, Habitat<E> fromHabitat, Habitat<E> toHabitat) {
        fromHabitat.removeInhabitant(animalToMove);
        toHabitat.addInhabitant(animalToMove);
    }

    public static boolean possibleProblem(Habitat<?> habitat) {
        for (int i = 0; i < 5; i++) {
            Animal animal = habitat.catchInhabintant();
            if (animal.isSick()) {
                return true;
            }
        }
        return false;
    }
}
