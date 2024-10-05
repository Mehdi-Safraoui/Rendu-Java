import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Veuillez saisir le nom du zoo : ");
        String zooName = input.nextLine();
        System.out.println("Veuillez saisir la ville du zoo : ");
        String zooCity = input.nextLine();
        System.out.println("Veuillez saisir le nombre de cages : ");
        int nbrCages = input.nextInt();

        Zoo myZoo = new Zoo(zooName, zooCity, nbrCages);

        System.out.println("Veuillez saisir le nom de l'animal : ");
        String animalName = input.nextLine();
        System.out.println("Veuillez saisir la famille de l'animal : ");
        String animalFamily = input.nextLine();
        System.out.println("Veuillez saisir l'âge de l'animal : ");
        int animalAge = input.nextInt();
        System.out.println("Est-ce que cet animal est un mammifère ? (true/false) : ");
        boolean isMammal = input.nextBoolean();

        Animal animal = new Animal(animalName, animalFamily, animalAge, isMammal);

        myZoo.animals[0] = animal;
        myZoo.displayZoo();

        System.out.println("Animal ajouté : " + animal.name + ", famille " + animal.family + ", âge " + animal.age + ", mammifère : " + isMammal);

        System.out.println(myZoo);
    }
}
