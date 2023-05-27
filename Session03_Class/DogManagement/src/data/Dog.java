package data;

// Khuôn dùng để đúc ra các objects, đối tượng ta cần lưu trữ info
// Khuôn phải kín, có phễu để chế/ rót/ hứng/ đổ vào để đổ vào cái data, nguyên liệu

public class Dog {
    // chứa các đặc điểm, chi tiết mà Khuôn, object tương lai sẽ có
    // Khuôn design sao thì object sau này sẽ như vậy
    private String name;
    private int yob;
    private double weight;
    // có Khuôn thì phải có phễu để hứng vật liệu đi vào
    // phễu dùng để nhận vật liệu đúc ra, tạo ra, construct cái objects
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }
    // phễu còn gọi là constructor, hàm khởi tạo, hàm đúc,
    // hàm tạo dựng ra object vì thông qua nó như cái phễu 
    // vật liệu được chảy vào trong Khuôn, vật liệu khô thì tạo ra object
    // CONSTRUCTOR LÀ HÀM CỰC KÌ ĐẶC BIỆT VÌ NÓ DÙNG ĐỂ TẠO RA OBJECT
    // cứ mỗi lần xài thì ta phải đưa vật liệu vào, tức là có 
    // một object mới
    // phễu là 1 hàm đặc biệt, k có giá trị trả về, k có VOID luôn
    // trả về nguyên 1 object chứ k phải 1 giá trị
    // tên 100% phải giống tên Class
    // viết các hàm xử lí data, vd như giao tiếp để hỏi năm sinh
    // mày hỏi thì tao trả lời
    // object sẽ gọi là hành động, 
    // xử lí, tính toán trên các biến đã được đổ value từ lúc đúc ra
    // hàm gọi n lần tương đương các hành động mà object nào đó 
    // lặp đi lặp lại
    // hành động của object gọi n lần trên object đó
    public void bark() {
        // System.out.println("Gogogogo...My name is " + name);
        // System.out.println("Gogogogo...My yob is " + yob);
        System.out.printf("|%-10s|%4d|%4.1f|\n",
                                name, yob, weight);
    }
    
    public void setNewWeight(double newWeight) {
        weight = newWeight;        
    }
    // vì mặc định info sẽ là giấu, khi nào giao tiếp thì mới 
    // chia sẻ, đó là method hay hàm hành động get()
    public int getYob() {  
        return yob;
    }
}
// code ở bên ngoài như Khuôn bị lủng