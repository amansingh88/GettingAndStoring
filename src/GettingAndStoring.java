import java.util.Scanner;

public class GettingAndStoring {
    public static void main(String[] args){
     String firstInitial, lastName, houseNumber, streetName, streetType, city;
     Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your first initial:");
        firstInitial= keyboard.next();
        keyboard.nextLine();

        System.out.println("Enter your last name:");
        lastName= keyboard.next();
        keyboard.nextLine();


        System.out.println("Enter your house number:");
        houseNumber= keyboard.next();
        keyboard.nextLine();


        System.out.println("Enter your Street Name:");
        streetName=keyboard.next();
        keyboard.nextLine();


        System.out.println("Enter your Street Type");
        streetType=keyboard.next();
        keyboard.nextLine();


        System.out.println("Enter your City:");
        city=keyboard.next();
        keyboard.nextLine();


        System.out.println(firstInitial+ " " +lastName + " ");
        System.out.println(houseNumber+ " " +streetName+ " " +streetType+ " ");
        System.out.println(city+" ");

    }
}
