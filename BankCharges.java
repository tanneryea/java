import javax.swing.JOptionPane;

public class BankCharges {
    public static void main(String[] args){
        final double BASE_FEE = 10.0;
        int numberOfChecks;
        double checkFee;
        String temp;
        double totalCheckFee;

        temp = JOptionPane.showInputDialog("Enter the amount of checks written this month: ");
        numberOfChecks = Integer.parseInt(temp);

        
        if (numberOfChecks < 20) {
            checkFee = 0.1;
            totalCheckFee = BASE_FEE + (numberOfChecks * checkFee);
            String output = String.format("Your total check fee this month is $%,.2f", totalCheckFee);
            JOptionPane.showMessageDialog(null, output);
        } else if (numberOfChecks >= 20 && numberOfChecks <= 39) {
            checkFee = 0.08;
            totalCheckFee = BASE_FEE + (numberOfChecks * checkFee);
            String output = String.format("Your total check fee this month is $%,.2f", totalCheckFee);
            JOptionPane.showMessageDialog(null, output);
        } else if (numberOfChecks >= 40 && numberOfChecks <= 59) {
            checkFee = 0.06;
            totalCheckFee = BASE_FEE + (numberOfChecks * checkFee);
            String output = String.format("Your total check fee this month is $%,.2f", totalCheckFee);
            JOptionPane.showMessageDialog(null, output);
        } else if (numberOfChecks >= 60) {
            checkFee = 0.04;
            totalCheckFee = BASE_FEE + (numberOfChecks * checkFee);
            String output = String.format("Your total check fee this month is $%,.2f", totalCheckFee);
            JOptionPane.showMessageDialog(null, output);
        }

        System.exit(0);
        



    }
}