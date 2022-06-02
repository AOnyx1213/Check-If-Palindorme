
import java.util.Scanner;
public class Exercise6_3 {
	public static void main(String[] args) {
		//Enter a positive integer: Scanner(System.in)
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		//if (the integer is a palindrome)
		if (isPalindrome(number))
			System.out.print(number + " is palindrome");
		//    Display it is palindrome
		else // else 
			System.out.print(number + " is not palindrome");
		//  Display it is not palindrome
	}
	public static boolean isPalindrome(int number) {
		// return if number is palidrome: call reverse method
		return number == reverse(number);
		
	}
	
	public static int reverse(int number) {
		int result = 0; 
		// While (loop until all the digits are extracted)
		while ( number > 0) {
		int t = number % 10;
		// Extract a digit (%)
		result = result * 10 + t;// Add the extracted digit into its reversal
		number = number / 10;// remove the extracted digit
				}
		return result;
		

	}

}
/* Sample Run
Enter a positive integer: 1234321
1234321 is palindrome
*/