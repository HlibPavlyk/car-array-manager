import java.util.Comparator;

/**
 * The CarComparator class provides methods to compare Car objects by all fields in order.
 */
public class CarComparator implements Comparator<Car> {

    /**
     * Compares two Car objects by all fields in order: make, model, year, price, and vin.
     *
     * @param c1 the first Car object
     * @param c2 the second Car object
     * @return a negative integer, zero, or a positive integer as the first car
     *         is less than, equal to, or greater than the second car.
     */
    @Override
    public int compare(Car c1, Car c2) {
        int result = c1.getMake().compareTo(c2.getMake());
        if (result != 0) {
            return result;
        }
        result = c1.getModel().compareTo(c2.getModel());
        if (result != 0) {
            return result;
        }
        result = Integer.compare(c1.getYear(), c2.getYear());
        if (result != 0) {
            return result;
        }
        result = Double.compare(c1.getPrice(), c2.getPrice());
        if (result != 0) {
            return result;
        }
        return c1.getVin().compareTo(c2.getVin());
    }
}
