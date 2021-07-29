import java.util.Scanner;

public class ConversionProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        boolean displayMenu = true;       

        System.out.print("Enter a distance in meters: ");
        double meters = input.nextDouble();
        System.out.println();

        while (meters <= 0){
            System.out.print("Can not enter a value less than or equal to 0. Enter a new value: ");
            meters = input.nextDouble();
            System.out.println();
        }

        do {
            menu();
            int selection = input.nextInt();

            while (selection < 1 || selection > 4){
                System.out.print("Invalid selection. Please enter a valid number: ");
                selection = input.nextInt();
                System.out.println();
            }

            switch (selection){
                case 1:
                    showKilometers(meters);
                    break;
                case 2: 
                    showInches(meters);
                    break;
                case 3: 
                    showFeet(meters);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    displayMenu = false;
                    break;
            }

        } while (displayMenu);

        input.close();
    }

    public static void showKilometers(double meters){
        double kilometers = meters * 0.001;
        System.out.println(meters + " meters is equal to " + kilometers + " kilometers.");        
    }

    public static void showInches(double meters){
        double inches = meters * 39.37;
        System.out.println(meters + " meters is equal to " + inches + " inches.");        
    }

    public static void showFeet(double meters){
        double feet = meters * 3.281;
        System.out.println(meters + " meters is equal to " + feet + " feet.");        
    }

    public static void menu(){        
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
        System.out.print(">>");
    }


    
}


