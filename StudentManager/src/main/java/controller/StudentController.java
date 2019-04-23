package controller;

import entity.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController implements ApplicationController {
    private ArrayList<Student> list = new ArrayList<Student>();


    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên:");
        String rollNumber = scanner.nextLine();
        System.out.println("Nhap ten sinh vien:");
        String name = scanner.nextLine();
        Student student = new Student(rollNumber, name);
        list.add(student);
    }

    public void writer() throws IOException {
        String srr = "";
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/Student.txt"));
        for (Student st : list) {
            srr += st.toString() + "\n";
        }
        writer.write(srr);
        writer.close();
        System.out.println("Thanh cong!");

    }

    public void readList() {

        String line = null;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/Student.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Student st:
             list) {
            String str = "";

        }

    }

    public void delete() {

    }
}
