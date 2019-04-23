package main;




import entity.*;

import javax.naming.AuthenticationException;
import java.net.Authenticator;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ApplicationController employeeController = new EmployeeController();
        ApplicationController studentController = new StudentController();


        employeeController.add();
        employeeController.printList();

        studentController.add();
        studentController.printList();


    }
}
//        Authentication authentication = new GoogleAuthentication();
//        Authentication authentication2 = new FacebookAuthentication();
//        authentication2.doLogin();
//        authentication.doLogin();



//    public static void main(String[] args) {
//        Student student = createStudent();
//        printStudentInformation(student);
//    }
//
//    public static Student createStudent() {
//        Scanner scanner = new Scanner(System.in);
//        Student sinVien1 = new Student();
//        System.out.println("Nhap ma sinh vien: ");
//        String rollNumber = scanner.nextLine();
//        sinVien1.setRollNumber(rollNumber);
//        System.out.println("Nhap ten: ");
//        String name = scanner.nextLine();
//        sinVien1.setName(name);
//        System.out.println("Nhap tuoi: ");
//        int age = scanner.nextInt();
//        sinVien1.setAge(age);
//        scanner.nextInt();
//        System.out.println("Nhap dia chi: ");
//        String address = scanner.nextLine();
//        sinVien1.setAddress(address);
//        return sinVien1;
//    }
//
//    public static void printStudentInformation(Student student) {
//        System.out.printf("Ma la: %s, Ten la: %s, Tuoi laf: %d, Dia chi la: %s",
//                student.getRollNumber(),student.getName());
//
//    }
//
//
//}

//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        StudentController controller = new StudentController();
//        Student student = controller.createStudent();
//        list.add(student);
//        Student student1 = controller.createStudent();
//        list.add(student1);
//        for (int i = 0; i < list.size(); i++) {
//            Student sv = list.get(i);
//            System.out.println(sv.getName());
//
//        }






//        Scanner scanner = new Scanner(System.in);
//        boolean cont = true;
//        do {
//            System.out.println("-----------------Menu--------------------");
//            System.out.println("1.Nhập tên sinh viên. ");
//            System.out.println("2.In danh sách tên. ");
//            System.out.println("3.Thoát ra.");
//            System.out.println("------------------------------------------ ");
//            System.out.println("Nhập lựa chọn của bạn:");
//            int option = scanner.nextInt();
//            switch (option) {
//                case 1:
//                    System.out.println("Bạn đã lựa chọn nhập tên sinh viên ^_^");
//                    break;
//
//                case 2:
//                    System.out.println("Bạn đã lựa chọn in danh sách tên ^_^");
//                    break;
//
//                case 3:
//                    System.out.println("Bạn đã lựa chọn thoát ra, hẹn gặp lại bạn ^_^");
//
//                default:
//                    System.out.println("Lựa chọn sai vui lòng nhập lại trong khoảng từ 1 đến 3.");
//                    cont = false;
//                    break;
//
//            }
//
//
//        }            while (cont) ;
//
//
//
//
//        System.out.println("Please enter number 1: ");
//        int number1 = scanner.nextInt();
//        System.out.println("Please enter number 2: ");
//        int number2 = scanner.nextInt();
//        System.out.println("Total is " + Calculator.add(number1, number2));
//        System.out.println("Minus is " + Calculator.minus(number1, number2));


//    }
//
//
//}

