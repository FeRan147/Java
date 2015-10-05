import java.util.Scanner;
public class Task2 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		String firstNumber, secondNumber;
		String regexStr = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";
		System.out.println("Введите первое число для сравнения: ");
		firstNumber = inputStr.nextLine();
		System.out.println("Введите второе число для сравнения: ");
		secondNumber = inputStr.nextLine();
		if(firstNumber.matches(regexStr) == true && secondNumber.matches(regexStr) == true) {
			double first = Double.parseDouble(firstNumber);
			double second = Double.parseDouble(secondNumber);
			if(first > second) {
				System.out.println(first + " > " + second);
			} else {
				if(first == second) {
					System.out.println(first + " = " + second);
				} else {
					System.out.println(first + " < " + second);
				}
			}
		} else {
			if(firstNumber.matches(regexStr) == false && secondNumber.matches(regexStr) == false) {
				System.out.println("Обе введенные записи не является числами. Сравнение невозможно!");
			} else {
				if(firstNumber.matches(regexStr) == false) {
					System.out.println("Первая запись не является числом. Сравнение невозможно!");
				} else {
					System.out.println("Вторая запись не является числом. Сравнение невозможно!");
				}
			}
		}
		inputStr.close();
	}
}