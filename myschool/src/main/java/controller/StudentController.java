package controller;

import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController implements ApplicationController{
    ArrayList<Student> list = new ArrayList<Student>();
    Scanner scanner = new Scanner(System.in);

    public void create() {
        System.out.println("-----Thêm mới sinh viên------");
        System.out.println("1.Nhập mã sinh viên");
        String rollNumber = scanner.nextLine();
        System.out.println("2.Nhập tên");
        String name = scanner.nextLine();
        System.out.println("3.Nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("4.Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("5.Nhập số điện thoại");
        int phone = scanner.nextInt();
        scanner.nextLine();
        System.out.println("6.Nhập email");
        String email = scanner.nextLine();
        Student student = new Student(rollNumber, name, age, address, phone, email);



    }

    public void readList() {

    }

    public void update() {

    }

    public void delete() {

    }

    public void find() {

    }
}
