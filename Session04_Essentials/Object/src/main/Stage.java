
package main;

import data.Student;

/**
 *
 * @author Huynh Van Phuot
 */
public class Stage {
    
    public static void main(String[] args) {
        Student x = checkObjectV7();
        x.showProfile();
    }
    // Hàm trả về object, k trả về primitive
    // hàm này trả về tọa độ của 1 object đã new đâu đó
    // tên hàm là 1 biến vì nó tương đương 1 giá trị
    public static Student checkObjectV7() { // tên hàm này cũng là 1 biến object
                                            // giá trị của hàm này là tọa độ new nào đó
        
        Student s1 = new Student("SE666789", "AHIHI", 1999, 8.9);
        // s1 đang nắm tọa độ vùng new clone trong HEAP 
        return s1;  // ném tọa độ đó vào tên hàm
                    // tên hàm có tọa độ, Student f(), f() là tọa độ mà
                    // 2 chàng trỏ 1 nàng new f() và s1 cùng trỏ new
        // từ trong hàm ném được tọa độ vùng new clone HEAP ra ngoài
        // lát hồi hàm chạy xong thì biến s1 sẽ mất đi vì nằm trong STACK
        // biến nằm trong STACK sẽ mất đi khi hàm chạy xong
        // còn vùng new k sợ mất vì nằm trong HEAP,  chỉ bị mất khi dùng lệnh GC
    }
    
    // Khai báo biến rồi gán sau
    public static void checkObjectV6() {

        Student s1;
        s1 = new Student("SE666789", "AHIHI", 1999, 8.9);
        s1.showProfile();
        
    }
    
    public static void checkObjectV5() {
        // Student s1 = new Student("SE666789", "AHIHI", 1999, 8.9);
            
        // s1 chấm tức là vào vùng tọa độ chấm để làm gì đó
        // new... cũng chính là tọa độ đẩy cho s1 nên s1 và new như nhau
        
        // object vô danh, sinh ra mà k đặt tên
        new Student("SE666789", "AHIHI", 1999, 8.9).showProfile();
        // k con trỏ thì sẽ bị GC hốt, object vô danh (anonymous object)
        // muốn reuse, chấm nhiều lần thì phải có tên gọi - biến object
        
    }
    
    // 2 chàng trỏ 1 nàng
    public static void checkObjectV4() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        Student s2 = s1;    // 2 thằng cùng nhìn 1 hướng tọa độ
        // s1, s2 cùng lưu 1 tọa độ, cùng trỏ vùng new clone AN 
        s1.setName("ANH CỤC SÚC QUÁ");
        s2.showProfile();
    }
    
    // backup object
    public static void checkObjectV3() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        
        // trước khi s1 chơi với BÌNH nhưng k muốn mất AN  
        // thì phải lưu lại vùng new của AN trước
        Student x = s1; // gán giá trị của s1 cho x, 
                        // còn khi new mới một s1 khác thì nó sẽ clone ra 1 vùng ram khác
        // x là biến object nên cần 1 vùng new
        // x trỏ đến AN ở trên
        s1.setName("e éo tin thầy :v");
        s1 = new Student("SE666788", "BÌNH LÊ", 1998, 8.8);
        // s1 đã bỏ AN để đi với BÌNH còn x là AN của ngày hôm qua 
        
        s1.showProfile();
        x.showProfile();
        
        System.out.println("Check: ");
        s1.setName("ahuhu");
        s1.showProfile();
        x.showProfile();
    }
    
    // Mất tọa độ, mất dấu vùng New có xảy ra k, nếu có thì sẽ ntn?
    public static void checkObjectV2() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        // s1 gọi là con trỏ, biến object lưu trữ tọa độ vùng new, vùng clone
        // từ new... được gọi là tọa độ/ giá trị phức tạp trả về tọa độ vùng clone
        // bản chất biến con trỏ/ object là cần trỏ, cần lưu 1 tọa độ vùng new clone 
        // k ai cấm mình trỏ vùng new mới
        
        s1 = new Student("SE666788", "BÌNH LÊ", 1998, 8.8);
        s1.showProfile();
        
        // muốn lấy lại vùng clone AN NGUYỄN
        // khi 1 object/ vùng new clone k ai trỏ tới, mất con trỏ
        // do con trỏ gán qua vùng new khác thì ta sẽ mất dấu vùng new cũ
        // JVM là máy ảo java chạy trong lõi Windows sẽ giám sát vùng ram viết bằng java
        // nếu cà chớn thì sẽ giết app hoặc cảnh báo khi dùng try-catch
        // có vùng new mồ côi nào k (vùng new k có con trỏ) 
        // bộ phận giám sát này của máy ảo java gọi là GARBAGE COLLECTOR 
        // đi gom vùng heap có object trống để clear cho các new clone khác
        // ~ free (con trỏ bên C - free malloc(), calloc())
        // việc clear ram HEAP của java diễn ra định kì
        // tuy nhiên có thể gọi ngay
        System.gc();
    }
    
    
    public static void checkObjectV1() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        Student s2 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        
        s1.showProfile();
        s2.showProfile();
        
        s1.setName("K học bài nữa");
        
        s2.showProfile();
        s1.showProfile();
        
        System.out.println("Check duplication object: ");
        System.out.println(s1);
        System.out.println(s2);
    }
    
    // ktra việc new trùng info xem sao
    public static void checkObject() {
        Student an = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        /*
            - new là clone vùng ram từ Khuôn
            - gọi phễu để đổ data vào vùng clone
            - chốt lại tọa độ vùng new đưa cho biến object giữ
        */
        an.showProfile();
        an = new Student("SE666789", "ĐẠI GIA", 2001, 9.9);
        an.showProfile();
        // mất tọa độ LỘC PHÁT rồi
        // mất tọa độ vùng ram object sẽ xảy ra điều gì?
        // vùng ram object k ai trỏ sẽ bị thu hồi, object bị giết,
        // vùng HEAP được clear ~ toán tử free(con trỏ bên C) 
        // vùng HEAP trả lại cho new object mới
        
        System.gc();
    }
}
