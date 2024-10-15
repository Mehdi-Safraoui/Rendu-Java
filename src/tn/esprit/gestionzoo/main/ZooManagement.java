package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;


public class ZooManagement {
    public static void main(String[] args) {

        Animal animal = new Animal ("Lions" , "Lion" , 5 , true);
        Aquatic aquaticAnimal = new Aquatic("Fish" , "Sardine" , 1 , true , "water");
        Terrestrial terrestrialAnimal = new Terrestrial("Mammal" , "Ours" , 12 , true , 4);
        Penguin penguin = new Penguin("Bird", "Pingu", 3, false, "Antarctica", 30.0f);
        Dolphin dolphin = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 25.0f);

        aquaticAnimal.swim();
        dolphin.swim();
        penguin.swim();


    }
}