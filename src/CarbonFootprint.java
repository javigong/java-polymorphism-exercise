
/**
 * WMDD 4930 - Lab 9 - 10.17 CarbonFootprint Interface: Polymorphism
 *
 * @author Javier Gongora Marruedo Student ID: 100369289
 */
public abstract class CarbonFootprint {

    private final String name;
    private final double carbonEmissionRate;

    // constructor
    public CarbonFootprint(String name, double carbonEmissionRate) {
        this.name = name;
        this.carbonEmissionRate = carbonEmissionRate;
    }

    // return name
    public String getName() {
        return name;
    }

    // return carbon emission rate
    public double getCarbonEmissionRate() {
        return carbonEmissionRate;
    }

    // abstract method must be overriden by concrete subclasses
    public abstract double getCarbonFootprint(); // no implementation here

} // end abstract class CarbonFootprint
