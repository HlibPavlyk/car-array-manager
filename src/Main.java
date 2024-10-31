import java.util.Arrays;

/**
 * The Main class contains the main method to execute the program.
 */
public class Main {

    /**
     * The main method where the program starts execution.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Declare and initialize an array of Car objects
        Car[] cars = new Car[7];

        cars[0] = new Car("Toyota", "Camry", 2018, 20000.0, "VIN001");
        cars[1] = new Car("Honda", "Accord", 2020, 22000.0, "VIN002");
        cars[2] = new Car("Ford", "Mustang", 2019, 30000.0, "VIN003");
        cars[3] = new Car("Ford", "Mustang", 2019, 25000.0, "VIN006");
        cars[4] = new Car("Tesla", "Model X", 2021, 35000.0, "VIN004");
        cars[5] = new Car("Chevrolet", "Impala", 2017, 18000.0, "VIN005");
        cars[6] = new Car("Tesla", "Model 3", 2021, 35000.0, "VIN004");

        // Sort the array in ascending order using CarComparator
        Arrays.sort(cars, new CarComparator());

        // Display the sorted array
        System.out.println("Sorted in ascending order list of cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Sort the array in descending order  using CarComparator
        Arrays.sort(cars, new CarComparator().reversed());

        // Display the sorted array
        System.out.println("\nSorted in descending order list of cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Define the target car to search for
        Car targetCar = new Car("Ford", "Mustang", 2019, 30000.0, "VIN003");

        // Perform linear search using equals
        int index = linearSearch(cars, targetCar);

        // Display the result of the search
        if (index >= 0) {
            System.out.println("\nFound the car at index " + index + ":");
            System.out.println(cars[index]);
        } else {
            System.out.println("\nCar not found.");
        }
    }

    /**
     * Performs a linear search on an array of Car objects using equals.
     *
     * @param cars       the array of Car objects to search
     * @param targetCar  the Car object to find
     * @return the index of the target car in the array, or -1 if not found
     */
    public static int linearSearch(Car[] cars, Car targetCar) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(targetCar)) {
                return i;  // Return the index if an identical car is found
            }
        }
        return -1;  // Return -1 if no match is found
    }
}