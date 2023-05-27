
package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;


/**
 *
 * @author Huynh Van Phuot
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        register();
    }
    
    public static void register() {
        Cat tom = new Cat("TOM", 1950, 10.5, "><");
        tom.showRecord();
        
        Pet kitty = new Cat("KITTY", 1990, 5.0, "><");
        kitty.showRecord();
                
        Dog buck = new Dog("BUCK", 2021, 50.0);
        Pet beTo = new Dog("BÊ-TÔ", 2012, 5.0);
        buck.showRecord();
        beTo.showRecord();
        
        Hamster jerry = new Hamster("JERRY", 2020, 1.5);
        jerry.showRecord();
    }
}
