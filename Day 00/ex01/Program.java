import java.util.Scanner;

public class Program
{
	public static void prime(int number) {

		System.out.println("You entered: " + number);
	}

	public static void main(String[] x){

		Scanner scanner = new Scanner(System.in);
		int number = 0;
		try {
			System.out.print("Enter an integer: ");
			number = scanner.nextInt();
			if (number <= 1){
				System.err.println("Input not valid.");
			} else{
				prime(number);
			}
			
		} catch (Exception e) {
			System.err.println("Input not valid.");	
		}

       //System.out.println("You entered: " + number);
	}
}