package av1;
import java.util.Scanner;

public class Av1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte option;

        System.out.println("Type the item number");
        String number = s.next();
        System.out.println("Type the item description");
        String description = s.next();
        System.out.println("Type the item quantityr");
        short quantity = s.nextShort();
        System.out.println("Type the unity price");
        float priceUnity = s.nextFloat();

        Av1GetSet av = new Av1GetSet();
        Av1GetSet at = new Av1GetSet(number, description, quantity, priceUnity);

        av.setNumber(number);
        av.setDescription(description);
        av.setQuantity(quantity);
        av.setUnityPrice(priceUnity);

        OUTER:
        do {
            System.out.println("\n\nType 1 to show with parameterized constructor, 2 to show with setters and 0 to exit: ");
            option = s.nextByte();
            switch (option) {
                //Parameterized constructor
                case 1:
                    System.out.println("Hi, your item number is: " + at.getNumber());
                    System.out.println("The item description is: " + at.getDescription());
                    System.out.println("The item quantity: " + at.getQuantity());
                    System.out.println("The unity price is: " + at.getUnityPrice());
                    System.out.println("And the total is: " + at.getTotal());
                    break;
                
                //Setters
                case 2:
                    System.out.println("Hi, your item number is: " + av.getNumber());
                    System.out.println("The item description is: " + av.getDescription());
                    System.out.println("The item quantity: " + av.getQuantity());
                    System.out.println("The unity price is: " + av.getUnityPrice());
                    System.out.println("And the total is: " + av.getTotal());
                    break;
                
                case 0:
                    break OUTER;
                default:
                    System.out.print("\n\n\n\n");
                    System.out.println("Invalid option");
                    System.out.print("\n\n\n\n");
                    break;
            }
        } while (option != 0);
    }    
}