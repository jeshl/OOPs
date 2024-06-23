import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ArrayList1
 */
public class ArrayList1 {

    Scanner sc = new Scanner(System.in);
    public void UserInput(){
        ArrayList<Integer> arrayList =  new ArrayList<Integer>();
        System.out.println("Enter the Number of Items: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Numbers to reverse them: ");

        for(int i = 0; i < num; i++){
            int uInput = sc.nextInt();
            arrayList.add(uInput);
        }

        System.out.println("Number in Array List are: " + arrayList);

        System.out.println("Numbers after reversing Array List: ");
        Collections.reverse(arrayList);
        System.out.println(arrayList);  

    }

    public static void main(String[] args) {
        ArrayList1 obj = new ArrayList1();
        obj.UserInput();
    }
}