package org.example.Springxml;

public class Alien {

    private int age ;
    private Laptop laptop;

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
}
