package javaleads.lesson2;

/**
 * Create a child class “Boat” and extend the abstract class “Vehicle”.
 * Add new private member variable “engineCount”.
 * Override the method “printVehicleDetails” in the child class and make a call to parent method using keyword ”super”.
 * Implement the method “runVehicle”
 */

public class Boat extends Vehicle {

    private int engineCount;

    @Override
    void runVehicle() {
        System.out.println("The Boat is running.");
    }

    @Override
    public void printVehicleDetails() {
        super.printVehicleDetails();
        System.out.println("This is a overridden method of Boat class.");
    }
}
