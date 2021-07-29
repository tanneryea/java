import java.util.Scanner;

public class Chapter10{
    public static void main(String[] args){
        boolean quit = false;
        int selection;
        Scanner input = new Scanner(System.in);   

        do {
            System.out.println("Please select an option:");
            System.out.println("1) Volume of a sphere");
            System.out.println("2) Volume of a cube");
            System.out.println("3) Volume of a cone");
            System.out.println("4) Quit");
            System.out.print("Enter your selection: ");
            selection = input.nextInt();

            while (selection <= 0 || selection >= 5){
                System.out.print("Invalid selection! Please select a valid option: ");
                selection = input.nextInt();
            }

            switch (selection){
                case 1:
                    Sphere mySphere = new Sphere();
                    mySphere.getInput();
                    System.out.println("The volume of the sphere is " + mySphere.getVolume());
                    break;
                case 2:
                    Cube myCube = new Cube();
                    myCube.getInput();
                    System.out.println("The volume of the cube is " + myCube.getVolume());
                    break;
                case 3:
                    Cone myCone = new Cone();
                    myCone.getInput();
                    System.out.println("The volume of the cone is " + myCone.getVolume());
                    break;
                case 4:
                    quit = true;
                    break;
            }
        } while (!quit);
        
        System.out.println("Thank you for using the program!");
        input.close();
    }

}

interface Shape{
   public double getVolume();
   public void getInput();
}

class Sphere implements Shape{
    private double radius;

    public double getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getVolume(){
        double volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
        return volume;
    }

    public void getInput(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter radius of the sphere: ");
        radius = kb.nextDouble();

        while (radius <= 0){
            System.out.print("Radius must be greater than 0. Enter a new number: ");
            radius = kb.nextDouble();
        }

    }
}

class Cube implements Shape{
    private double length;

    public double getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public double getVolume(){
        double volume = length * length * length;
        return volume;
    }

    public void getInput(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter length of the cube's side: ");
        length = kb.nextDouble();

        while (length <= 0){
            System.out.print("Length must be greater than 0. Enter a new number: ");
            length = kb.nextDouble();
        }

    }
}

class Cone implements Shape{
    private double radius;
    private double height;

    public double getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public double getVolume(){
        double volume = Math.PI * Math.pow(radius, 2) * (height/3);
        return volume;
    }

    public void getInput(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter radius of the cone's base: ");
        radius = kb.nextDouble();

        while (radius <= 0){
            System.out.print("Radius must be greater than 0. Enter a new number: ");
            radius = kb.nextDouble();
        }

        System.out.print("Enter height of the cone: ");
        height = kb.nextDouble();

        while (height <= 0){
            System.out.print("Height must be greater than 0. Enter a new number: ");
            height = kb.nextDouble();
        }

    }
}


