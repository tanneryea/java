public class RetailDriver {
    public static void main(String[] args){
        
        //Creates three objects
        RetailItem jacket = new RetailItem("Jacket", 12, 59.95);
        RetailItem designerJeans = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem shirt = new RetailItem("Shirt", 20, 24.95);

        //Prints object attributes in table form
        System.out.println("Description\tUnits\tPrice\tTotal Value");
        System.out.println(jacket.getDescription() + "\t\t" + jacket.getUnitsOnHand() + "\t" + jacket.getPrice() + "\t" + jacket.getTotalValue());
        System.out.println(designerJeans.getDescription() + "\t" + designerJeans.getUnitsOnHand() + "\t" + designerJeans.getPrice() + "\t" + designerJeans.getTotalValue());
        System.out.println(shirt.getDescription() + "\t\t" + shirt.getUnitsOnHand() + "\t" + shirt.getPrice() + "\t" + shirt.getTotalValue());

    }
}
