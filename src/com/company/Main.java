package com.company;

public class Main {

    public static void main(String[] args) {
	Programmer programmer = new Programmer("Akjol","programmer","Microsoft");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    Dancer dancer = new Dancer("Atai","dancer","Adem");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    Singer singer = new Singer("Baktiar","singer","Biz");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
