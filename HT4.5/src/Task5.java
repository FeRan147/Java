import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку:");
		String str = in.nextLine();
		if (symbolAnalyzer(str)) {
			System.out.println("Все символы в строке: " + str + " встречаются один раз");
		} else {
			System.out.println("НЕ все символы в строке: " + str + " встречаются один раз");
		}
		in.close();
	}

	public static boolean symbolAnalyzer(String str) {
		boolean[] char_set = new boolean[100000];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
}
