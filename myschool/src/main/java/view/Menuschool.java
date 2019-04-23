package view;

import com.sun.glass.ui.View;
import controller.ApplicationController;
import controller.StudentController;

import java.util.Scanner;

public class Menuschool {
    public static void menuschool() {
        ApplicationController controller = null;
        Menu view = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----Trang quản lý nhà trường-----");
            System.out.println("1.Quản lý giáo viên");
            System.out.println("2.Quản lý giáo vụ");
            System.out.println("3.Quản lý học sinh");
            System.out.println("4.Thoát trang");
            System.out.println("-----------------------------------");
            System.out.println("------Chọn từ 1 đến 4--------------");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    controller = new StudentController();
                    view = new MenuStudent();
                    break;
                case 4:
                    System.out.println("Hẹn gặp lại bạn sau...");
                    break;
                default:
                    System.out.println("Bạn lựa chọn sai rồi, vui lòng lựa chọn từ 1 đến 4");
                    break;
            }
            if (view != null){
                view.menu(controller);
            }
        }

    }
}
