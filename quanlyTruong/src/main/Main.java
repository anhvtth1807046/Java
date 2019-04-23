package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chào mừng bạn đã đến trang quản lý nhà trường!!!!");
        System.out.println("-------------------------------------------------");
        System.out.println("Hãy nhập lựa chọn của bạn:");
        System.out.println("1 - Quản lý học sinh.");
        System.out.println("2 - Quản lý giáo vụ.");
        System.out.println("3 - Quản lý giáo viên.");
        System.out.println("4 - Thoát trang.");
        System.out.println("--------------------------------------------------");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Trang quản lý sinh viên.");
                break;
            case 2:
                System.out.println("Trang quản lý giáo vụ.");
                break;
            case 3:
                System.out.println("Trang quản lý giáo viên.");
                break;
            case 4:
                System.out.println("Bạn lựa chọn thoát, hẹn gặp lại bạn sau...!!!");
                System.exit(1);
            default:
                System.out.println("Bạn đã lựa chọn sai, vui lòng lựa chọn lại từ 1 ==> 4.");
                break;

        }

    }
}
