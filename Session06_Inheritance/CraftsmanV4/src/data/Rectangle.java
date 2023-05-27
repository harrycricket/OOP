
package data;

/**
 *
 * @author Huynh Van Phuot
 */

/*
1. IS A
2. Đặc điểm: Con trùng hoàn toàn Cha thì gửi Cha giữ hết, khỏi làm
             Con dị biệt thì làm như bt
3. Phễu, thỏa hiệp nếu cần, đổi thứ tự biến cho dễ đọc
4. Hàm của Con: có quyền làm dị biệt như bình thường (ảnh hưởng tổ lái con trỏ)
   Phiên bản kế thừa Lv1, chưa xài abstract thì Con chỉ cần làm phễu là xong
   xài 100% ở Cha, thích qua mặt thì làm @Override
   Class Con kế thừa từ Cha, Cha này là abstract nên Con chỉ có 2 lựa chọn duy nhất:
    +   Con làm biếng, k thèm làm điều Cha nói, k thèm viết code cho hàm abstract của Cha
        Tức là Con lúc này chứa hàm abstract từ Cha
        Nếu class chứa hàm abstract thì mày k hoàn hảo, chỉ là khái niệm
        Nếu 1 class là abstract giống như bản Concept vậy k thể vận hành 1 cách hoàn hảo được,
        k thể new để tạo object
        Cha k thể new vì chưa hoàn hảo, Con cũng thế, k new được
    +   Bài này là HCN có 2 cạnh cụ thể, tính được ngay S, P
        Con phải có trách nhiệm hoàn tất điều Cha nói, viết code cho hàm abstract
        vì nếu k làm thì nó sẽ vô sinh, k new được do k hoàn hảo
        Con nếu k muốn vô sinh thì phải viết code cho tất cả các hàm abstract của Cha
        IMPLEMENT ALL OF PARENT'S ABSTRACT METHODS
        ta k sử dụng được điều k hoàn hảo
        implement the body of the function/ the body of parent's abstract methods
        @Override
        Phần dị biệt thì con phải làm
*/

public class Rectangle extends Shape{
    private double a, b;

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%-4.1f|%-4.1f|%-7.2f|\n",
                            owner, color, borderColor, a, b, getArea());
    }

    
}
