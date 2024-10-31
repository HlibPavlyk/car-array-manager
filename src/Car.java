/**
 * The Car class represents a car with various attributes.
 */
public class Car {

    private final String make;   // Manufacturer of the car
    private final String model;  // Model of the car
    private final int year;      // Year the car was made
    private final double price;  // Price of the car
    private final String vin;    // Vehicle Identification Number

    /**
     * Constructs a new Car with the specified details.
     *
     * @param make  the manufacturer of the car
     * @param model the model of the car
     * @param year  the year the car was made
     * @param price the price of the car
     * @param vin   the Vehicle Identification Number
     */
    public Car(String make, String model, int year, double price, String vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.vin = vin;
    }

    // Getters for all fields

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getVin() {
        return vin;
    }

    /**
     * Returns a string representation of the Car object.
     *
     * @return a formatted string with car details
     */
    @Override
    public String toString() {
        return String.format(
                "Car [Make=%s, Model=%s, Year=%d, Price=%.2f, VIN=%s]",
                make, model, year, price, vin
        );
    }

    /**
     * Compares this car to the specified object.
     *
     * @param obj the object to compare with
     * @return true if the cars are identical, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return year == car.year &&
                Double.compare(car.price, price) == 0 &&
                make.equals(car.make) &&
                model.equals(car.model) &&
                vin.equals(car.vin);
    }
}
