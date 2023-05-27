package varandfunction;

import java.util.Scanner; // ~ #include<stdio.h>

public class VarAndFunction {

    public static void main(String[] args) {
        //playWithVariables();
        //playWithIntegers();
        //playWithDoubles();
        //playWithCharacters();
        //playWithBooleans();
        //printIntegerList();
        int n = getAPositiveInteger();
        System.out.println("Your number: " + n);
        printIntegerList(n);
        //printIntegerList(500);
    }
    
    public static int getAPositiveInteger() {
        int n;
        // phải nhập từ bàn phím, xài kĩ thuật OOP
        // chấm và bung lụa
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        n = banPhimCuaTui.nextInt();
        return n; // getAPositiveInteger() = n
    }
    
    // in n số tự nhiên tính từ 1
    // hiện tượng 1 class bất kì chứa nhiều hàm trùng tên nhưng khác phần 
    // tham số - mà phải khác trên data type chứ k phải khác trên tên biến
    // gọi là OVERLOAD/ OVERLOADING ~ quá tải hàm
    // # vs. OVERRIDE
    // POLYMORPHISM: tính đa hình
    
    public static void printIntegerList(int m) {
        // k scanf(n) here vì n đã có value khi xài
        // body of function
        System.out.println("The list of " + m + " first integers: ");
        for (int i = 1; i <= m; i++) 
            System.out.print(i + " ");
            //System.out.printf("%d ", i);
        System.out.print("\n"); 
    }
    
    public static void printIntegerList() {
        // in ra các stn từ 1 - 100
        System.out.println("The list of 100 first integers: ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
            
    public static void playWithBooleans() {
        // C: đúng thì quy ước là 1 hoặc > 0, còn sai = 0
        // dùng int để lưu trạng thái đúng sai
        // Java: đúng thì true, sai thì false
        // dùng Boolean (data type mới) để để lưu trạng thái đúng sai
        boolean marriedStatus = true;
        if (marriedStatus == true)
            System.out.println("Đánh đồn có địch mới vui");
        else 
            System.out.println("Em làm gì đã có người yêu");
    }
            
    public static void playWithCharacters()  {
        // 2 bytes cho kiểu char trong Java
        char m = '$';
        System.out.println("unit: " + m);
        // muốn lưu tên bên C thì cần mảng các kí tự
        // k còn primitive nữa, phức tạp hơn rồi: char name[] = "Ahihi";
        
        String name = "Phướt tờ";
        // loại data type mới hoàn toàn, phức tạp do bao gồm nhiều thức khác
        // object data type
        System.out.println("My name is: " + name);
        System.out.println("1st letter in my name: " + name.charAt(0));
        System.out.println("My name as in a upper case: " + name.toUpperCase());
        
    }
    
    public static void playWithDoubles() {
        // trong Java ưu tiên double hơn float
        // => mọi literal đều được hiểu là double (8 bytes)
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi);    // bên java cấm dùng %lf
        
        float vat = 0.1F;
        System.out.println("vat: " + vat);
    }
            
    public static void playWithIntegers(){
        int n = 39;     // mọi con số, kí tự xuất hiện trong 
                        // code gọi được là literal value
                        // số nguyên xuất hiện trong code mặc định là int
        System.out.println("n : " + n); 
         
        long m = 3000_000_000L; // phân cách literal trong code cho dễ đọc
                                // chứ k in ra màn hình dấu "_"
        System.out.println("m : " + m);
        
        int status = 0xFA;  // 0x ~ hệ 16 (hexa)
        System.out.println("status: " + status);
    //  int phone = 0909;   // 0 ~ hệ 8 (octal)
    //  hệ 8 chỉ lưu được từ 0 - 7 nên báo lỗi
        int phone = 010; // 10 (octal) = 8 (dec)
        System.out.println("phone: " + phone);
    }
            
    //static thì chỉ chơi với static - OOP
    public static void playWithVariables() {
        // biến là 1 vùng RAM được đặt tên, chiếm 1 số byte nhất định
        // tùy loại dữ liệu/ thông tin mà nó sẽ chứa bên trong - data type
        // biến là cách đặt tên cho 1 đại lượng, 1 giá trị - đơn, phức...
        int age = 20; 
        int a = 10, b;
        b = 100;
        // tốn 12 byte trong RAM
        System.out.println("age: " + age); // ~printf("age: %d\n", age);
        int yob = 2001;
        age = 2021 - yob;
        System.out.println("age again: " + age);
        System.out.println("age by using transitive: " + (2021 - yob));
        System.out.printf("age printed by using %% as in C: %d\n", (2021 - yob));
        
    }
}
