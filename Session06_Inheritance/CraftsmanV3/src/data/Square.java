package data;

/**
 *
 * @author Huynh Van Phuot
 */

// Square is a (kind of), a special case, a version of Rectangle
// độ lại 1 Khuôn mới từ Khuôn cũ
// cách tiếp cận sự tương đồng giữa các Khuôn, kế thừa, dùng lại
//                                                Inherit/ Inheritance
// viết theo cách cũ: 2 Khuôn độc lập, k cùng mảng
//           kế thừa: 2 ae chung 1 nhà
// HCN là class CHA, parent, super, base, phiên bản gốc
// HV           CON, child, sub, derived
// HV là HCN nên sẽ có tất cả những thứ mà HCN có, k cần viết lại
// hàm xài lại luôn
// Kế thừa là xài lại 100% k cần gõ lại code
        
/* Noted
    1.  khi chơi với kế thừa phải tôn trọng phễu của Con
        để đúc 1 HV: owner, color, edge
        Phễu HV vẫn cần, Khuôn cần có phễu để đổ nhận vật liệu
        Phễu chảy thẳng lên HCN vì HV là HCN
        dữ liệu của HV chính là dữ liệu của HCN
        phải tôn trọng phễu của Con

    2.  Nhân tử chung
    3.  
*/ 
public class Square extends Rectangle {

    // HV là HCN nên k cần làm lại những gì HCN đã làm
    // k cần field vì HCN đã có rồi
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
        // DUNG HÒA CHA CON
        // HV có cạnh edge chính là HCN có cạnh edge, edge
    }   // super ~ new Rectangle(o, c, w, l)
        // đẩy/ đổ vật liệu lên Cha giữ giùm, k cần làm lại
        // new Square() -> cắt HV, tạo HV, chính là cắt HCN
        // new Square() chính là new HCN(), cắt HV, chính là cắt HCN
   
    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-15s|%-10s|%-5.1f|  -  |%-7.2f|\n",
                            owner, color, width, getArea());
        
    }
}
