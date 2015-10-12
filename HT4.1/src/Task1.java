import java.util.Scanner;
public class Task1 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		System.out.println("¬ведите текст: ");
		String str = inputStr.nextLine();
		System.out.println("¬ведите номер символа дл€ замены: ");
		int symbolNum = Integer.valueOf(inputStr.nextLine());
		System.out.println("¬ведите символ дл€ замены: ");
		String symbol = inputStr.nextLine();
		char[] strChar = str.toCharArray();
		inputStr.close();
	}
}