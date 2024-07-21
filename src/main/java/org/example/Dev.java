package org.example;

public class Dev {
    private Laptop laptop;
//    private int age;

    public Dev() {
        System.out.println("Dev Default Constructor");
    }

//    public Dev(int age) {
//        this.age = age;
//        System.out.println("Dev Parameterized Constructor");
//    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev Parameterized Constructor");
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {
        System.out.println("Working on an AWESOME project!");
        laptop.compile();
    }
}
