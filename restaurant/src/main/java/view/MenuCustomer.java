package view;

import entity.Customer;

import java.util.Scanner;

public class MenuCustomer {
    public void menuCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Customer-------");
        System.out.println("Nhập mã khách hàng:");
        String id = scanner.nextLine();
        System.out.println("Nhập tên khách hàng:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi khách hàng:");
        String age = scanner.nextLine();
        System.out.println("Nhập email khách hàng:");
        String email = scanner.nextLine();
        Customer customer = new Customer(id, name, age, email);


    }
}
