import java.util.Scanner;
public class FinancialForecast {

    // Recursive method
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        // base case
        if (years == 0) {
            return presentValue;
        }
        // recursive case
        return (1 + rate) * calculateFutureValue(presentValue, rate, years - 1);
    }

    // Iterative method
    public static double calculateFutureValueIterative(double presentValue, double rate, int years) {
        double futureValue = presentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + rate);
        }
        return futureValue;
    }

    // Closed-form method 
    public static double calculateFutureValueDP(double presentValue, double rate, int years) {
        return presentValue * Math.pow((1 + rate), years);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Present Value:");
        double presentValue = scanner.nextDouble(); 
        System.out.println("Enter Rate of Interest:"); 
        double rate = scanner.nextDouble();  
        System.out.println("Enter Number of Years:");         
        int years = scanner.nextInt();         
        scanner.close();

        double futureValue = calculateFutureValue(presentValue, rate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
