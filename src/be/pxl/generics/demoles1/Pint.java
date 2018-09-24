package be.pxl.generics.demoles1;

public class Pint {
    private double alcoholPercentage;

    public Pint(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(int alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public String toString() {
        return "Pint{" +
                "alcoholPercentage=" + alcoholPercentage +
                '}';
    }
}
