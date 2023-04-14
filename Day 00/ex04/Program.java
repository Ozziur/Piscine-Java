import java.util.Scanner;

public class Program {
	
	private static int MAXCODE = 65535;

	private static void order(int[] occurence, String character) {
		char[] ret = character.toCharArray();
		int n =character.length();
		char tmp = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(occurence[(int)ret[j-1]] < occurence[(int)ret[j]]) {
					tmp = ret[j-1];
					ret[j-1] = ret[j];
					ret[j] = tmp;
				}
			}
		}
		// System.out.print()
		System.out.println(ret);

	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String input;
		int []occurence= new int[MAXCODE];
		String character = "";

		input = myScanner.nextLine();
		for (int i = 0; i < input.length(); i++) {
			char tmp = input.toCharArray()[i];
			if (occurence[(int)tmp] == 0) {
				character += tmp;
				occurence[(int)tmp]++;
			}
			else {
				if (occurence[(int)tmp] < 999)
					occurence[(int)tmp]++;
			}
		}
		order(occurence, character);
	}
}