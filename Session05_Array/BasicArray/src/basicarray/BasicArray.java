package basicarray;

/**
 *
 * @author Huynh Van Phuot
 */
public class BasicArray {

    public static void main(String[] args) {
        //playWithPrimitiveArrayV3();
        // playWithAStudent();
        //playWithObjectArray();
        //sortObjectArray();
        //sortPrimitives();
        //sortPrimitivesV2();
        sortObjectArrayV2();
    }

    public static void sortObjectArrayV2() {
        Student[] arr = new Student[2];

        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.0);
        System.out.println("The list of student before sorting: ");
        
        for (Student x : arr) {
            x.showProfile();
        }
        
        // cấm tuyệt đối đi so sánh 2 biến con trỏ, 2 số nhà
        // vì nó không cụ thể, phải chấm để lấy value bên trong mà so sánh
        if (arr[0].getGpa() > arr[1].getGpa()) {
            Student temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        System.out.println("The list of student after sorting: ");
        for (int i = 0; i < 2; i++) {
            arr[i].showProfile();
        }
    }

    public static void sortPrimitivesV2() {
        int a = 5, b = 10;
        System.out.println("a: " + a + "|b: " + b);

        // nếu lộn xộn thứ tự thì mới đổi
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        System.out.println("a: " + a + "|b: " + b);

    }

    public static void sortPrimitives() {
        int a = 9, b = 5;
        // quy ước a đứng đầu, b đứng sau nên khi in default sẽ giảm dần
        System.out.println("a: " + a + "|b: " + b);
        // sort tăng dần thì phải đổi chỗ a và b
        int t = a;
        a = b;
        b = t;
        System.out.println("a: " + a + "|b: " + b);

    }

    public static void sortObjectArray() {
        Student[] arr = new Student[2];
        // 1 biến má mì + 2 biến sv, biến object

        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.0);
        System.out.println("The list of student before sorting: ");
//        for (int i = 0; i < arr.length; i++) {
//            // arr[i].showProfile();
//            System.out.println(arr[i].toString());
//        }

        for (Student x : arr) {
            x.showProfile();
        }
        // sắp xếp mảng object sẽ dựa trên việc trỏ đúng data hay k
        // data trong vùng object sẽ quyết định việc trỏ
        // sắp xếp mảng của biến object chẳng qua là đổi chỗ trỏ, 
        // vị trí trỏ, value con trỏ

