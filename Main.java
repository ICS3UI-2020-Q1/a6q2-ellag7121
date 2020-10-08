import java.util.Scanner;
/**
 * ask user for 10 numbers, ask them for a number to find, tell the the position the number is at
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);

    //create the array
    int[] numbers = new int[10];

    //ask user for the integers
    System.out.println("Please enter in 10 integers to put into the array");
    //make a loop to get all the numbers
    for(int i = 0; i < numbers.length; i++){
      //store the result in the array
      numbers[i] = input.nextInt();
    }

    //ask user far a number to find
    System.out.println("Please enter a number to find");
    int findNumber = input.nextInt();

    //create a loop to find that number in your array
    for(int i = 0; i < numbers.length; i++){
      //check if the current array number is equal to the number to find
      if(numbers[i] == findNumber){
        //tell the user where the number is
        System.out.println(findNumber + " is located at index " + i);
      }
    }
    
  }
}
