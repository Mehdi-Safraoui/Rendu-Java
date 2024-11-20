package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;


public class ZooManagement {
    public static void main(String[] args) {

        Zoo myZoo=new Zoo();
        Animal animal = new Animal ("Lions" , "Lion" , 5 , true);
        Terrestrial terrestrialAnimal = new Terrestrial("Mammal" , "Ours" , 12 , true , 4);
        Terrestrial terrestrialAnimal2 = new Terrestrial("Oiseaux" , "Poule" , 2 , true , 2);
        Penguin penguin = new Penguin("Bird", "Pinguin", 3, false, "Antarctica", 30.0f);
        Dolphin dolphin = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 25.0f);

        // Tester les méthodes de Carnivore, Herbivore et Omnivore
        dolphin.eatMeat(Food.MEAT);
        terrestrialAnimal.eatPlant(Food.PLANT);
        terrestrialAnimal2.eatPlantAndMeat(Food.BOTH);

        // Tester d’autres méthodes spécifiques si nécessaire
        penguin.eatMeat(Food.MEAT);

        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(dolphin);

        myZoo.displayAquaticAnimalsSwim();
        myZoo.maxPenguinSwimmingDepth();
        myZoo.displayNumberOfAquaticsByType();

        try {
            myZoo.addAnimal(animal);
            myZoo.addAnimal(animal);
            myZoo.addAnimal(animal);
            myZoo.addAnimal(animal);

        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException i) {
            System.out.println(i.getMessage());
        }finally {
            System.out.println(Zoo.nbrCages);
        }

    }
}