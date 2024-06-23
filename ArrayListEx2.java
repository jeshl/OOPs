import java.util.ArrayList;
import java.util.Scanner;
    /**
     * InnerArrayListEx2
     */
class InnerArrayListEx2 {
        static void InnerMethod(){
            int sum = 0;
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

    while(true){
        System.out.println("Enter the number of items: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid Input !! Please Input the Numbers: ");
            sc.next();
        }
        int uInput = sc.nextInt();
        System.out.println("Enter the numbers to calculate sum: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid Input !! Please Input the Numbers: ");
            sc.next();
        }
        for(int i = 0; i < uInput; i++){
            int num = sc.nextInt();
            arraylist.add(num);
        }

       for (int arr : arraylist) {
            sum += arr;            
       }
       System.out.println("Sum of your Numbers is: " + sum);
       sc.nextLine(); //consumes the buffer created by nextInt


       System.out.println("Type 'EXIT' to Terminate the Program else Type 'CONTINUE' : ");

while(true){
       String decision = sc.nextLine();
       if(decision.equalsIgnoreCase("EXIT")){
            sc.close();
            return;
        
       }else if(decision.equalsIgnoreCase("CONTINUE")) {
            sum = 0;
            arraylist.clear();
            break;
       }else{
            System.out.println("Please Type 'EXIT' to Terminate the Program or Type 'CONTINUE' : ");
       }
}



    }

    }
}

/**
 * ArrayListEx2
 */
public class ArrayListEx2 {

    public static void main(String[] args) {
       InnerArrayListEx2.InnerMethod();
    }
}