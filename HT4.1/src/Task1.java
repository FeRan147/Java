import java.util.*;

public class Task1 {
	public static void main(String[] args) {

		System.out.println("Введите строку:");
		Scanner inputStr = new Scanner(System.in);
		String text = inputStr.nextLine();
		String[] strArr = text.split(" ");

		System.out.println("Введите число:");
		int n = 0;
		try {
			n = inputStr.nextInt() - 1;
		} catch (InputMismatchException e) {
			System.out.print("Не число!");
			inputStr.close();
			return;
		}

		System.out.println("Введите символ:");
		char symbol = inputStr.next().charAt(0);

		for (int i = 0; i < strArr.length; i++) {

			String newStrArr[] = new String[strArr.length];
			if (strArr[i].length() > n) {
				newStrArr[i] = strArr[i].substring(0, n) + symbol + strArr[i].substring(n + 1);
			} else {
				newStrArr[i] = strArr[i];
			}
			System.out.println(newStrArr[i]);
		}
		inputStr.close();

	}
}