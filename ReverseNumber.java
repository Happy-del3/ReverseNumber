import java.util.Scanner;
 
public class ReverseNumber {

    public static void main(String[] args) {
        // Declare variables
        int number, reverseNumber = 0;
        
        // Instantiate --> Create the Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt for user to enter the number
        System.out.print("Please enter the number: ");
        
        // Read and integer from the keyboard, and store it in number
        number = input.nextInt();
        
        // Check that number is not equal to zero before decrementing it
        while(number != 0){
            // Reverse the number
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number = (number / 10);
            
        }
		
        // Display the reverse number
        System.out.println("The reverse number is " + reverseNumber);
    }
    
}
