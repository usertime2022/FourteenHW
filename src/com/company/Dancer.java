package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    @Override
    public void learn() {
        System.out.println(getName()+" azyrky uchurda jany biy uironup jurot");
    }
    @Override
    public void walk() {
        System.out.println("Al bir kundo 1 km joo basat.");
    }
    @Override
    public void eat() {
        System.out.println(getName()+"dyn jakshy korgon tamagy bul besh barmak.");;
    }
    public void dancing(){
        System.out.println(getName()+"dyn biy gruppasy "+groupName+" dep atalat.");
    }
    @Override
    public String toString() {
        return "Dancer{" +"groupName='" + groupName + '\'' +"} " + super.toString();
    }
}
