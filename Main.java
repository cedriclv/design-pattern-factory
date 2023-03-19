import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Sur quelle terrain voulez vous aller ?");
        System.out.println("1. Dans les airs");
        System.out.println("2. Dans l eau");
        System.out.println("3. Sur terre");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Vehicle vehicule;

        switch (choice){
            case 1:
                vehicule = new AirVehicleFactory().create();
                vehicule.move(150);
                break;
            case 2:
                vehicule = new WaterVehicleFactory().create();
                vehicule.move(150);
                break;
                case 3:
                vehicule = new LandVehicleFactory().create();
                vehicule.move(150);
                break;
            default:
                System.out.println("mauvais choix");
        }
    }
}
