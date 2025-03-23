import java.util.Scanner;
public class Calcu {
        public static double calculator(double a, double b, String operator) {
            switch (operator) {
                case "+":
                    return a + b;
                case "-":
                    return a - b;
                case "*":
                    return a * b;
                case "/":
                    return a / b; 
                default:
                    System.out.println("Error: Invalid operator");
                    return 0; 
            }
        }
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            while (true) { 
                double a = scan.nextDouble();
                if (a == 999) {
                    System.out.println("Calculator exited.");
                    break; 
                }
                String operator = scan.next();
                double b = scan.nextDouble();
                double result = calculator(a, b, operator);
                if (result % 1 == 0) {
                    System.out.println((int) result);
                } else {
                    System.out.println(result);
                }
            }
            scan.close();
        }
    
}
