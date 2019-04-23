package controller;

import java.util.Scanner;

import java.util.ArrayList;

public class StudentController implements Mycontroller {
    private ArrayList<StudentController> list = new ArrayList<>();


    @Override
    public void create() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhập mã sinh viên:");
        String rollNumber = scanner.nextLine();
        System.out.println("Nhập tên sinh viên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên:");
        int age = scanner.nextInt();
        System.out.println("Nh");

    }

    @Override
    public void readList() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
