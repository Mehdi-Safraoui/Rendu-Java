package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;

    public Penguin() {}

    public Penguin(String family , String name , int age , boolean isMammal , String habitat , float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim (){
        System.out.println(" This pinguin is swimming. ");
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(name + " mange de la viande.");
        }
    }
}
