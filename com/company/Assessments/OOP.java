package com.company.Assessments;

class Parent{

    public void printVal()
    {
        System.out.println("Parent");
        String s="abc";
    }
}

class Child extends Parent{
    // public void printVal()
    // {
    //     System.out.println("Child");
    // }
}

public class OOP {
public static void main(String[] args) {
    
Parent p=new Child();
p.printVal();



}    
}

