package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected Animal[] animals;
    Aquatic [] aquaticAnimals;
    protected String name, city;
    protected final static int nbrCages = 25;
    protected int animalCount;

    public Zoo() {
        aquaticAnimals = new Aquatic[10];
    }

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
        aquaticAnimals = new Aquatic[10];
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        int i = 0;
        while (i < aquaticAnimals.length) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println("Aquatic animal ajouté avec succès");
                return;
            }
            i++;
        }
        System.out.println("Le tableau est déjà plein !");
    }

    public void displayAquaticAnimalsSwim() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
    }

    public float maxPenguinSwimmingDepth(){
        float maxDepth =0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.swimmingDepth>maxDepth){
                    maxDepth = penguin.swimmingDepth;
                }
            }
        }
        System.out.println("max swimming depth : " + maxDepth);
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType(){
        int nbrDauphins=0;
        int nbrPenguins=0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                nbrPenguins++;
            }
            else if (aquatic instanceof Dolphin) {
                nbrDauphins++;
            }
        }
        System.out.println("Le nombre des dauphins est = " + nbrDauphins);
        System.out.println("Le nombre de penguins est = " + nbrPenguins);
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if (name == null){
            System.out.println("Le nom du zoo est vide");
            this.name = "tn.esprit.gestionzoo.entities.Zoo inconnu";
        }
        else {
            this.name = name;
        }
    }




}