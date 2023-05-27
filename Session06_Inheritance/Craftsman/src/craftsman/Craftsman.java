
package craftsman;

import data.Disk;
import data.Rectangle;
import data.Square;

/**
 *
 * @author Huynh Van Phuot
 */
public class Craftsman {

    public static void main(String[] args) {
        //cutShapes();
        sortShape();
                
    }
    
    public static void sortShape() {
        Rectangle r1 = new Rectangle("BA", "PINK", 1.0, 2.0);
        Rectangle rectArr[] = new Rectangle[9];
        // có 9 biến, bàn có 9 chỗ ngồi nhưng chưa có ai, chưa có object cụ thể
        // các biến con trỏ cần trỏ vào vùng new Rectangle(), tọa độ vùng new
        // chỉ cần có vùng new Reat là đc
        rectArr[0] = r1;
        // 2 chàng 1 nàng
//        rectArr[0].paint();
//        rectArr[0].setOwner("PAPA");
//        rectArr[0].paint();
//        r1.paint();
        rectArr[1] = new Rectangle("MÁ", "XANH LÁ", 2.0, 3.0);
        rectArr[2] = new Rectangle("BÉ NA", "RAINBOW", 2.0, 2.5);
        
//        rectArr[3] = new Square("GHỆ BÉ NA", "RAINBOW", 1.0);

//        Square sqArr[] = new Square[9];
//        sqArr[0] = new Square("GHỆ BÉ NA", "RAINBOW", 1.0);
        
        System.out.println("Before sorting: ");
//        for (Rectangle x : rectArr) {
//            x.paint();
//        }   // nullpointer
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
        
        System.out.println("After sorting ascending by area: ");
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
        
        
    }
    
    public static void cutShapes() {
        Rectangle r1 = new Rectangle("BA", "PINK", 1.0, 2.0);
        r1.paint();
        Square s1 = new Square("MÁ", "XANH LÁ", 3.0);
        s1.paint();
        Disk d1 = new Disk("CHỊ", "VÀNG", "<3", 3.2);
        d1.paint();
    }
}
