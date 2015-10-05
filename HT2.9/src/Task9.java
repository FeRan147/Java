import java.util.Scanner;
public class Task9 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		String numberStr;
		String regexStr = "^?\\d+$";
		System.out.println("������� ���������� ������ ���� 1 + 1/2 + 1/3 + 1/4 + ...: ");
		numberStr = inputStr.nextLine();
		if(numberStr.matches(regexStr) == true) {
			int number = Integer.parseInt(numberStr);
			double result = 0;
			for(int i = 1; i <= number; i++) {
				result += 1.0 / (double)i;
			}
			System.out.println("����� ������ ����: " + result);
		} else {
			System.out.println("��������� ���������� �����������!");
		}
		inputStr.close();
	}
}