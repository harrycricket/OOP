
package harry.util;

import java.util.Scanner;

/**
 *
 * @author Huynh Van Phuot
 */
public class MyToys {
    
    // final ~ constant: biến hằng số, k cho thay đổi value, ngoại trừ lúc đầu tiên
    
    public static final double PI = 3.14;
    public static final double VAT = 0.1;
    public static final int MAX_ELEMENTS = 500;
    private static Scanner sc = new Scanner(System.in);
    
    // ta sẽ gặp 1 dạng nhập dữ liệu như sau: 
    // nhập vào chiều dài, rộng của hcn, bán kính của hình tròn, a, b, c của tam giác
    // nhập số gặp vấn đề trôi lệnh, ngoài biên và cà chớn - try catch, lặp bắt nhập lại
    // suy nghĩ tốt hơn: làm 1 cái hàm nhập số trả về con số đã nhập, chặn hết mọi thứ
    
    public static int getAnInteger(String inputMessage) {
        int n; // nhập từ bàn phím cần có chỗ chứa
        do {
            try {
                System.out.print(inputMessage);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know how to input a positive integer?");
            }
        } while (true); // while còn đúng thì do again
        
    }
    
    public static int getAnInteger() {
        int n; // nhập từ bàn phím cần có chỗ chứa
        do {
            try {
                System.out.print("Input an integer: ");
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know how to input a positive integer?");
            }
        } while (true); // while còn đúng thì do again
        
    }
}
