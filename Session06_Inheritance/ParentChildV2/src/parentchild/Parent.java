
package parentchild;

/**
 *
 * @author Huynh Van Phuot
 */
public class Parent {
    protected String assetOne;      // Cha có 2 món tài sản
    protected String assetTwo;

    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAssetTwo() {
        return assetTwo;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        return "Parent{" + "assetOne=" + assetOne + ", assetTwo=" + assetTwo + '}';
    }
    
    public void showProfile() {
        System.out.println("PARENT: asset 1: " + assetOne + "; asset 2: " + assetTwo);
        
    }
}
