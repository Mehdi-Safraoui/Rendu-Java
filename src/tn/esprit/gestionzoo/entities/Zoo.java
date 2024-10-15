package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected Animal[] animals;
    protected String name, city;
    protected final static int nbrCages = 25;
    protected int animalCount;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
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

    public void displayZoo() {
        System.out.println("tn.esprit.gestionzoo.entities.Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null) {
                System.out.println("Nom: " + animals[i].name);
                System.out.println("Famille: " + animals[i].family);
                System.out.println("Âge: " + animals[i].age);
            }
        }
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo plein impossible d'ajouter d'animal");
            return false;
        }
        else {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }

    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                animals[i] = null;
                animalCount--;
                System.out.println("tn.esprit.gestionzoo.entities.Animal supprimé avec succés");
                return true;

            }
        }
        System.out.println("tn.esprit.gestionzoo.entities.Animal n'existe pas");
        return false;
    }

    boolean isZooFull() {
        return animalCount == nbrCages;
    }

    Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount)
            return z1;
        else if (z1.animalCount < z2.animalCount)
            return z2;
        else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null;
        }
    }
}