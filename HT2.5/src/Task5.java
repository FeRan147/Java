import java.util.Scanner;
public class Task5 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		String heightStr, weightStr;
		String regexStr = "[+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";
		System.out.println("������� ��� ����, ��: ");
		heightStr = inputStr.nextLine();
		System.out.println("������� ��� ���, ��: ");
		weightStr = inputStr.nextLine();
		if(heightStr.matches(regexStr) == true && weightStr.matches(regexStr) == true) {
			double height = Double.parseDouble(heightStr);
			double weight = Double.parseDouble(weightStr);
			double optimalWeight = height - 100;
			if(weight > optimalWeight) {
				System.out.println("��� ����� �������� " + (weight - optimalWeight) + " ��!");
			} else {
				if(weight == optimalWeight) {
					System.out.println("� ��� ��������� ����������� ����� � ����!");
				} else {
					System.out.println("��� ����� ������� " + (optimalWeight - weight) + " ��!");
				}
			}
		} else {
			if(heightStr.matches(regexStr) == false && weightStr.matches(regexStr) == false) {
				System.out.println("��������� ���� � ��� �� �������� �����������!");
			} else {
				if(heightStr.matches(regexStr) == false) {
					System.out.println("��������� ���� �� �������� ����������!");
				} else {
					System.out.println("��������� ��� �� �������� ����������!");
				}
			}
		}
		inputStr.close();
	}
}