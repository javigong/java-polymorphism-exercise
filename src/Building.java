
/**
 * WMDD 4930 - Lab 9 - 10.17 CarbonFootprint Interface: Polymorphism
 *
 * @author Javier Gongora Marruedo Student ID: 100369289
 */
public class Building extends CarbonFootprint {

    private double electricityKwh; // Annual kWh of electricity

    // constructor
    public Building(String name, double carbonEmissionRate,
            double electricityKwh) {
        super(name, carbonEmissionRate);

        if (carbonEmissionRate < 0.0) {
            throw new IllegalArgumentException(
                    "carbonEmissionRate must be >= 0.0");
        }

        if (electricityKwh < 0.0) {
            throw new IllegalArgumentException(
                    "Annual kWh of electricity must be >= 0.0");
        }

        this.electricityKwh = electricityKwh;
    }

    // set kWh of electricity
    public void setElectricityKwh(double electricityKwh) {
        if (electricityKwh < 0.0) {
            throw new IllegalArgumentException(
                    "Annual kWh of electricity must be >= 0.0");
        }

        this.electricityKwh = electricityKwh;
    }

    // return kWh of electricity
    public double getElectricityKwh() {
        return electricityKwh;
    }

    // calculate carbon footprint
    @Override
    public double getCarbonFootprint() {
        return getElectricityKwh() * getCarbonEmissionRate();
    }

    // return String representation of Bicycle object
    @Override
    public String toString() {
        return String.format(
                "%s that consumed %,.2f kWh of electricity has a carbon %n"
                + "footprint of %,.2f pounds of CO2.",
                getName(), getElectricityKwh(), getCarbonFootprint());
    }

}
