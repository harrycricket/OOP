
package dogmanagement;

import data.Dog;

public class DogManagement {

    public static void main(String[] args) {
        // lấy Khuôn Dog ra để bắt đầu đổ info
        // sau khi chờ khô thì ta có được object thuốc Nhóm vừa đúc
        // đặt tên gọi tắt cho object để dễ dàng nói chuyện, tham chiếu đến
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
        // biến/ tên tắt object
        // có object thì object sẽ biết làm gì đó
        chiHu.bark();

        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();

        // chiHu sủa trở lại
        System.out.println("Chi Hu Hu barks again");
        chiHu.bark();
        // HÀNH ĐỘNG PHẢI GẮN VỚI OBJECT THÔNG QUA DẤU CHẤM "."
        
        System.out.println("After overweight: ");
        chiHu.setNewWeight(5);
        chiHu.bark();
        
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        System.out.println("ND YOB: " + ngaoDa.getYob());
        
    }
    // new là xin vùng RAM mới để đủ chứa info của 1 bạn Dog sẽ được đúc
    // có đến 2 vùng name dành cho 2 objects để nó k đè lên nhau
    // ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
    // HÀM VÀ BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJECT,
    // THỰC THỂ NÀO ĐÓ
}
