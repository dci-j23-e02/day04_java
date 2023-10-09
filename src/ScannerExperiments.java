
import java.util.Scanner;

public class ScannerExperiments {


  public static void main(String[] args){
    // create an Object of Scanner
    Scanner input = new Scanner(System.in);

    // print an instruction to the users
    System.out.println("Enter your name: ");

    // take the input from the keyboard
    String name = input.nextLine();

    // print the name
    System.out.println("My name is " + name);

    // close the scanner
    input.close();
  }


}
