import java.util.ArrayList;
import java.util.Scanner;

class ArrayListEx2Opt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number of items (or type 'EXIT' to terminate): ");
            if (!sc.hasNextInt()) {
                String decision = sc.next();
                if (decision.equalsIgnoreCase("EXIT")) {
                    sc.close();
                    return;
                } else {
                    System.out.println("Invalid input. Please enter a number or type 'EXIT' to terminate.");
                    continue;
                }
            }
            int uInput = sc.nextInt();
            System.out.println("Enter the numbers to calculate sum: ");
            int sum = 0;
            for (int i = 0; i < uInput; i++) {
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid Input !! Please Input the Numbers: ");
                    sc.next();
                }
                int num = sc.nextInt();
                sum += num;
            }
            System.out.println("Sum of your Numbers is: " + sum);
        }
    }
}
