package view;

import java.util.Scanner;

public class MenuStudent {
    public void menustudent() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("********Trang quản lý sinh viên*******");
            System.out.println("1.Thêm mới sinh viên");
            System.out.println("2.Hiển thị danh sách sinh viên");
            System.out.println("3.Sửa sinh viên");
            System.out.println("4.Xoá sinh viên");
            System.out.println("5.Quay lại");
            System.out.println("*****Vui lòng lựa chọn từ 1 đến 5******");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Hẹn gặp lại bạn sau...");
                    break;
                default:
                    System.out.println("Bạn lựa chọn sai rồi, vui lòng lựa chọn lại từ 1 đến 5.");
                    break;
            }
            if (choice == 5){
                break;
            }
        }

    }
}
