package com.company;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    @Override
    public void learn() {
        System.out.println(getName()+" kod jazgan jany tildi uironup jatat.");
    }
    @Override
    public void walk() {
        super.walk();
    }
    @Override
    public void eat() {
        super.eat();
    }
    public void coding(){
        System.out.println(getName()+" "+companyName+" kompaniasynda kod jazyp ishteit.");
    }
    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                "} " + super.toString();
    }
}
