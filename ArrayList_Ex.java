import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class InnerArrayList_Ex {

static ArrayList<String> Name = new ArrayList<String>();
static Scanner sc = new Scanner(System.in);


//Add Name Method: 

    static void AddName(){
        int count = 0;

        System.out.println("Enter how many names you want add: ");

        while(!sc.hasNextInt()){
            System.out.println("Invalid Input !! Please Enter the Number: ");
            sc.next();
        }

        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Please Enter the Name to Add: ");

//For Name Input: 

        while(sc.hasNextInt()){
            System.out.println("Invalid Input !! Please Enter the Name: ");
            sc.next();
        }

        for(int i = 0; i < num; i++){
        String uInput = sc.nextLine();
        Name.add(uInput);
        count ++;
        }
        System.out.println(count + " Names added !!");
    }


//Remove Name Method

    static void RemoveName(){
        AddName();

        System.out.println("Enter the name to remove: ");
        String uInput = sc.nextLine();
        boolean foundName = false;

        for(int i = 0; i < Name.size(); i++){
            if(Name.get(i).equalsIgnoreCase(uInput)){
                System.out.println("Name Found !!");
                Name.remove(i);
                System.out.println("Name Removed !!");
                foundName = true;
            }
        }

        if(!foundName){
            System.out.println("Name Not Found !!");
        }else{
            System.out.println("Name after removing:");
        for (String string : Name) {
            System.out.println(string);
        }
    }

    }

// Ascending Sorting Method:

    static void SortAscend(){
        AddName();
        Collections.sort(Name);
        System.out.println("Names after Sorting: ");
        for (String string : Name) {
            System.out.println(string);
        }
    }


//Descending Sort Method:

    static void SortDescend(){
        AddName();
        Collections.sort(Name);
        Collections.reverse(Name);
        System.out.println("Name after Reverse Sorting: ");
        for (String string : Name) {
            System.out.println(string);
        }
    }
    
}

public class ArrayList_Ex {
    public static void main(String[] args) {
        // InnerArrayList_Ex innerArrayList_Ex = new InnerArrayList_Ex();

        try{
             
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add Name");
        System.out.println("2. Remove Name");
        System.out.println("3. Sort Ascending Order");
        System.out.println("4. Sort Descending Order");
        
        System.out.println("\nPlease, Enter your choice: ");
        
        while(!sc.hasNextInt()){
            System.out.println("Invalid Input !! Please Enter the Number: ");
            sc.next();
        }
        
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                InnerArrayList_Ex.AddName();
                break;

            case 2:
                InnerArrayList_Ex.RemoveName();
                break;
            
            case 3:
                InnerArrayList_Ex.SortAscend();
                break;
            
            case 4:
                InnerArrayList_Ex.SortDescend();
                break;

            default:
                System.out.println("Invalid choice !!");
                break;
        }
sc.close();
        
        }catch(Exception e){
            System.out.println("Error occured !!" + e.getMessage());
            e.printStackTrace();
        }
       
    }
}
