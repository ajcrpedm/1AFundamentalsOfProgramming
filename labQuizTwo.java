import javax.swing.JOptionPane;
public class labQuizTwo {
    public static void main(String[] args) {
        // Title screen
        String name = JOptionPane.showInputDialog("Welcome to Adobo Cooking Show\nEnter your name:"); // Allows input of name
        // Input of kilos
        String kiloInput = JOptionPane.showInputDialog("How many kilo of pork will you cook?"); // Allows input of kilo
        double kilo = Double.parseDouble(kiloInput); // Convert input kilo to double
        // Ratio for Soy and Vinegar for every 1 kilo
        double soySauce = kilo * (.5);
        double vinegar = kilo * (.33);
        // Output computed results
        String output = "Hello, Chef " + name + "!\n"
                + "The ratio of soy sauce for " + kilo + " kg is = " + soySauce + " cups\n" // Outputs soy sauce cups
                + "The ratio of vinegar for " + kilo + " kg is = " + vinegar + " cups"; // Outputs vinegar cups
            JOptionPane.showMessageDialog(null, output);
        }
    }