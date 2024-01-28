package org.streammethode;

class Student {
    int student_id;
    String name;
    String course;
    Address address;

    public Student() {
    }

    public Student(int student_id, String name, String course, Address address) {
        this.student_id = student_id;
        this.name = name;
        this.course = course;
        this.address = address;
    }

    void display() {
        System.out.println(student_id + "\n" + name +   "\n" + course);
        System.out.println(address.area  + "\n"+ address.city + "\n" + address.zipcode);
    }

    public static void main(String[] args) {
        Address add = new Address("Mohammadpur", "Dhaka", "1207");
        Student std = new Student(1272022, "Mohinur", "Java", add);
        std.display();

    }

}

class Address {
    String area, city, zipcode;

    public Address() {

    }

    public Address(String area, String city, String zipcode) {
        this.area = area;
        this.city = city;
        this.zipcode = zipcode;
    }

}
