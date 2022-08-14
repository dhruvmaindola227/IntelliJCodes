package RandomTesting;

import java.util.Arrays;

public class College{

    public static void main(String[] args) {
        College[] students = {
                new College(1,"Vibhu" , 99999 , "mayapuri , new delhi" , 120012),
                new College(1,"Dhruv" , 99998 , "vikaspuri , new delhi" , 120018) ,
                new College(1,"Chirag" , 10020 , "mongolpuri , new delhi" , 120043),
                new College(1,"Rohan" , 12343 , "pitampura , new delhi" , 923402)};


        System.out.println(findCollegeWithMaximumPincode(students));
        System.out.println(searchCollegeByAddress(students , "vikaspuri , new delhi"));

    }

    public static College findCollegeWithMaximumPincode(College[] students){
        return Arrays.stream(students).max((o1, o2) -> o1.pincode - o2.pincode).orElse(null);
    }

    public static College searchCollegeByAddress(College[] students , String address){
        return Arrays.stream(students).filter(student -> student.address.equals(address)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNo=" + contactNo +
                ", address='" + address + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pincode;

    College(){

    }

    public College(int id, String name, int contactNo, String address, int pincode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pincode = pincode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public int getPincode() {
        return pincode;
    }
}
