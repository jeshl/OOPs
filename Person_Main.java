import java.util.Scanner;

/**
 * Person_Main
 */
public class Person_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person obj = new Person();
        System.out.println("Enter your name: ");
        String uInput = sc.nextLine();
        obj.setName(uInput);
        System.out.println("Hello " + obj.getName());
        sc.close();
    }
}