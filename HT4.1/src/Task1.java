import java.util.Scanner;
public class Task1 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		System.out.println("������� �����: ");
		String str = inputStr.nextLine();
		System.out.println("������� ����� ������� ��� ������: ");
		int symbolNum = Integer.valueOf(inputStr.nextLine());
		System.out.println("������� ������ ��� ������: ");
		String symbol = inputStr.nextLine();
		char[] strChar = str.toCharArray();
		inputStr.close();
	}
}