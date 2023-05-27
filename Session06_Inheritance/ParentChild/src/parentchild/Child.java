
package parentchild;

/**
 *
 * @author Huynh Van Phuot
 */
public class Child extends Parent{

    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
        
    @Override
    public void showProfile() {
        System.out.println("CHILD: asset 1: " + assetOne + "; asset 2: " + assetTwo);
    }
    
    // biến dị hoàn toàn, tức là có hàm mà bên Cha k có
    public void sayHello() {
        System.out.println("Hey, I'm a rich kid!");
    }
}
