package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
    protected String habitat;

    public Aquatic() {}

    public Aquatic (String family , String name , int age , boolean isMammal , String habitat){
        super (family, name, age , isMammal);
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Dolphin)){
            return false;
        }

        Aquatic aquatic = (Aquatic) obj;
        return  this.name.equals(aquatic.name) &&
                this.age == aquatic.age &&
                this.habitat.equals(aquatic.habitat);
    }

    public String getHabitat () {
        return habitat;
    }

    public void setHabitat (String habitat) {
        this.habitat = habitat;
    }

    public abstract void swim ();

}
