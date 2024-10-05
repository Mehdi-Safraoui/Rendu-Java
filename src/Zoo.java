public class Zoo {
    Animal[] animals;
    String name, city;
    final static int nbrCages = 25;
    int animalCount;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + name);
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

    boolean addAnimal(Animal animal) {
        if (animalCount < nbrCages) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
        return false;
    }

    int searchAnimal(Animal animal) {
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
                System.out.println("Animal supprimé avec succés");
                return true;

            }
        }
        System.out.println("Animal n'existe pas");
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