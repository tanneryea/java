import java.util.Scanner;


public class DrinkMachine {
    public static void main(String[] args){
        Drink[] drinkList = InitializeDrinkMachine();
        int selection;
        do{
            selection = GetMenuSelection(drinkList) - 1;
            if (selection == 5) {
                System.out.println("Thank you for shopping! Goodbye!");
                System.exit(0);
            } //Terminates program if quit is selected
            
            if (drinkList[selection].getQuantity() == 0){
                System.out.println("That drink is sold out! Please select another.");                
            } else {
                drinkList[selection].PurchaseDrink();
                System.out.println("Purchase successful! Please enjoy your drink!");
            }

        } while (selection != 5); //Keeps looping through purchase options
    }

    public static Drink[] InitializeDrinkMachine(){ //Initializes drink amounts
        Drink[] drinkList = new Drink[5];
        drinkList[0] = new Drink("Root Beer", 20, 1.25);
        drinkList[1] = new Drink("Cola", 20, 1.75);
        drinkList[2] = new Drink("Lemon Lime", 20, 1.25);
        drinkList[3] = new Drink("Cream Soda", 20, 1.75);
        drinkList[4] = new Drink("Cherry", 20, 1.75);
        return drinkList;
    }

    public static int GetMenuSelection(Drink[] drinkArray){ //Displays menu and allows user to select drink. Returns selection
        Scanner kb = new Scanner(System.in);
        int selection;        

        System.out.println("Welcome to the soda machine! Please pick an option below!");
        System.out.println("1. " + drinkArray[0].getDrinkName() + " — Quantity: " + drinkArray[0].getQuantity() + " — Price: $" + drinkArray[0].getPrice());
        System.out.println("2. " + drinkArray[1].getDrinkName() + " — Quantity: " + drinkArray[1].getQuantity() + " — Price: $" + drinkArray[1].getPrice());
        System.out.println("3. " + drinkArray[2].getDrinkName() + " — Quantity: " + drinkArray[2].getQuantity() + " — Price: $" + drinkArray[2].getPrice());
        System.out.println("4. " + drinkArray[3].getDrinkName() + " — Quantity: " + drinkArray[3].getQuantity() + " — Price: $" + drinkArray[3].getPrice());
        System.out.println("5. " + drinkArray[4].getDrinkName() + " — Quantity: " + drinkArray[4].getQuantity() + " — Price: $" + drinkArray[4].getPrice());
        System.out.println("6. Quit program");
        System.out.print(">> ");
        selection = kb.nextInt();

        while (selection < 1 || selection > 6){
            System.out.println("Invalid choice! Please enter a viable option.");
            System.out.print(">>");
            selection = kb.nextInt();
        }

        
        return selection;


    }



}

