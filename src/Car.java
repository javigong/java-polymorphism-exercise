/**
 * WMDD 4930 - Lab 9 - 10.17 CarbonFootprint Interface: Polymorphism
 *
 * @author Javier Gongora Marruedo Student ID: 100369289
 */
public class Car extends CarbonFootprint {

    private double gallonsGasoline; // Annual gallons of gasoline

    // constructor
    public Car(String name, double carbonEmissionRate, double gallonsGasoline) {
        super(name, carbonEmissionRate);

        if (carbonEmissionRate < 0.0) {
            throw new IllegalArgumentException(
                    "carbonEmissionRate must be >= 0.0");
        }

        if (gallonsGasoline < 0.0) {
            throw new IllegalArgumentException(
                    "Annual gallons of gasoline must be >= 0.0");
        }

        this.gallonsGasoline = gallonsGasoline;
    }

    // set gallons of gasoline
    public void setGallons(double gallonsGasoline) {
        if (gallonsGasoline < 0.0) {
            throw new IllegalArgumentException(
                    "Annual gallons of gasoline must be >= 0.0");
        }

        this.gallonsGasoline = gallonsGasoline;
    }

    // return gallons of gasoline
    public double getGallonsGasoline() {
        return gallonsGasoline;
    }

    // calculate carbon footprint
    @Override
    public double getCarbonFootprint() {
        return gallonsGasoline * getCarbonEmissionRate();
    }
    
    // return String representation of Car object
    @Override
    public String toString()
    {
        return String.format("%s that consumed %,.2f gallons of gasoline %n"
                + "has a carbon footprint of %,.2f pounds of CO2.",
                getName(), getGallonsGasoline(), getCarbonFootprint());
    }
}
