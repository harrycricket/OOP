
package data;

public class Student {
    private static String id;
    public static String name;
    // những thằng có static khi clone Khuôn sẽ ra chỗ khác ngồi
    // chỉ clone 1 cái duy nhất, thằng đầu tiên đi tiên phong
    // thằng đi trước đã clone rồi thì thằng đi sau chỉ việc lấy sài
    // các biến static có cùng value và ăn theo thằng cuối cùng
    // static là vùng nhớ dùng chung cho các object cùng loại
    // nếu 1 ai đó tác động thì tất cả bị ảnh hưởng
    
    public int yob;
    private double gpa;     // grade point average
    // non-static
    
    public Student(String id, String iName, int yob, double gpa) {
        this.id = id;
        name = iName;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f", 
                            id, name, yob, gpa);
    }

    public void showProfile() {
        System.out.printf("|%8s|%-15s|%4d|%4.1f|\n", 
                            id, name, yob, gpa);
    }
    // NON-STATIC chơi được với cả NON-STATIC và STATIC luôn,
    // đồ riêng đã thành của chung
    // còn STATIC chỉ chơi với STATIC vì cùng khu vực
    
    public int getAge() {
        return 2021 - yob;
    }
    
    public static void sayHi() {
        System.out.println("Hi everyone, my name is " + name);
        // System.out.println("By the way, my yob is " + yob);
        // yob là non-static nên clone nhiều yob quá
        // k biết in thằng nào
    }
    
}

