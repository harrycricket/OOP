
package data;

/**
 *
 * @author Huynh Van Phuot
 */

// ta phát hiện được 1 mối quan hệ giữa nhiều Khuôn "khác biệt"
// nhưng lại tương đồng
// ta đang nói về Khuôn tổ sinh ra nhiều Khuôn khác
// Shape đại diện, Cha của đám hv, hcn, tg...
// đọc 1 chiều thôi, IS A

public abstract class Shape {
    // đặc tính của Shape?
    protected String owner;
    protected String color;
    protected String borderColor;   // màu đường viền
    
    // protected double a, b, c, d, e, radius; // k phải đặc điểm chung của Shape
    // giả sử Disk kế thừa Shape thì hình tròn sẽ vừa có cạnh, vừa có bán kính
    // lúc get(), set() sẽ xổ ra 1 đống cạnh
    // hcn, hv kế thừa Shape thì sẽ có bán kính
    // Cha có nhiều Con thì Cha sẽ là nhân tử chung của các Con
    // chung cho các Con kế thừa, phần dị biệt mỗi đứa sẽ tự giữ riêng
    // TUYỆT ĐỐI K ĐỂ DỊ BIỆT LÊN CHA, DỊ BIỆT CỦA TỪNG ĐỨA CON

    public Shape() {
    }

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
    
    // hành động tiếp theo, hàm của tui
    // tính chu vi, diện tích
    // hàm xử lí data, ai có nhiều info thì kẻ đó sẽ xử lí
    // ở đây k có data nhiều để tính toán, data thuộc về dị biệt
    // K CẦN HÀM getS(), getP() có đc k?
    // CẤM BỎ HÀM TÍNH S(), P() VÌ LOGIC VỀ HÌNH HỌC, TƯ DUY VỀ HÌNH HỌC
    // THÌ HÌNH HỌC CÓ ĐƯỜNG NÉT, CÓ BỀ MẶT, NÊN SẼ TÍNH DDC S, P
    // hành động, hành vi của hình học nói chung thì chắc chắn phải có S, P
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();
    // thao tác sẽ hình là khác nhau
    // viết Paint() ở đây và dùng if(tgiac) in Triangle, if (htron) in Disk...
    // có được k???
    // dùng được nhưng mất đi tính linh hoạt để mở rộng, thích ứng với mọi hình 
    // còn tiếp tục được sinh ra sau này
    // Nguyên lí Solid
    
//    public double getArea() {
//        
//        return;
//    }
//    // k tính được vì thiếu cạnh, thiếu kích thước nhưng lại k đc bỏ hàm đi
//    // tiến thoái lưỡng nan
//    
//    public double getPerimeter() {
//        
//        return 0;
//    }
}

// CHỐT HẠ: việc tính S, P gắn kèm với khái niệm hình học nên k thể bỏ
// nhưng đó chỉ là ý tưởng vì k thể tính cụ thể được vì mỗi hình mỗi khác
// S, P là khái niệm nói về 1 con số, đại diện cho đường biên, bề mặt
// tùy thuộc vào mỗi hình sẽ tính khác nhau, khái niệm chung chung
// cái chung chung vẫn ở đó nhưng k cụ thể, chúng tôi gọi là trừu trượng
// ABSTRACT: tồn tại nhưng vô hình, k cụ thể
// cái gì tồn tại nhưng k cầm nắm đc, chỉ mang ý nghĩa khái niệm
// nói về 1 ý tưởng, hữu nhưng mà vô --> ABSTRACT
// S và P của Shape là trừu tượng, tồn tại nhưng chưa cụ thể
// vì ngay cả Shape cũng là 1 khái niệm chưa cụ thể, chưa biết hình gì
// ABSTRACT - TÍNH TRỪU TƯỢNG CHÍNH LÀ NÓI VỀ MỘT Ý TƯỞNG
