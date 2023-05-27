
package studentmanagement;

import data.Student; // ~ mượn đồ để dùng (include <stdio.h>)
import java.util.Scanner;

/**
 *
 * @author Huynh Van Phuot
 */
public class StudentManagement {

    public static void main(String[] args) {
        // saveStudents();
        // inputAStudent(); 
        saveStudents();
    }
    
    // nhập từ bàn phím
    // cần Scanner object bàn phím, OOP thì cái gì cũng là object, class
    // Máy Cam, Scanner, Bàn Phím Cơ, Touchpad --> nhóm quét dữ liệu 
    // đưa vào máy tính, Class Scanner xuất hiện, muốn xài thì phải new để nó hành xử
    // từ bàn phím đi vào RAM do đó phải có biến hứng value
    
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);
        
        // nhập chuỗi trước số sẽ k bị hiện tượng lạc trôi lệnh
        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: ");
        name = sc.nextLine();
        
        System.out.print("Input yob: ");
        yob = sc.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
        // x.setId(); nguy hiểm do Id các sinh viên k được trùng nhau
    }
    
    // hard-code
    public static void saveStudents() {
        Student phuot = new Student("SE160205", "PHƯỚT TỜ", 2002, 9.6);
        Student harry = new Student("SE160200", "Hà Rí", 2002, 9.5);
        phuot.showProfile();
        harry.showProfile();   
        
        //chấm thì xổ ra gì? Access Modifier/ Access Specifier
        System.out.println("Phuot name (directly): " + phuot.name);
        System.out.println("Phuot name (directly): " + phuot.getName());
        // vì sờ được trực tiếp instance variable nên ta có thể get() và set()
        // phuot.name = "Không học bài";
        Student.name = "CÀY RANK HƠN CÀY CODE";
        
        System.out.println("Harry name (directly): " + harry.name);
        System.out.println("Phuot name again (directly): " + phuot.name);
        
        System.out.println("Student name (directly): " + Student.name);
                
        phuot.showProfile();
        // sayHi() mà sayHi() đang là static
        System.out.println("Using static");
        phuot.sayHi();  // k tư hữu theo kiểu riêng mình cho static
        harry.sayHi();
        Student.sayHi();    // tên Class.static vì là đồ chung (multiple objects)
        
        // 2 loại dấu chấm
        // chấm trực tiếp qua tên Class tức là chạm vào STATIC
        // chấm qua con đường new, tức là bạn đang hàm ý chơi với NON-STATIC: 
        // đồ riêng của từng object

    }
}

// STATIC ĂN THEO THẰNG CUỐI CÙNG 
// Static là vùng nhớ xài chung cho các objects cùng Nhóm/ Class
// Dữ liệu đổ vào hay chỉnh sửa ăn theo thằng cuối cùng nó đổ/ gán
// CHỐT HẠ: k dùng static cho những thứ/ đặc điểm/ hàm mà của riêng từng object
// tui có mã số, bạn có mã số nhưng là riêng của mỗi đứa
// mình chung đặc điểm nhưng khác value nên phải có biến riêng
// nên phải là NON-STATIC 