import java.util.Objects;
import java.util.Random;

/**
 * A Cube class for an object representing a Cube with 3 dimensions, naturally.
 *
 * @author Abdulqadir Abuharrus
 * @version 1.0
 */

public class Cube {

    private int x_coordinate;
    private int y_coordinate;
    private int z_coordinate;
    private double value;

    /**
     * Constructs a new Cube object with 3 coordinate values.
     *
     * @param x integer  representing the x coordinate
     * @param y integer  representing the y coordinate
     * @param z integer  representing the z coordinate
     */
    public Cube(final int x, final int y, final int z) {
        this.x_coordinate = x;
        this.y_coordinate = y;
        this.z_coordinate = z;
        Random rand = new Random();
        this.value = rand.nextDouble();
    }

    /**
     * Returns the x coordinate of the Cube.
     *
     * @return integer representing the x coordinate
     */
    public double getValue() {
        return this.value;
    }

    /**
     * Checks if two Cube objects are equal.
     *
     * @param o Object to compare
     * @return boolean representing whether the two objects are equal
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cube cube = (Cube) o;
        return x_coordinate == cube.x_coordinate && y_coordinate == cube.y_coordinate && z_coordinate == cube.z_coordinate && Double.compare(value, cube.value) == 0;
    }

    /**
     * Returns the hashcode of the Cube object.
     *
     * @return integer representing the hashcode of the Cube object
     */
    @Override
    public int hashCode() {
        return Objects.hash(x_coordinate, y_coordinate, z_coordinate, value);
    }

    /**
     * Returns the String representation of the Cube object.
     *
     * @return String representation of the Cube object
     */
    @Override
    public String toString() {
        return "Cube{" + "x_coordinate=" + x_coordinate + ", y_coordinate=" + y_coordinate + ", z_coordinate=" + z_coordinate + ", value=" + value + '}';
    }
}
