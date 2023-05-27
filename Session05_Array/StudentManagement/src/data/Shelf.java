package data;

import java.util.Scanner;

/**
 *
 * @author Huynh Van Phuot
 */
public class Shelf {

    // đặc điểm của tủ là gì?
    private String color;
    private String label;
    private int count = 0;
    private Student[] arr = new Student[300];
    private Scanner sc = new Scanner(System.in);

    // ta focus vào câu chuyện chính: kệ/ tủ/ phòng chứa những món gì, sinh ra để chứa gì
    // biến cần gán value
    // primitive = value // literal
    // object = new 1 cái gì đó
    // gán trực tiếp k cần qua phễu vì phễu cũng cần phải đổ vào nó lúc new/ clone
    // gán qua phễu
    // mảng ở đây nghĩa là không gian/ khả năng chứa của 1 tủ, chưa nói cụ thể từng món đồ
    // biến mảng thì cần phải được new, hàm ý có bao nhiêu chỗ
    // new mảng để đâu và số phần tử mảng nữa
    // khai báo mảng là khai báo số biến
    // mua tủ là có số ngăn nhưng chưa quan tâm đồ
    // có nhiều kĩ thuật khởi động kích thước mảng
    // đổ kích thước mảng qua phễu
    // new luôn kích thước khi khai báo tủ, new tủ có sẵn kích thước
    // tủ có sẵn 500 chỗ đựng hồ sơ
    // k thể nhét 1 lần hết 500 hồ sơ nên ta phải đưa từ từ từng hồ sơ vào
    // triết lí: ai có nhiều info, gã đó sẽ xử lí, hàm thuộc về object
    // đổ màu sắc, label còn kích thước tủ có sẵn default 500
    // addSv(), removeSv()
    
//    public Shelf(String color, String label, int size) {
//        this.color = color;
//        this.label = label;
//        arr = new Student[size];
//    }
    // Khởi tạo kích thước theo nhu cầu, k fix cứng 
    // Linh hoạt hơn trong việc khởi tạo kích thước của Shelf
    
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void searchAStudent() {
        String id;
        System.out.print("Input the id that you want to search: ");
        id = sc.nextLine();
        // quét toàn bộ mảng để tìm ra sv có id cần tìm
        // quét từ vị trí đầu tiên đến count mảng
        // thuật toán vét cạn, tát nước bắt cá
        for (int i = 0; i < count; i++) {
            if(arr[i].getId().equalsIgnoreCase(id)) {
                System.out.println("Student is found!\nHis/ her profile : ");
                arr[i].showProfile();
                return; // thoát luôn vì tìm thấy rồi
            }
        }
        System.out.println("Student is not found!");
        
    }
    
    public void addAStudent() {
        // một hồ sơ sv cụ thể sẽ được lưu vào mảng, mảng lưu được nhiều data [i] = ...
        // nhập hồ sơ sv từ bàn phím ~ đăng kí member trên website
        String id, name;
        int yob;
        double gpa;
        System.out.println("Input student #" + (count + 1) + "/" + arr.length);
        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr[count] = new Student(id, name, yob, gpa);
        count++;    
        System.out.println("Add a new student profile successfully");
    }
    //  đã có sv nhập vào, mua đồ bỏ vào tủ thôi
    // nhìn qua cửa kiếng, duyệt qua tủ sách
    public void printStudentList() {
        System.out.println("There is/ are " + count + " student(s) in the list: ");
//        for (Student x : arr) {
//            x.showProfile();
//        }   
//        // sẽ duyệt tới hết mảng --> null pointer
        for (int i = 0; i < count; i++) {
            arr[i].showProfile();
        }
    }
}
