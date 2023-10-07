import javax.xml.crypto.Data;

/**
 * Driver class to run the program.
 *
 * @author Abdulqadir Abuharrus
 * @version 1.0
 */
public class Driver {

    public static void main(String[] args) {
        int cubeCount = 3000;
        DataCube theCubeOfCybertron = new DataCube(10, 20, 30);
        theCubeOfCybertron.populate(cubeCount);
        System.out.printf("The sum of all cubes is %5f!", theCubeOfCybertron.sum());

    }
}
