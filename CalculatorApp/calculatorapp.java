package calculatorapp.java;

import javax.swing.JOptionPane;

public class CalculatorApp {

    public static void main(String[] args) {
        showWelcomeMessage();

        try {
            double num1 = getNumber("Enter the first number:");
            double num2 = getNumber("Enter the second number:");

            double sum = addNumbers(num1, num2);
            String divisionResult = divideNumbers(num1, num2);

            showResults(sum, divisionResult);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Show welcome message
    public static void showWelcomeMessage() {
        JOptionPane.showMessageDialog(null, "Welcome to Nkululeko's Calculator Application");
    }

    // Get number input from the user
    public static double getNumber(String message) throws NumberFormatException {
        String input = JOptionPane.showInputDialog(null, message);

        if (input == null) {
            JOptionPane.showMessageDialog(null, "Operation cancelled.");
            System.exit(0); // Exit if user cancels
        }

        return Double.parseDouble(input);
    }

    // Add two numbers
    public static double addNumbers(double a, double b) {
        return a + b;
    }

    // Divide two numbers with zero-check
    public static String divideNumbers(double a, double b) {
        if (b == 0) {
            return "Cannot divide by zero!";
        }
        return String.valueOf(a / b);
    }

    // Show the calculation results
    public static void showResults(double sum, String division) {
        JOptionPane.showMessageDialog(null, "Addition result: " + sum);
        JOptionPane.showMessageDialog(null, "Division result: " + division);
        JOptionPane.showMessageDialog(null, "YOUR CALCULATIONS ARE ACCURATE! THANK YOU FOR USING THIS APPLICATION.");
    }
}
