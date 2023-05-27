
package dogmanagement;

import data.Dog;

public class DogManagement {

   
    public static void main(String[] args) {
        
        int age = 20;
        
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
        // tui muốn show toàn bộ info theo cách toString()
        // object có nhiều hành động
        System.out.println("Show all info by using toString() - a new behavior");
        String chDetails = chiHu.toString();
        System.out.println("CH details: " + chDetails);
        System.out.println("ND details: " + ngaoDa.toString());
        
        // hàm toString() rất đặc biệt, gắn với @Override
        // mục tiêu là show ra all of info đã được đổ vào hoặc chỉnh sửa
        // y chang như mở setting trong phone xem phần info của điện thoại
        
        System.out.println("Play with toString ~ gọi thầm tên em");
        System.out.println(chiHu);  // chiHu là biến object, tức là lưu tọa độ vùng new
                                    // về lí thuyết thì nó in ra địa chỉ
                                    // thực tế thì Java gọi toString ngầm             
        System.out.println(ngaoDa);
        
        // NẾU KHUÔN K CÓ HÀM TOSTRING() THÌ MẶC NHIÊN KHI NÓ ĐƯỢC TRIỆU GỌI
        // (GỌI THẦM HAY TRỰC TIẾP) SẼ TỰ ĐỘNG BĂM VÙNG RAM CỦA OBJECT THÀNH 
        // CON SỐ HEXA ĐẠI DIỆN CHO VALUE CỦA VÙNG RAM ĐÓ
        // HASH NUMBER, NÉN TOÀN BỘ DATA THÀNH 1 CON SỐ
        
        // xem tuổi của 1 object, tương tác, hỏi đáp, giao tiếp với object qua dấu chấm
        System.out.println("Get age: ");
        System.out.println("ND age: " + ngaoDa.getAge());
        
//        int a = 100;
//        printf("a: %d\n", a);
//        printf("an address: %u\n", &a);
//        int *p = &a; // p lưu tọa độ của a
//        printf("p has value of %u\n", p);
        
    }
}
