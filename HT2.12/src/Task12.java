import java.util.Scanner;
public class Task12 {
	public static void main(String [] args) {
		try {
			Scanner inputStr = new Scanner(System.in);
			String numberStr;
			String regexStr = "^?\\d+$";
			System.out.println("¬ведите число дл€ вычислени€ суммы от 1 до n, где n введенное число: ");
			numberStr = inputStr.nextLine();
			if(numberStr.matches(regexStr) == true) {
				int number = Integer.parseInt(numberStr);
				int result = 0;
				for(int i = 1; i <= number; i++) {
					result += i;
				}
				System.out.println("—умма чисел от 1 до " + number + ": " + result);
			} else {
				System.out.println("¬веденное количество некорректно!");
			}
			inputStr.close();
			} catch(NumberFormatException ex) {
				System.err.println("¬веденное число слишком велико!");
        }  
	}
}