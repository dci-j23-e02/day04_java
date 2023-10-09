
import java.util.Scanner;

public class ScannerExperiments {


  public static void main(String[] args){
    // create an Object of Scanner
    Scanner input = new Scanner(System.in);

    // print an instruction to the users
    System.out.println("Enter your name: ");

    // take the input from the keyboard
    // String input
    String name = input.nextLine();

    // Numerical input
    System.out.println("Enter your age: ");
    int age = input.nextInt();

    System.out.println("Enter your salary: ");
    double salary = input.nextDouble();

    // print the name
    System.out.println("My name is " + name);
    // print the age
    System.out.println("My age is " + age);
    // print the salary
    System.out.println("My salary is " + salary);





    // close the scanner
    input.close();
  }

  // last version


}
