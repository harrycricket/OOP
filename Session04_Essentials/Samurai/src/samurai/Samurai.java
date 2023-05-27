package samurai;

import java.util.Scanner;

/**
 *
 * @author Huynh Van Phuot
 */

public class Samurai {

    public static void main(String[] args) {
        inputProfileVer2();
    }

    public static void inputProfileVer2() {
        // nhập vào info sv và in ra
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        // Version đẹp trai
        while (true) { // vòng lặp vô tận
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;  // đúng thì thoát lặp, sai thì nhập lại
            } catch (Exception e) {
                System.out.println("Do you know how to input a positive integer?");
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println();
        System.out.println("Your profile: ");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
        System.out.println(" ---- End of profile ---- ");
    }

    public static void inputProfile() {
        // nhập vào info sv và in ra
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        try {
            // lệnh văng miểng nằm ở đây
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            // e chính là tin nhắn màu đỏ JVM gửi mình lưu ý rằng có cà chớn, ngoại lệ
            // xử lí đi, tao k giết app đâu
            // ngầm phía sau JVM Exception e = new Exception ("câu chửi bới, lưu ý gì đó")
            // có 2 cách: default, bắt vòng lên nhập lại
            yob = 69;
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println();
        System.out.println("Your profile: ");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
        System.out.println(" ---- End of profile ---- ");
    }
}

// Data đưa vào cà chớn thì Java sẽ giết app ngay tại chỗ cà chớn
// Khi Java phát hiện có cà chớn nó sẽ gửi cho app 1 tin nhắn/ 1 object 
// thông báo data vớ vẩn, bị exception, bất thường, ngoại lệ
// gửi message xong thì giết app luôn
// Nếu người dùng lỡ tay hoặc k lỡ tay thì cũng cho họ cơ hội sửa sai
// sửa sai tức là k giết app khi có thông tin cà chớn
// nói với Java đừng giết app để Dev tự lo, cần điều chỉnh code
// Báo JVM đoạn code này có nguy cơ cà chớn, nếu có cà chớn thì báo cho app biết - k giết app
// nhốt câu lệnh cà chớn vào 1 hộp cát/ SANDBOX để xử lí cho an toàn, k ảnh hưởng cái khác
// nhốt trong cụm try - catch
// try { lệnh văng miểng nằm ở đây}
// catch (JVM báo hiệu cho biết có cà chớn này, sửa sai đi)
