import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class DataCube {

    private Cube[][][] data;
    private static Random rand = new Random();


    public DataCube(final int length, final int width, final int height) {
        this.data = new Cube[length][width][height];
    }


    public void populate(final int cubeCount) {
        int numberOfCubes = cubeCount;
        while (numberOfCubes > 0) {
            int xCord = rand.nextInt(this.data.length);
            int yCord = rand.nextInt(this.data[0].length);
            int zCord = rand.nextInt(this.data[0][1].length);
            if (data[xCord][yCord][zCord] == null) {
                Cube newCube = new Cube(xCord, yCord, zCord);
                data[xCord][yCord][zCord] = newCube;
                numberOfCubes--;
            }
        }
    }


    /**
     * Returns the sum of all the values in the data cube.
     *
     * @return double representing the sum of each cube's value
     */
    public double sum() {
        double sum = 0;
        for (Cube[][] cubeArray : data) {
            for (Cube[] cubeArray2 : cubeArray) {
                for (Cube cube : cubeArray2) {
                    if (cube != null) {   // Check if cube object is not null
                        sum += cube.getValue();
                    }
                }
            }
        }
        return sum;
    }


    /**
     * Checks if two DataCube objects are equal.
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
        DataCube dataCube = (DataCube) o;
        return Arrays.equals(data, dataCube.data);
    }

    /**
     * Returns the hashcode of the DataCube object.
     *
     * @return integer representing the hashcode of the DataCube object
     */
    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }

    /**
     * Returns the String representation of the DataCube object.
     *
     * @return String representation of the DataCube object
     */
    @Override
    public String toString() {
        return "DataCube{" + "data=" + Arrays.toString(data) + '}';
    }
}
