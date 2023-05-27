package basicarray;

import java.util.Scanner;

/**
 *
 * @author Huynh Van Phuot
 */
public class Sorting {

    // main đầu tiên sẽ là main() default
    // đứng ở bất kì class nào F6 thì main() default đều chạy
    // main() thứ 2  muốn chạy thì phải mở nó lên rồi Shift F6
    // đổi daefault = cách: 
    // chuột phải trên project --> properties --> run --> main class --> browse
    public static void main(String[] args) {
        //sortPrimitiveArrayV2();
        //sortStudentList();
        inputStudentList();
    }

    public static void inputStudentList() {
        Student[] arr;  // chưa biết có bao nhiêu sv
        int count;
        String id, name;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students do you want to input: ");
        // count = sc.nextInt(); --> trôi lệnh, dùng try - catch, MyToys
        count = Integer.parseInt(sc.nextLine());
        arr = new Student[count];
        
        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.print("Input id: ");
            id = sc.nextLine();

            System.out.print("Input name: ");
            name = sc.nextLine();

            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());

            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine()); 
            
            arr[i] = new Student(id, name, yob, gpa);
        }
        
        System.out.println("The student list: ");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
            
    public static void sortStudentList() {
//        Student[] arr = new Student[5];
//        arr[0] = new Student("SE9", "CHÍN", 19, 9.0);
//        arr[1] = new Student("SE5", "NĂM", 15, 5.0);
//        arr[2] = new Student("SE8", "TÁM", 18, 8.0);
//        arr[3] = new Student("SE2", "HAI", 12, 2.0);
//        arr[4] = new Student("SE7", "BẢY", 17, 7.0);
        Student[] arr = new Student[]{
                                        new Student("SE9", "CHÍN", 19, 9.0),
                                        new Student("SE5", "NĂM", 15, 5.0),
                                        new Student("SE8", "TÁM", 18, 8.0),
                                        new Student("SE2", "HAI", 12, 2.0),
                                        new Student("SE7", "BẢY", 17, 7.0)
                                        };
        System.out.println("The student list before sorting: ");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("");
        System.out.println("The student list after sorting: ");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    public static void sortPrimitiveArrayV2() {
        int[] arr = new int[]{1000, -1000, 20, -20, 1000, 30, -3000};
        System.out.println("The array before sorting ascending: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("The array after sorting ascending 1's time: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    public static void sortPrimitiveArray() {
        int[] arr = new int[]{1000, -1000, 20, -20, 1000, 30, -3000};
        // sorting ascending 
        System.out.println("The array before sorting ascending: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        // selection sort tăng dần thì phải đưa thằng nhỏ nhất ra đầu tiên
        // [0] phải nhỏ nhất trong dãy

        // chỉ sắp xếp phần tử đầu tiên
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                int t = arr[0];
                arr[0] = arr[i];
                arr[i] = t;
            }
        }
        System.out.println("The array after sorting ascending 1's time: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            if (arr[1] > arr[i]) {
                int t = arr[1];
                arr[1] = arr[i];
                arr[i] = t;
            }
        }
        System.out.println("The array after sorting ascending 2's time: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        // ...
    }
}
