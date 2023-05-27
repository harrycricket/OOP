
package harry.main;

import harry.util.MyToys;

/**
 *
 * @author Huynh Van Phuot
 */
public class Stage {
    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
        int width = MyToys.getAnInteger("Please input the width of a rectangle: ");
        int length = MyToys.getAnInteger("Please input the length of a rectangle: ");
        
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
    }
}
