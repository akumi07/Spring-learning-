package org.example.Springxml;

public class Alien {

    private int age ;

    public Alien(){
        System.out.println("Alien Object Created");
    }
    void compile(){
        System.out.println("Compiling...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
