package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    @Override
    public void learn() {
        System.out.println(getName()+" azyrky uchurda jany yr jazyp jatat.");
    }
    @Override
    public void walk() {
        super.walk();
    }
    @Override
    public void eat() {
        System.out.println("Jakshy korgon tamagy plov.");
    }
    public void singing(){
        System.out.println(getName()+"dyn gruppasy "+bandName+" tobu.");
    }
    public void playGitar(){
        System.out.println(getName()+" Toktorov gitarada jakshy oinoit.");
    }
    @Override
    public String toString() {
        return "Singer{" +"bandName='" + bandName + '\'' +"} " + super.toString();
    }
}
