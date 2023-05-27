package craftsmanv4;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

/**
 *
 * @author Huynh Van Phuot
 */
public class CraftsmanV4 {

    public static void main(String[] args) {
        //playWithShape();
        sortShapes();
    }

    public static void sortShapes() {
        // sắp xếp các hình
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 6.0);

        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);
        ((Square) s3).sayHi();
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6.5);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "^-^", 6.5);

        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);

//        r1.paint();
//        r2.paint();
//        s1.paint();
//        s2.paint();
//        s3.paint();
//        d1.paint();
//        d2.paint();
//        t1.paint();
//        t2.paint();
        Shape arr[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, t1, t2};
        System.out.println("The list of Shape: ");
        for (Shape x : arr) {
            x.paint();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        // gọi Shape là ABSTRACT nhưng k sợ, tùy con là ai thì override
        // gọi ông nội, nhưng con cháu qua mặt tùy tình huống
        // hiện tượng từ 1 hàm Paint() nhưng có n cách viết code khác nhau 
        // ở mức con cháu, có n cách chạy khác nhau lúc runtime
        // từ 1 hàm Paint() mà có nhiều cách cài đặt và thực thi
        // từ 1 biến hình/ đa hình/ đa cách thức/ đa nhân cách/ 50 sắc thái
        // biến hóa khôn lường, transformers
        // từ 1 biến hóa ra nhiều qua hình dạng Override
        // hiện tượng, kĩ thuật này gọi là đa ánh xạ, đa hình dạng, đa sắc thái
        // POLYMORPHISM
        System.out.println("The list of Shape after sorting ascending by area: ");
        for (Shape x : arr) {
            x.paint();
        }
//        Shape arr[] = new Shape[] {
//            new Rectangle(...),
//            new Disk(...),
//            new Triangle(...)
//        };

//        Shape arr[] =  new Shape[9];
//        // có 9 biến Shape, 9 con trỏ chưa có object nào
//        // arr[0], arr[1]... cần một tọa độ vùng new Rectangle(), new Disk(), new Triangle()
//        // new cái gì đó IS A Shape
//        arr[0] = new Rectangle(...);
//        arr[1] = new Disk(...);
//        arr[2] = r1;
//        arr[3] = r1;
//        arr[4] = arr[0];
//        arr[5] = t1;
    }

    public static void playWithShape() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 5.0, 6.0);
        Disk d1 = new Disk("MÁ", "PINK", "MAGENTA", "<3", 6.5);
        Shape d2 = new Disk("MÁ", "MAGENTA", "PINK", "^-^", 6.5);
        r1.paint();     // hàm của Con, chạy của Con
        r2.paint();     // hàm của Cha, chạy của Con, Con qua mặt
        d1.paint();
        d2.paint();
        // k lo lắng Cha k hoàn hảo, Con cân hết
        // Paint() ở trên chính là hiện tượng Đa Hình - Polymorphism
    }
}