        Student temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println("The list of student after sorting: ");
        for (int i = 0; i < 2; i++) {
            arr[i].showProfile();
        }

    }

    // mảng Object --> bắt đầu khó rùi nà
    public static void playWithObjectArray() {
        // lưu 50 sinh viên của lớp
        // cần 50 biến, sau đó new phễu() 50 lần tương ứng
        int v[] = new int[50];
        // 50 nhát new() để lưu hồ sơ sv, để gán value
        Student s[] = new Student[50];     // 50 biến sv chưa có ai cụ thể
        // vì là biến object nên phải dùng new
        s[0] = new Student("SE123456", "AN NGUYỄN", 2001, 5.6);
        s[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.7);
        s[2] = new Student("SE123458", "CƯỜNG VÕ", 1999, 5.8);
        // 47 biến còn lại phải là default
        s[0] = null;    // clear biến object s[0] đã gán ở trên
        // phần new Student("SE123456", "AN NGUYỄN", 2001, 5.6);
        // sẽ thành vô danh, mồ côi --> gc gom liền
        System.out.println("The list of students: ");
        for (int i = 0; i < 3; i++) {
            s[i].showProfile();
        }   // cẩn thận bị con trỏ null cho phần default cho các  biến còn lại, trỏ vào đáy ram
        // byte null là byte chứa toàn số 0, transistor off hết (00000000)
        // địa chỉ của nó nằm ở vị trí đầu tiên của ram, byte thứ 0, vị trí 0, tọa độ 0
        // biến con trỏ là biến sẽ lưu value, tọa độ
        // nếu phần tử trong mảng object (biến object) k được gán giá trị thì default sẽ là 0
        // sẽ trỏ đến đáy ram (tọa độ của byte thứ 0 - byte null --> nullpointer)
        // khi chơi với mảng phải nhớ k được for hết mảng vì phần chưa gán của biến object sẽ trỏ null
        // chỉ for đến count, tức là đến chỗ đã gán new
        // biến lẻ chưa gán giá trị thì k được quyền còn biến object default sẽ gán null

    }

    public static void playWithAStudent() {
        Student x;  // x gọi là biến object
        x = new Student("SE123456", "AN NGUYỄN", 2001, 5.6);
        // bên trong là value phức tạp
        x.showProfile();
    }

    // ktra lại các kiến thức về mảng primitive
    public static void playWithPrimitiveArrayV3() {
        int arr1[] = {5, 10, 15, 20, 25};    // có 5 biến int đã có value
        // new ngầm, calloc() 5 biến int có value
        int arr2[] = new int[]{5, 10, 15, 20, 25};  // new rồi gán, tương đương lệnh trên
        int arr3[];
        arr3 = new int[5];          // default hết cho tất cả các biến int thứ i
        int arr[] = new int[5];     // chuẩn nhất
        // arr[0] là 1 biến int bình thường còn arr là tên mảng, biến má mì, biến con trỏ
        // vùng new rộng hơn bên C, có hàm luôn, có biến đặc điểm luôn
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        // [3], [4] default chứ k phải rác như bên C
        // default: số --> 0, boolean --> false
        System.out.println("The array has: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // length là non-static vì mỗi mảng có kích thước khác nhau
        // biến mảng trỏ vùng new, bên trong là 1 đống biến primitive + hàm + length
        // đống biến này k chơi kiểu get(), set() vì nó đồng nhất data type
        // cho sờ trực tiếp qua [i]
        // mảng là 1 đống biến
        // vùng new có hàm toString() convert toàn bộ value
        System.out.println("The array has: " + arr);    // gọi thầm tên em
        for (int x : arr3) {
            System.out.print(x + " ");
        }
    }

    public static void playWithPrimitiveArrayV2() {
        // double *arr = calloc(7, sizeof(double));
        double arr[] = new double[36];     // arr là con trỏ để trỏ vùng new chứa 365 biến primitive
        // STACK        // HEAP             // giá trị 365 biến này default là 0
        // new trả về gốc tọa độ, gốc cụm 365 
        // nhưng k chơi chấm để lấy từng biến
        // xài [] như thường
        arr[0] = 6789;
        System.out.println("The array has value of: ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("The array has value of (using for i): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // tên mảng là biến má mì, biến object, biến con trỏ, biến tham chiếu
        // trỏ vào vùng trong new [] chứa nhiều biến khác
        // má mì quản lí nhiều elements trong mảng
        // má mì.length sẽ trả về kích thước của mảng
    }

    // primitive là biến đơn giá trị, 1 vùng ram, 1 giá trị
    // k có bao giờ chấm nhen, có value là quất thôi chấm gì nữa ba
    public static void playWithPrimitiveArray() {
        // double vol[365]; // k cho phép ghi kích thước mảng, số phần tử lúc khai báo
        // double v[100] = {0, 5, 10, 15}; // k được ghi số phần tử mảng
        double v[] = {0, 5, 10, 15, 20, 25, 30};    // mảng có 7 biến double primitive
        // bắt đầu từ v[0], v[1], v[i]
        System.out.println("v[0]: " + v[0]);
        System.out.println("v[1]: " + v[1]);
        System.out.println("v[2]: " + v[2]);

        v[0] = 68;
        System.out.println("The array has value of: ");
        for (int i = 0; i < 7; i++) {   // cấm for vượt biên
            System.out.print("v[" + i + "]: " + v[i] + " | ");
        }
        System.out.println();
        System.out.println("The array has value of (printed by using for each): ");
        for (double x : v) {
            // với mọi x là số thực thuộc tập hợp v
            // x có quyền bằng từng phần tử trong v
            // x = v[0]; x = v[1]; x = v[2]....
            // do đó sout(x) ~ sout(v[i])
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
