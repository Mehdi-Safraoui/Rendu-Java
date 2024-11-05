package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    public String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {}

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println(" Age invalide ");
            this.age = 0;
        }
        else
            this.age = age;
    }
}
