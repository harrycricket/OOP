package main;

import data.Shelf;
import java.util.Scanner;

/**
 *
 * @author Huynh Van Phuot
 */
public class StudentManagement {

    public static void main(String[] args) {
        int choice;     // lưu lựa chọn
        Scanner sc = new Scanner(System.in);
        Shelf tuSE = new Shelf("PINK", "SE MAJOR");

        do {
            printMenu();
            System.out.print("Input your choice (1 to 6): ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    tuSE.addAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Catch your later!");
                    break;
                default:
                    System.out.println("Please choose from 1 to 6!");
                    break;
            }
        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("Welcome to FPT Academic Portal.");
        System.out.println("Choose the following functions to play with:");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile");  // xóa k hẳn là xóa, xóa là ẩn
        System.out.println("6. Quit");
    }

    public static void checkShelf() {
        // mua tủ về chứa hồ sơ sv cụ thể, mỗi tủ default 500 sv
        Shelf tuSE = new Shelf("PINK", "SE MAJOR");
        Shelf tuGD = new Shelf("RAINBOW", "GD MAJOR");
        tuSE.addAStudent();
        tuSE.addAStudent();
        tuGD.addAStudent();
        System.out.println("The student list for all majors: ");
        tuSE.printStudentList();
        tuGD.printStudentList();
    }

}
