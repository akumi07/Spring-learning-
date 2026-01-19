package org.example.Springxml;


import org.springframework.stereotype.Component;

@Component

public class Alien {

    private int age ;
    private Laptop laptop;
    private Computer computer;

    public Alien(Laptop laptop, int age) {
        System.out.println("Param constructor called");
        this.laptop = laptop;
        this.age = age;
    }

    public Alien(){
        System.out.println("Alien Object Created");
    }
    void compile(){
        System.out.println("Compiling...");
        //ref Attribute use krnge (spring.xml me) laptop ka object bnane k lye tki kyuki upar hmlog ne object intialize nhi kiya to null pointer exception de rha hai
        laptop.compile();
    }

    public int getAge() {
        return age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public  void code(){
        System.out.println("Compiling code..");
        computer.compile();
    }
}
