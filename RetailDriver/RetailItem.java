public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    //Default constructor
    public RetailItem(){
        description = "";
        unitsOnHand = 0;
        price = 0.00;
    }

    //Overloaded constructor
    public RetailItem(String desc, int units, double pri){
        description = desc;
        unitsOnHand = units;
        price = pri;
    }

    //Setters
    public void setDescription(String desc){
        description = desc;
    }

    public void setUnitsOnHand(int units){
        unitsOnHand = units;
    }

    public void setPrice(double pri){
        price = pri;
    }

    //Getters
    public String getDescription(){
        return description;
    }

    public int getUnitsOnHand(){
        return unitsOnHand;
    }

    public double getPrice(){
        return price;
    }

    //Calculates total value
    public double getTotalValue(){
        double totalValue = unitsOnHand * price;
        return Math.round(totalValue*100.0)/100.0;
    }
}
