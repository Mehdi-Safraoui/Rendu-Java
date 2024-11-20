package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs;

    public Terrestrial() {}

    public Terrestrial(String family , String name , int age , boolean isMammal , int nbrLegs ) {
        super(family , name , age , isMammal);
        this.nbrLegs = nbrLegs;

    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(name + " mange à la fois de la viande et des plantes.");
        }
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(name + " mange de la viande.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT) {
            System.out.println(name + " mange des plantes.");
        }
    }

}
