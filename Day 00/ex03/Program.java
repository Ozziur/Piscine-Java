 
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputWeek = scanner.nextLine();
		int week = 1;
		long memory = 0;

		while (week <= 18 && !inputWeek.equals("42")) {
			if (!inputWeek.equals("Week " + week)) {
				System.err.println("Illegal Argument");
				System.exit(-1);
			}
			memory = save(readNumber(scanner), memory, week);
			week++;
			inputWeek = scanner.nextLine();
		}
		for (int i = 1; i < week; i++) {
			System.out.print("Week " + i + " ");
			printGraph(decrypt(i, memory));
		}
	}

	public static long save(int min, long memory, int index) {
		long ret;
		long pow = 1;

		for (int i = 1; i < index; i++) {
			pow *= 10;
		}
		ret = memory + (min * pow);
		return (ret);
	}

	public static int decrypt(int index, long memory)	{
		int ret;

		for (int i = 1; i < index; i++) {
			memory /= 10;
		}
		ret = (int)(memory % 10);
		return (ret);
	}

	private static void printGraph(int min) {

		for (int i = 0; i < min; i++) {
			System.out.print("=");
		}
		System.out.println(">");
	}

	private static int readNumber(Scanner scanner) {
		int min = scanner.nextInt();
		if (min <=0 || min > 9) {
			System.err.println("Illegal Argument");
			System.exit(-1);
		}
		int tmp;

		for (int i = 0; i < 4; i++) {
			tmp = scanner.nextInt();
			if (tmp <=0 || tmp > 9) {
				System.err.println("Illegal Argument");
				System.exit(-1);
			}
			if(tmp < min){
				min = tmp;
			}
		}
		scanner.nextLine();
		return (min);
	}
}
