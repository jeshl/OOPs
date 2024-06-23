// public class demo {

//     public static void main(String[] args) {
//         Calculator calculator = new Calculator();
//         int result = calculator.sumOfMultiples(4, 10);
        
//         System.out.println(result);
//     }
// }

// class  Calculator {
//     public int sumOfMultiples(int n, int limit) {
//         int sum = 0;
//         for (int i = n; i <= limit; i += n) {
//           sum += i;
//         }
//         return sum;
//       }
//     }
public class demo {

    public static void main(String[] args) {
      int a = 10;
      int b = 20;
      a = a + b(a = a);
      b = a - (b + a);
      a = a - (b + a);
      System.out.println(a);
      System.out.println(b);
    }
  }
