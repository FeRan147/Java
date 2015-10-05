import java.util.Scanner;
public class Task6 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		String numberStr;
		String regexStr = "^?\\d+$";
		System.out.println("������� ����� �� 1 �� 999: ");
		numberStr = inputStr.nextLine();
		if(numberStr.matches(regexStr) == true) {
			int number = Integer.parseInt(numberStr);
			if(number > 0 && number < 1000) {
				System.out.println(number + wordEnd(numberStr));
			} else {
				System.out.println("��������� ����� �� ��������� � ����������� ���������!");
			}
		} else {
			System.out.println("��������� ������ �����������!");
		}
		inputStr.close();
	}
	private static String wordEnd(String numberStr) {
		if(numberStr.matches("1\\d$"))
			return " ������";
		if(numberStr.matches("1$"))
			return " �����";
		if(numberStr.matches("(2|3|4)$"))
			return " �����";
		return " ������";
	}
}