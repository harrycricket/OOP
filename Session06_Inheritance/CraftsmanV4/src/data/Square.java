
package data;

/**
 *
 * @author Huynh Van Phuot
 */

// Nếu kế thừa từ hcn thì ta phải làm gì?
    // extends từ HCN
    // k biến dị so với HCN nên k cần làm đặc điểm phần dị biệt
    // phễu thỏa hiệp, bản sắc, đảo thứ tự
    // k cần làm gì thêm, vì HCN đã ổn rồi
    // nếu muốn độ lại thì cứ làm chứ nó đã ổn rồi
// Cây gia phả, Shape là ông nội, Rectangle là cha còn Square là con

public class Square extends Rectangle {

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }

    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%-4.1f|%-7.2f|\n", 
                            owner, color, borderColor, getA(), getArea());
    }
    
    public void sayHi() {
        System.out.println("Phải sống hết mình để không cảm thấy hối hận!");
    }
    // k cần khai báo thêm vì HV là HCN có 2 cạnh bằng nhau
    // nếu muốn biến dị thì làm thêm
    
}   

/* Kế thừa từ hàm Shape
public class Square extends Shape{
    private double edge;

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void paint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
*/
