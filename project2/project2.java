import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.text.NumberFormat;

public class project2 {
    public static void main (String[] args){
        JFrame frame = new JFrame("Don Pedro's Pizza Palace Of Palatial Pizza");

        //Creates panel for base pizza options
        JPanel pizzaPanel = new JPanel();
        pizzaPanel.setBounds(10, 10, 180, 80);
        pizzaPanel.setBackground(Color.LIGHT_GRAY);
        pizzaPanel.setLayout(null);

        //Creates label for pizza size
        JLabel label = new JLabel("Pizza Size");
        label.setBounds(10, 15, 90, 20);
        pizzaPanel.add(label);

        //Creates combo box
        String pizzaSize[]={"Small", "Medium","Large"};
        JComboBox<String> sizeBox = new JComboBox<>(pizzaSize);
        sizeBox.setBounds(80, 15, 90, 20);
        pizzaPanel.add(sizeBox);

        //Creates crust label
        JLabel label2 = new JLabel("Crust");
        label2.setBounds(10, 45, 90, 20);
        pizzaPanel.add(label2);        

        //Creates combo box
        String pizzaCrust[]={"Thin", "Normal", "Stuffed"};
        JComboBox<String> crustBox = new JComboBox<>(pizzaCrust);
        crustBox.setBounds(80, 45, 90, 20);
        pizzaPanel.add(crustBox);     
        frame.add(pizzaPanel);

        //Creates panel for toppings
        JPanel toppingPanel = new JPanel();
        toppingPanel.setBounds(10, 100, 180, 180);
        toppingPanel.setBackground(Color.LIGHT_GRAY);
        toppingPanel.setLayout(null);
        frame.add(toppingPanel);

        //Toppings label
        JLabel label3 = new JLabel("Toppings");
        label3.setBounds(10, 15, 90, 20);
        toppingPanel.add(label3);

        //Part of toppings selection
        JCheckBox pepperoni = new JCheckBox("Pepperoni");
        pepperoni.setBounds(80, 15, 90, 20);
        pepperoni.setBackground(Color.LIGHT_GRAY);
        toppingPanel.add(pepperoni);

        //Part of toppings selection
        JCheckBox sausage = new JCheckBox("Sausage");
        sausage.setBounds(80, 45, 90, 20);
        sausage.setBackground(Color.LIGHT_GRAY);
        toppingPanel.add(sausage);

        //Part of toppings selection
        JCheckBox mushrooms = new JCheckBox("Mushrooms");
        mushrooms.setBounds(80, 75, 120, 20);
        mushrooms.setBackground(Color.LIGHT_GRAY);
        toppingPanel.add(mushrooms);

        //Part of toppings selection
        JCheckBox bellpeppers = new JCheckBox("Bell Peppers");
        bellpeppers.setBounds(80, 105, 120, 20);
        bellpeppers.setBackground(Color.LIGHT_GRAY);
        toppingPanel.add(bellpeppers);

        //Part of toppings selection
        JCheckBox onions = new JCheckBox("Onions");
        onions.setBounds(80, 135, 90, 20);
        onions.setBackground(Color.LIGHT_GRAY);
        toppingPanel.add(onions);

        //Panel for drink selections
        JPanel drinkPanel = new JPanel();
        drinkPanel.setBounds(200, 10, 180, 50);
        drinkPanel.setBackground(Color.LIGHT_GRAY);
        drinkPanel.setLayout(null);
        frame.add(drinkPanel);

        //Drink label
        JLabel label4 = new JLabel("Drink");
        label4.setBounds(10, 15, 90, 20);
        drinkPanel.add(label4);        

        //Drink selection
        String drink[]={"Water", "Soda", "None"};
        JComboBox<String> drinkBox = new JComboBox<>(drink);
        drinkBox.setBounds(80, 15, 90, 20);
        drinkPanel.add(drinkBox);

        //Panel for delivery
        JPanel deliveryPanel = new JPanel();
        deliveryPanel.setBounds(200, 70, 180, 80);
        deliveryPanel.setBackground(Color.LIGHT_GRAY);
        deliveryPanel.setLayout(null);
        frame.add(deliveryPanel);        

        //Tip label
        JLabel label5 = new JLabel("Tip Amount");
        label5.setBounds(10, 15, 90, 20);
        deliveryPanel.add(label5);

        //Tip text box
        JTextField tip = new JTextField("0.00");
        tip.setBounds(80, 15, 90, 20);
        deliveryPanel.add(tip);

        //Checkbox for delivery
        JCheckBox delivery = new JCheckBox("Delivery?");
        delivery.setBounds(80, 45, 90, 20);
        delivery.setBackground(Color.LIGHT_GRAY);
        deliveryPanel.add(delivery);

        //Creates display panel for price
        JPanel pricePanel = new JPanel();
        pricePanel.setBounds(200, 160, 180, 80);
        pricePanel.setBackground(Color.LIGHT_GRAY);
        pricePanel.setLayout(null);
        frame.add(pricePanel);   

        //Button for calculation
        JButton orderButton = new JButton("Place Order");
        orderButton.setBounds(30, 15, 120, 20);        

        //Area to display total cost
        JLabel label6 = new JLabel("Total: $0.00");
        label6.setBounds(55, 45, 90, 20);
        pricePanel.add(label6);              

        orderButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Initializes variables
                double total = 0;
                String size = sizeBox.getSelectedItem().toString();
                String crust = crustBox.getSelectedItem().toString();
                String drink = drinkBox.getSelectedItem().toString();
                double tipAmount;
                try {
                    tipAmount = Double.parseDouble(tip.getText()); //Checks to see if tip amount is an integer or not
                } catch (NumberFormatException x){ //If not, reverts tip to 0
                    tipAmount = 0;
                    tip.setText("0.00");
                }

                if (tipAmount < 0){ //Prevents tip from being negative
                    tipAmount = 0;
                    tip.setText("0.00");
                }
                
                //Adds price for pizza size
                if (size == "Small"){
                    total += 10;
                } else if (size == "Medium"){
                    total += 12;
                } else {
                    total += 15;
                }

                //Adds price for crust type
                if (crust == "Thin"){
                    total += 1;
                } else if (crust == "Stuffed"){
                    total += 2;
                } else {
                    total += 0;
                }

                //Looks through all toppings and adds price for each selected
                if (pepperoni.isSelected()){
                    total += 1;
                }
                if (sausage.isSelected()){
                    total += 1;
                }
                if (mushrooms.isSelected()){
                    total += 1;
                }
                if (bellpeppers.isSelected()){
                    total += 1;
                }
                if (onions.isSelected()){
                    total += 1;
                }

                //Adds price for drink type
                if (drink == "Water"){
                    total += 1;
                } else if (drink == "Soda"){
                    total += 2;
                } else {
                    total += 0;
                }

                //Adds price if delivery selected
                if (delivery.isSelected()){
                    total += 3;
                }

                //Finally adds tip to total
                total += tipAmount;

                //Creates number formatter for currency
                NumberFormat formatter = NumberFormat.getCurrencyInstance();

                //Displays total with formatted total price
                label6.setText("Total: " + formatter.format(total));


            }
        });

        pricePanel.add(orderButton);

        //Size of frame
        frame.setSize(400,350);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
