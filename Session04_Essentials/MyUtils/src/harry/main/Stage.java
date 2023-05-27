package harry.main;

import harry.util.MyUtils;

/**
 *
 * @author Huynh Van Phuot
 */
public class Stage {
    public static void main(String[] args) {
//        System.out.println(MyUtils.PI);
//        int n = MyUtils.getAnInteger();
//        System.out.println("n = " + n);
//        int choice = MyUtils.getAnInteger("Input your choice: ");
//        System.out.println("Your choice: " + choice);
        int temp = MyUtils.getAnInteger("Input: ", "Error!", 2020, 2002);
        System.out.println("temp: " + temp);
    }
}
