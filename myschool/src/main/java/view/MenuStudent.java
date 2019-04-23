package view;

import controller.ApplicationController;

import java.util.Scanner;

public class MenuStudent implements Menu {
    public void menu(ApplicationController controller) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----Trang quản lý sinh viên-----");
            System.out.println("1.Thêm mới sinh viên");
            System.out.println("2.Hiển thị sinh viên");
            System.out.println("3.Sửa sinh viên");
            System.out.println("4.Xoá sinh viên");
            System.out.println("5.Tìm kiếm sinh viên");
            System.out.println("6.Quay lại");
            System.out.println("--------Chọn từ 1 đến 6----------");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.create();
                    break;
                case 2:
                    controller.readList();
                    break;
                case 3:
                    controller.update();
                    break;
                case 4:
                    controller.delete();
                    break;
                case 5:
                    controller.find();
                    break;
                case 6:
                    System.out.println("Hẹn gặp lại bạn sau...");
                    break;
                default:
                    System.out.println("Bạn lựa chọn sai rồi, vui lòng chọn từ 1 đến 5...");
                    break;
            }
            if (choice == 5){
                break;
            }

        }

    }
}
