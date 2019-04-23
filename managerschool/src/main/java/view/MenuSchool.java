package view;

import controller.ApplicationController;

import java.util.Scanner;

public class MenuSchool {
    public static void menuschool() {
        ApplicationController controller = null;
        Imenu view = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chào mừng bạn đã đến với trang quản lý của trường.");
            System.out.println("1.Quản lý giáo viên");
            System.out.println("2.Quản lý giáo vụ");
            System.out.println("3.Quản lý học sinh");
            System.out.println("4.Thoát chương trình");
            System.out.println("--------------------------------------------------");
            System.out.println("********Vui lòng chọn từ 1 đến 4*****************");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Hẹn gặp lại bạn....");
                    break;
                default:
                    System.out.println("Bạn đã lựa chọn sai, vui lòng lựa chọn lại từ 1 đến 4.");
                    break;
            }
            if (view != null){
                view.menu(controller);
                break;
            }
        }

    }


}
