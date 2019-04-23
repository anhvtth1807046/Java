package main;

import controller.ApplicationController;
import controller.StudentController;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        ApplicationController controller = new StudentController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Student Manger------------");
        System.out.println("1.Thêm mới sinh viên");
        System.out.println("2.write sv");
        System.out.println("3.Danh sách sinh viên");
        System.out.println("4.Thoát");
        System.out.println("-----------------------------------");
        System.out.println("Vui lòng nhập lựa chọn từ 1 đến 4.");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                controller.create();
                break;
            case 2:
                controller.writer();
                break;
            case 3:
                break;
            case 4:
                System.out.println("Hẹn gặp lại bạn sau....");
                System.exit(1);
                break;
            default:
                System.out.println("Bạn đã lựa chọn sai, vui lòng lựa chọn lại.....");
                break;
        }


    }
}
