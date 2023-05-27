
package parentchild;

/**
 *
 * @author Huynh Van Phuot
 */

// 1. Phát hiện IS A, extends
// 2. Khai báo các đặc điểm của Con
//      2.1 Nếu Con trùng với Cha thì k cần khai báo , k cần làm
//      2.2 Con có quyền dị biệt so với Cha, đặc điểm hoặc hành động (k bàn về @Override)
// 3. Phễu Con, giữ bản sắc nếu cần    
public class Child extends Parent{
    private String childAsset; // Con tạo dựng cơ ngơi riêng, Cha k biết

    public Child(String assetOne, String assetTwo, String childAsset) {
        super(assetOne, assetTwo);
        this.childAsset = childAsset;
    }

    public String getChildAsset() {
        return childAsset;
    }

    public void setChildAsset(String childAsset) {
        this.childAsset = childAsset;
    }

    @Override
    public void showProfile() {
        System.out.println("CHILD: asset 1: " + assetOne + "; asset 2: " + assetTwo);
        System.out.println("By the way, here is my own asset: " + childAsset  );
    }
    
}
