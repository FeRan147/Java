import java.util.Scanner;
public class Task1 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		String str;
		System.out.println("Введите строку: ");
		str = inputStr.nextLine();
		int symbolsCount = str.length();
		System.out.println("Количество символов в строке: " + symbolsCount);
		String str1 = str.substring(0, symbolsCount / 2);
		String str2 = str.substring(symbolsCount / 2, symbolsCount);
		System.out.println(str1 + " " + str2);
		inputStr.close();
	}
}
