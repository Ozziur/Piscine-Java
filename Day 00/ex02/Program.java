import java.util.Scanner;

public class Program
{
	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int coffeeCount = 0;
		while (true) {
			int num = scanner.nextInt();
			if (num == 42)
				break;
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			if (isPrime(sum))
				coffeeCount++;
		}
		System.out.println("Count of coffee-request: " + coffeeCount);
	}
}
