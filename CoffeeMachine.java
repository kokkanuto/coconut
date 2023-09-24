// This virtual coffee machine asks for drink type and size and outputs both based on userInput. Invalid input automagically restarts the code.
// Author: Ryan Chan
// Date: 2023/09/23

import java.util.Scanner;
public class CoffeeMachine {

    public static String drinkType (int userChoice){
        switch (userChoice) {
            case 1:
                return "Espresso";
                //break; <-- Break Statement provides error "Unreachable code"...
            case 2:
                return "Cappuccino";
            case 3:
                return "Latte";
            default: 
                return "Invalid option";
        }
    }

    public static String cupSize (String sizeChoice){
        switch(sizeChoice){
            case "small":
                return "Small";
            case "medium":
                return "Medium";
            case "large":
                return "Large";
            default:
                return "Invalid option";
        }
    }

    public static String sizes() {
        Scanner size = new Scanner(System.in);
        System.out.println("Choose a size (Small, Medium, or Large):");
            String sizeChoice = size.next();
            String usersizeChoice = sizeChoice.toLowerCase(); // Allows for weird casing to still be valid (Ex. LaRGe = large)
            return usersizeChoice;
    }

    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        boolean restarter = true;
        
        //While loop added to prevent code from ending if invalid input is detected
        while(restarter = true){

        //Coffee Menu
        System.out.println("Choose an option:");
        System.out.println("(1) Espresso,");
        System.out.println("(2) Cappuccino,");
        System.out.println("(3) Latte");
        System.out.println("Option:");
            int menuChoice = scnr.nextInt();
        String drink = drinkType(menuChoice);

        //Sizes
        String sizeOpt = sizes();
        String size = cupSize(sizeOpt);

        if(drink.equals("Invalid option")){
            System.out.printf("Invalid Input was detected. Restarting code...");
            restarter = true;
        }else if(size.equals("Invalid option")){
            System.out.printf("Invalid Input detected. Restarting code...");
            restarter = true;
        }else{
            System.out.printf("You ordered a: " + size + " " + drink);
            break;
        }

    }
    }
    
}
