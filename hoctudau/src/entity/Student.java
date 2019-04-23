package entity;

public class Student {
    private String rollNumber;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public String getRollNumber() {
        return rollNumber;

    }

    public Student(String rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }





//    // dùng setter đưa vào
//    public void setRollNumber(String rollNumber) {
//        this.rollNumber = rollNumber;
//    }
//
//    public String getRollNumber(){
//        return this.rollNumber;
//    }
//
//    public void walking(){
//
//    }
//
//
//    public void study(){
//
//    }
//    public void play(){
//
//    }
}
