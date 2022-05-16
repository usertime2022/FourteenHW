package com.company;

public class Person {
    private String name;
    private String designation;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public void learn(){
        System.out.println(name+" til uironup jurot");
    }
    public void walk(){
        System.out.println(name+" bir kundo 2 km joo basat.");
    }
    public void eat(){
        System.out.println("Al KFC jegendi jakshy korot.");
    }
    @Override
    public String toString() {
        return "Person{" +"name='" + name + '\'' +", designation='" + designation + '\'' +'}';
    }
}