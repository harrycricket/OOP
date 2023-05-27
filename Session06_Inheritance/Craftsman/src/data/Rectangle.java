
package data;

/**
 *
 * @author Huynh Van Phuot
 */
public class Rectangle {
    
    private String owner;   
    private String color;
    private double width;
    private double length;
    // private double area;
    // area đc tính toán bởi đặc tính khác, area --> derived attribute/ field
    //                                      đặc điểm/ đặc tính dẫn xuất
    // chơi với field coi chừng tính bất đồng bộ, k nhất quán về dữ liệu
    // inconsistency
    // k chơi đổ từ phễu nhưng gán area = w * l ngay lúc khai báo
    // nhưng nếu setW(cạnh mới) mà quên update lại area thì toang
    // bản chất của area là liên quan đến tính toán, k có sẵn
    // tức là hàm xử ;í data, vậy hàm phải thuộc về object phù hợp
    // việc tính S() là hàm của hcn là hợp lí: ai có nhiều info thì ng đó xử lí
    
    // nếu ta xem S là đặc điểm của miếng đất hoặc hcn k sai nhưng
    // 

    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("|RECTANGLE |%-15s|%-10s|%-5.1f|%-5.1f|",
                                owner, color, width, length);
    }
    
    public double getArea() {
        return width * length;
    }
    
    public void paint() {
        System.out.printf("|RECTANGLE |%-15s|%-10s|%-5.1f|%-5.1f|%-7.2f|\n",
                            owner, color, width, length, getArea());
    }
}
