
/**
 * WMDD 4930 - Lab 9 - 10.17 CarbonFootprint Interface: Polymorphism
 *
 * @author Javier Gongora Marruedo Student ID: 100369289
 */
public class Bicycle extends CarbonFootprint {

    private double kilometers; // Annual kilometers

    // constructor
    public Bicycle(String name, double carbonEmissionRate, double kilometers) {
        super(name, carbonEmissionRate);

        if (carbonEmissionRate < 0.0) {
            throw new IllegalArgumentException(
                    "carbonEmissionRate must be >= 0.0");
        }

        if (kilometers < 0.0) {
            throw new IllegalArgumentException(
                    "Annual kilometers must be >= 0.0");
        }

        this.kilometers = kilometers;

    }

    // set kilometers
    public void setKilometers(double kilometers) {
        if (kilometers < 0.0) {
            throw new IllegalArgumentException(
                    "Annual kilometers must be >= 0.0");
        }

        this.kilometers = kilometers;
    }

    // return kilometers
    public double getKilometers() {
        return kilometers;
    }

    // calculate carbon footprint
    @Override
    public double getCarbonFootprint() {
        return kilometers * getCarbonEmissionRate();
    }

    // return String representation of Bicycle object
    @Override
    public String toString() {
        return String.format("%s that travelled %,.2f kilometers has a %n"
                + "carbon footprint of %,.2f pounds of CO2.",
                getName(), getKilometers(), getCarbonFootprint());
    }

}
