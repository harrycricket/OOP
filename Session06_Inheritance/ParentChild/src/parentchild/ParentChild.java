
package parentchild;

/**
 *
 * @author Huynh Van Phuot
 */
public class ParentChild {

    public static void main(String[] args) {
        playWithPointer();
    }
    
    public static void playWithPointer() {
        Parent p = new Parent("BIỆT THỰ", "1000 BTC");
        p.showProfile();
        
        Child c1 = new Child("CĂN HỘ", "100 BTC");
        c1.showProfile();
        c1.sayHello();
        
        Parent c2 = new Child("NHÀ PHỐ", "100 ETH");
        c2.showProfile();   // gọi cha nhưng chạy con (override)
        //c2.sayHello(); // k xổ ra của riêng Con dù đã new Con và có sẵn trong RAM luôn
        // mình đang cư xử như Cha, dùng danh nghĩa Cha
        // nên phải tuân theo hành động của Cha, Khai báo kiểu Cha nên phải chấm theo Cha
        // nhưng vùng RAM vẫn đang new Con
        // Con đang dùng danh nghĩa Cha thì phải cư xử như Cha, k xổ được phần riêng của Con
        // đang dùng con trỏ Cha thì chỉ xổ kiểu của Cha, chỉ trỏ đến vùng super()
        
        // để thấy được hàm dị biệt của con thì phải DRIFT còn trỏ, kéo giãn sợi dây
        // đó chính là ÉP KIỂU
        // tổ lái con trỏ xuống đáy của vùng new Con sẽ lấy đc hàm sayHello()
        
        // Cách 1:
        Child x = (Child)c2;    // mày hãy ráng xuống vùng new Child 
                                // để lấy cho tao cái tọa độ của new Child 
        // c2 chỉ trỏ vùng new Parent 
        x.sayHello();
        // x cùng trỏ vùng new NHÀ PHỐ
        
        // Cách 2: nương theo cách 1 nhưng k tốn 1 con trỏ Child
        // (Child)c2.   // sẽ k xổ vì dấu chấm có độ ưu tiên cao, ăn theo data type
        ((Child)c2).sayHello();     // ép xong rồi mới chấm
        
    }
}
