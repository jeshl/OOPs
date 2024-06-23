import java.util.HashMap;
import java.util.Scanner;

/**
 * HasMap_Add
 */
public class HashMap_Add {

    public static void main(String[] args) {
        HashMap<Integer, String> obj = new HashMap<Integer, String>();
        
        // int id, num, sum = 0;
        int id;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid Input !! Enter the number: ");
            sc.next();
        }
        int n =  sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the key(ID) and value(Number): ");

        for(int i = 0; i < n; i++){
            System.out.print("Key: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid Input !! Enter a valid key: ");
                sc.next(); 
            }
            id = sc.nextInt();
            sc.nextLine();
       
            System.out.print("Value: ");
            name = sc.nextLine();
            obj.put(id, name);
        }

        System.out.println(obj);

        System.out.println("Enter the name to check the presence: ");
        String uInput = sc.nextLine();

    // boolean present = false;
    Integer keyRemove = null;

        for (Integer key : obj.keySet()) {
            if (obj.get(key).equalsIgnoreCase(uInput)) {
                // present = true;
                keyRemove = key;
                break;
            }
        }

            if(keyRemove != null){
                System.out.printf("Name is present: %s with Key: %d",uInput, keyRemove);
                obj.remove(keyRemove);
                System.out.println("\nName removed !!");
                System.out.println("Now Output After removing: ");
                for (Integer keys : obj.keySet()) {
                    System.out.println("key = " + keys + " Name " + obj.get(keys));
                }
            
            }else{
                System.out.println("Name is not Present !!");
            }

        sc.close();
    }
}
