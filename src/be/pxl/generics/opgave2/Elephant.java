package be.pxl.generics.opgave2;

public class Elephant implements Moveable<Location> {
    private Location location;

    public Elephant(){}

    @Override
    public void move(Location location) {
        this.location = location;
    }

    @Override
    public String getCurrentLocation() {
        return  location.toString();
    }
}
