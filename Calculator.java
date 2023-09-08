import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Hello this is a calculator type a Number!");
       String a = scanner.nextLine();
       System.out.println("Now enter another number!");
       String b = scanner.nextLine();
       int RealnumberA = Converter(a);
       int RealnumberB = Converter(b);
       System.out.println("Now choice a operation\n \n a ADD\n \n b REST\n  \n c MULTI\n \n d Div\n");
       String choice = scanner.nextLine();
     if (choice.equals("a")) {
     int result = Add(RealnumberA, RealnumberB);
        System.out.println("Your result is " + result);
   } else if (choice.equals("b")) {
        int result = Rest(RealnumberA, RealnumberB);
        System.out.println("Your result is " + result);
   } else if (choice.equals("c")) {
        int result = Multi(RealnumberA, RealnumberB);
        System.out.println("Your result is " + result);
   } else if (choice.equals("d")) {
       int result = Div(RealnumberA, RealnumberB);
       System.out.println("Your result is " + result);
   } else {
    System.out.println("Invalid choice. Please enter a, b, c, or d.");
     }

       scanner.close();

     }


     public static int Add(int a, int b){
        return a + b;
     }

     public static int Rest(int a, int b){
          return a - b;
     }

     public static int Multi(int a, int b){
          return a * b;
     }

     public static int Div(int a, int b){
          return a / b;
     }

     public static int Converter(String arg){
          return Integer.parseInt(arg);
     }
}
