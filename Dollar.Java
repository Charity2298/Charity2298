import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
 System.out.print("Enter the amount in dollars: ");
        int amount = scanner.nextInt();
        
int twenties = amount / 20;
        amount %= 20;

 int tens = amount / 10;
        amount %= 10;

 int fives = amount / 5;
        amount %= 5;

 int ones = amount;

System.out.println("The equivalent denominations are:");
System.out.println("$20 bills: " + twenties);
System.out.println("$10 bills: " + tens);
System.out.println("$5 bills: " + fives);
System.out.println("$1 bills: " + ones);

        Scanner.close();
    }
}
