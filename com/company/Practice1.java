package com.company;

abstract class test1{
    int a=1;

    public abstract void show();

    public void show1()
    {
        System.out.println("hi");
    }


}

interface test2{
    int b=2;

    public void ishow();

    public  void ishow2();

}
public class Practice1 extends test1 implements test2{

    public static void main(String[] args) {
        int a=2;
        int b=3;
        Practice1 p=new Practice1();
        p.show();
        p.ishow2();
        p.ishow();

    }
    @Override
    public void show() {
        System.out.println(a);
    }

    @Override
    public void ishow() {
    System.out.println(b);
    }

    @Override
    public void ishow2() {

    }
}
