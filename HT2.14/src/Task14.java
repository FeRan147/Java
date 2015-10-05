import java.util.Scanner;
public class Task14 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		String firstNumberStr, secondNumberStr, operationStr;
		String quitStr = null;
		String regexStr = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";
		String operRegexStr = "[-+*/]";
		do {
			System.out.println("Введите первое число: ");
			firstNumberStr = inputStr.nextLine();
			System.out.println("Введите второе: ");
			secondNumberStr = inputStr.nextLine();
			System.out.println("Введите действие: ");
			operationStr = inputStr.nextLine();
			if(firstNumberStr.matches(regexStr) == true && secondNumberStr.matches(regexStr) == true && operationStr.matches(operRegexStr) == true) {
				double firstNumber = Double.parseDouble(firstNumberStr);
				double secondNumber = Double.parseDouble(secondNumberStr);
				if(operationStr.equals("+") == true) {
					System.out.println(Calculator.sum(firstNumber, secondNumber));
				}
				if(operationStr.equals("-") == true) {
					System.out.println(Calculator.sub(firstNumber, secondNumber));
				}
				if(operationStr.equals("*") == true) {
					System.out.println(Calculator.mult(firstNumber, secondNumber));
				}
				if(operationStr.equals("/") == true) {
					System.out.println(Calculator.div(firstNumber, secondNumber));
				}
			} else {
				System.out.println("Некорректная запись!");
			}
			System.out.println("Для прдолжения нажмите любую клавишу, для выхода - q: ");
			quitStr = inputStr.nextLine();
		} while (quitStr.equals("q") == false);
		inputStr.close();
	}
}