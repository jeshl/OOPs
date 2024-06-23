// Import the HashMap class
import java.util.HashMap;
import java.util.Scanner;

public class HashMap_First {

  public static void main(String[] args) {

    // Create a HashMap object called people
    Scanner sc = new Scanner(System.in);
   
   HashMap<Integer, String> people = new HashMap<Integer, String>();


System.out.println("Enter the number of people to add: ");
int num = sc.nextInt();
sc.nextLine();

    // Add keys and values (Name, Age)
    for(int i = 0; i < num; i ++){
    System.out.println("ID: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.println("Name: ");
    String name = sc.nextLine();
        people.put(id, name);
    }

    HashMap<Integer,String> names = new HashMap<Integer,String>();
    names.putAll(people);
    
    for (int i : names.keySet()) {
      System.out.println("ID: " + i + " Name: " + names.get(i));
    }
  }
}
