import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * HashSet_Iterator
 */
public class HashSet_Iterator {

    public static void main(String[] args) {
        String names;
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<String>();

        System.out.println("Enter the number items: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid Input !! Please Enter the Number");
            sc.next();
        }
        Integer num = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the Names: ");
        for(int i = 0; i < num; i++){
            names = sc.nextLine();
            hashSet.add(names);
        }


        System.out.println("Enter the Name to search: ");
        String searchName = sc.nextLine();

//using Regex Pattern class here
        Pattern pattern = Pattern.compile(searchName, Pattern.CASE_INSENSITIVE);

Boolean flagBoolean = false;

        Iterator<String> itr = hashSet.iterator();

        while (itr.hasNext()) {
            String temp = itr.next();
            Matcher matcher = pattern.matcher(temp);
            if (matcher.find()) {
                flagBoolean = true;
                System.out.println("Matched: " + matcher.group() + " at position " + matcher.start() + " - " + matcher.end());  
                break;
            }
        }
        if (!flagBoolean) {
            System.out.println("Not Matched !!");
        }

        sc.close();
    }
}