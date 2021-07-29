import javax.swing.JOptionPane;

public class TipCalculator
{
    public static void main(String[] args)
    {
        final double TAX_RATE = 0.0675;
        final double TIP_RATE = 0.2;
        double price, total, tax, tip;
        String str;

        str = JOptionPane.showInputDialog("Enter the price of the meal.");
        price = Double.parseDouble(str);

        tax = price * TAX_RATE;
        tax = Math.round(tax * 100.0)/100.0;
        total = price + tax;

        tip = total * TIP_RATE;
        tip = Math.round(tip * 100.0)/100.0;
        total += tip;

        JOptionPane.showMessageDialog(null, "Price of meal: $" + price + "\nTax: $" + tax + "\nTip: $" + tip + "\nTotal bill: $" + total);

        System.exit(0);

    }
}