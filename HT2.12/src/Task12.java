import java.util.Scanner;
public class Task12 {
	public static void main(String [] args) {
		try {
			Scanner inputStr = new Scanner(System.in);
			String numberStr;
			String regexStr = "^?\\d+$";
			System.out.println("������� ����� ��� ���������� ����� �� 1 �� n, ��� n ��������� �����: ");
			numberStr = inputStr.nextLine();
			if(numberStr.matches(regexStr) == true) {
				int number = Integer.parseInt(numberStr);
				int result = 0;
				for(int i = 1; i <= number; i++) {
					result += i;
				}
				System.out.println("����� ����� �� 1 �� " + number + ": " + result);
			} else {
				System.out.println("��������� ���������� �����������!");
			}
			inputStr.close();
			} catch(NumberFormatException ex) {
				System.err.println("��������� ����� ������� ������!");
        }  
	}
}