import java.util.Scanner;

public class ZooManagement {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez le nombre des cages");
        int nbrCages = sc.nextInt();
        System.out.println("Donnez le nom du zoo");
        String zooName = sc.next();
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }
}
