
package parentchild;

/**
 *
 * @author Huynh Van Phuot
 */
public class ParentChild {

    public static void main(String[] args) {
        playWithPointer();
    }
    
    public static void playWithPointer() {
        Parent p = new Parent("BIỆT THỰ", "1000 BTC");
        p.showProfile();
        
        Child c1 = new Child("CĂN HỘ", "100 BTC", "NEW CAR");
        c1.showProfile();
        
        Parent c2 = new Child("NHÀ PHỐ", "100 ETH", "NEW MOTOR");
        c2.showProfile();   
    }
}
