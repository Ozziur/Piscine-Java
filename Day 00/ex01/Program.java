import java.util.Scanner;

public class Program
{
	public static void prime(int number) {

		int i = 0;
		int mov = 1;
		boolean p_answer= true;

		for (i = 2; number >= i * i; i++){
			if (number % i == 0){
				p_answer = false;
				break ;
				}
			mov++;
		}
		if (i == number)
			p_answer= true;
		System.out.println(p_answer+ "\t" + mov);
	}

	public static void main(String[] x){

		Scanner scanner = new Scanner(System.in);
		int number = 0;
		try{
			number = scanner.nextInt();
			if (number <= 1){
				System.err.println("IllegalArgument");
				System.exit(-1);
			} else{
				prime(number);
				System.exit(0);
			}			
		} catch (Exception e) {
			System.err.println("IllegalArgument");
			System.exit(-1);
		}
	}
}