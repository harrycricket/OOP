
package data;

import java.util.Random;

/**
 *
 * @author Huynh Van Phuot
 */
public class Dog extends Pet{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        Random rd = new Random();
        return rd.nextDouble() * MAX_SPEED;
        //return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%-4d|%-4.1f|%4s|%-4.1f|\n",
                            "DOG" , name, yob, weight, "",run());
    } 
}
