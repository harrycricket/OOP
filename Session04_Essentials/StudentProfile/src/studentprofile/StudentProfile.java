// bài thí nghiệm về việc nhập xuất, k cần OOP

package studentprofile;

import java.util.Scanner;

/**
 *
 * @author Huynh Van Phuot
 */
public class StudentProfile {

    public static void main(String[] args) {
        inputProfile();
    }
    
    public static void inputProfile() {
        // nhập vào info sv và in ra
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        System.out.print("Input yob: ");
        // Quách Tĩnh solution ~ xóa theo phương pháp chính thống
        yob = Integer.parseInt(sc.nextLine());
        // hàm static, cứ chấm mà xài k cần new
        // End of QT 
        
        // Dùng tà chiêu để xóa
//        yob = sc.nextInt();
//        // nextInt() để lại rác trong buffer
//        // cần phải xóa bộ đệm trước khi vào chuỗi
//        // Âu Dương Phong solution, lợi dụng nextLine() để hốt buffer
//        sc.nextLine();  // mục tiêu để hốt buffer còn dư
        // End of tà chiêu
        
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
