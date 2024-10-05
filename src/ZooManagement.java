import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Veuillez saisir le nom du zoo : ");
        String zooName = input.nextLine();
        System.out.println("Veuillez saisir la ville du zoo : ");
        String zooCity = input.nextLine();
        System.out.println("Veuillez saisir le nombre des cages : ");
        int nbrCages = input.nextInt();
        input.nextLine();

        Zoo myZoo = new Zoo(zooName, zooCity);

        while (true) {
            System.out.println("Veuillez saisir le nom de l'animal (ou tapez 'exit' pour terminer) : ");
            String animalName = input.nextLine();
            if (animalName.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Veuillez saisir la famille de l'animal : ");
            String animalFamily = input.nextLine();
            System.out.println("Veuillez saisir l'âge de l'animal : ");
            int animalAge = input.nextInt();
            input.nextLine();
            System.out.println("Est-ce que cet animal est un mammifère ? (true/false) : ");
            boolean isMammal = input.nextBoolean();
            input.nextLine();

            Animal animal = new Animal(animalFamily, animalName, animalAge, isMammal);

            boolean isAdded = myZoo.addAnimal(animal);

            if (isAdded) {
                System.out.println("Animal ajouté : " + animal.name);
            } else {
                System.out.println("Le zoo est plein, impossible d'ajouter l'animal.");
                break;
            }
        }

        myZoo.displayZoo();

        System.out.println("Veuillez saisir le nom de l'animal à rechercher : ");
        String searchName = input.nextLine();
        Animal searchAnimal = new Animal("", searchName, 0, false);
        int index = myZoo.searchAnimal(searchAnimal);

        if (index != -1) {
            System.out.println("Animal trouvé à l'indice : " + index);
        } else {
            System.out.println("Animal non trouvé.");
        }
    }
}