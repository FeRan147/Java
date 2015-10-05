import java.util.GregorianCalendar;
import java.util.Scanner;
public class Task4 {
	public static void main(String [] args) {
		GregorianCalendar tempCalendar = new GregorianCalendar();
		Scanner inputStr = new Scanner(System.in);
		String yearStr;
		String regexStr = "^?\\d+$";
		System.out.println("������� ���: ");
		yearStr = inputStr.nextLine();
		if(yearStr.matches(regexStr) == true) {
			int year = Integer.parseInt(yearStr);
			if(tempCalendar.isLeapYear(year) == true) {
				System.out.println(year + " ��� �������� ����������!");
			} else {
				System.out.println(year + " ��� �� �������� ����������!");
			}
		} else {
			System.out.println("��������� ������ �� �������� �����!");
		}
		inputStr.close();
	}
}