
package data;

/**
 *
 * @author Huynh Van Phuot
 */

// 1. phát hiện được "IS A", lập tức sẽ tiếp cận làm Khuôn mới kiểu mới
// gõ extends Class Cha

// 2. Khai báo các đặc tính cho Con, nếu trùng với Cha thì để Cha lo
// k cần khai báo lại nếu trùng lặp
// 2.1 

// 3. Làm phễu cho Con, giữ bản sắc cho Con, tôn trọng Phễu đầu vào của Con
// sự khác biệt góc nhìn của Cha và Con

public class RightTriangle extends Triangle{

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt((a * a + b * b)));
        // new Con chính là new 1 phiên bản Cha, cắt TGV chính là cắt TG
        // 
    }

    @Override
    public void paint() {
        System.out.printf("|RIGHT TRIANGLE |%-15s|%-10s|%-5.1f|%-5.1f|  x  |%-7.2f|\n",
                            owner, color, a, b, getArea());
    }    
    // Liên quan đến kế thừa sẽ có 2 điều:
    // Di truyền: Cha có gì con xài nấy, Cha thêm thì Con có thêm, Cha bớt thì Con bị bớt 
    // Biến dị: Con khác Cha, điều gì xảy ra - Kĩ thuật DRIFT, rê bánh 
    
}
