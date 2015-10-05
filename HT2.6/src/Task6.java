import java.util.Scanner;
public class Task6 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		String numberStr;
		String regexStr = "^?\\d+$";
		System.out.println("Ââåäèòå ÷èñëî îò 1 äî 999: ");
		numberStr = inputStr.nextLine();
		if(numberStr.matches(regexStr) == true) {
			int number = Integer.parseInt(numberStr);
			if(number > 0 && number < 1000) {
				System.out.println(number + wordEnd(numberStr));
			} else {
				System.out.println("Ââåäåííîå ÷èñëî íå íàõîäèòñÿ â íåîáõîäèìîì äèàïàçîíå!");
			}
		} else {
			System.out.println("Ââåäåííàÿ çàïèñü íåêîğğåêòíà!");
		}
		inputStr.close();
	}
	private static String wordEnd(String numberStr) {
		if(numberStr.matches("1\\d$"))
			return " ğóáëåé";
		if(numberStr.matches("1$"))
			return " ğóáëü";
		if(numberStr.matches("(2|3|4)$"))
			return " ğóáëÿ";
		return " ğóáëåé";
	}
}