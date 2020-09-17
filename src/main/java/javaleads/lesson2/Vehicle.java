package javaleads.lesson2;

/**
 * Create an abstract class called “Vehicle” under the package “javaleads.lesson2”.
 * The abstract class should have private member variables “type” and “capacity” of appropriate data types.
 * This abstract class should have an abstract method”runVehical” and a proper method call “printVehicleDetails”
 */

abstract class Vehicle {
    private String type;
    private int capacity;


    abstract void runVehicle();
    public void printVehicleDetails(){
        System.out.println("This is the method for Vehicle class.");
    }
}
