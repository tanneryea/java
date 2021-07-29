import java.util.Scanner;


public class Drink {
    private String drink_name;
    private int quantity;
    private double price;

    public Drink() {
        drink_name = "";
        quantity = 0;
        price = 0.00;
    }

    public Drink(String name, int num, double cash){
        drink_name = name;
        quantity = num;
        price = cash;
    }

    //Setters and getters for all variables
    public void setDrinkName(String name){
        drink_name = name;
    }

    public String getDrinkName(){
        return drink_name;
    }

    public void setQuantity(int num){
        quantity = num;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double cash){
        price = cash;
    }

    public double getPrice(){
        return price;
    }

    //Input to enter monetary amount. Loops until needed amount is met or exceeded
    public void PurchaseDrink(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter cash amount: $");
        double cash = kb.nextDouble();
        System.out.println();

        if (cash <= 0){
            System.out.print("Can not accept values less than zero. Enter a new amount: $");
            cash = kb.nextDouble();
            System.out.println();
        }

        while (cash < price){
            System.out.println("You did not input enough money. You still owe: $" + (price - cash));
            System.out.print("Please insert more money: $");
            cash += kb.nextDouble();
            System.out.println();
        }

        if (cash > price){
            double change = cash - price;
            System.out.print("Your change is: $" + change);
            System.out.println();
        } 

        quantity--;
    }


  
}
