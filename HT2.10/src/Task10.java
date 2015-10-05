import java.util.Scanner;
public class Task10 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		String numberStr;
		String regexStr = "^?\\d+$";
		System.out.println("¬ведите число дл€ вычислени€ его факториала: ");
		numberStr = inputStr.nextLine();
		if(numberStr.matches(regexStr) == true) {
			int number = Integer.parseInt(numberStr);
			System.out.println("‘акториал введенного числа равен: " + factorial(number));
		} else {
			System.out.println("¬веденное количество некорректно!");
		}
		inputStr.close();
	}
	private static int factorial(int number) {
        int result;
        if (number == 1)
            return 1;
        result = factorial(number - 1) * number;
        return result;
    }
}