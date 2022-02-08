
/**
 * WMDD 4930 - Lab 9 - 10.17 CarbonFootprint Interface: Polymorphism
 *
 * @author Javier Gongora Marruedo Student ID: 100369289
 */
public class CarbonFootprintTest {

    public static void main(String[] args) {
        // create subclass objects
        Building myBuilding = new Building(
                "My building", 1.18, 11320); // name, emission rate, kWh of electricity
        Car myCar = new Car(
                "My car", 19.6, 528); // name, emission rate, gallons of gasoline
        Bicycle myBicycle = new Bicycle(
                "My bicycle", 0.046, 1168); // name, emission rate, km

        // create three-element CarbonFootprint array
        CarbonFootprint[] carbonFootprintArray = new CarbonFootprint[3];

        // initialize array with Employees
        carbonFootprintArray[0] = myBuilding;
        carbonFootprintArray[1] = myCar;
        carbonFootprintArray[2] = myBicycle;

        System.out.printf("Carbon Footprint processed polymorphically:%n%n");

        for (CarbonFootprint currentCarbonFootprint : carbonFootprintArray) {
            // polymorphically invokes getCarbonFooprint
            System.out.printf("Polymorphically invoke %s getCarbonFootprint "
                    + "method:%n%,.2f%n%n", currentCarbonFootprint.getName(),
                    currentCarbonFootprint.getCarbonFootprint());
            // invokes toString
            System.out.printf("%s%n%n", currentCarbonFootprint);
        }
    }

}
