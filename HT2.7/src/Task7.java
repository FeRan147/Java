import java.util.*;
public class Task7 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		String numberStr;
		String regexStr = "^?\\d+$";
		System.out.println("������� ����� ��� ������: ");
		numberStr = inputStr.nextLine();
		if(numberStr.matches(regexStr) == true) {
			int number = Integer.parseInt(numberStr);
			String[] dayNames = {"�����������", "�������", "�����", "�������", "�������", "�������", "�����������"};
			if(number > 0 && number < 8) {
				System.out.println(dayNames[number - 1]);
			} else {
				System.out.println("��� ������ � ����� ������� �� ����������!");
			}
		} else {
			System.out.println("��������� ������ �����������!");
		}
		inputStr.close();
	}
}