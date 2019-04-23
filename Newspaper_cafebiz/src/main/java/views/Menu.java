package views;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("------Trang chủ------");
            System.out.println("1.vnexpress");
            System.out.println("2.cafebiz");
            System.out.println("3.Thoát chương trình.");
            System.out.println("----------------------");
            System.out.println("Vui lòng chọn từ 1 đến 3.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Hẹn gặp lại bạn sau....");
                    break;
                default:
                    System.out.println("Bạn đã lựa chọn sai, vui lòng nhập từ 1 đến 3.");
                    break;
            }

            if (choice == 3){
                break;
            }


        }
    }

}
