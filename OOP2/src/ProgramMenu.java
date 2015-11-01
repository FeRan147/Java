import java.util.Scanner;

public final class ProgramMenu {
	private static Scanner inputStr;

	public static void chooseSalad() {
		inputStr = new Scanner(System.in);
		String choose;

		String[] menuList = { Cezar.name, Olivie.name };
		System.out.println("�������� ����� ��� �������������: ");
		for (int i = 0; i < 2; i++) {
			System.out.println(menuList[i] + " - " + (i + 1));
		}
		choose = inputStr.nextLine();
		switch (choose) {
		case "1":
			cezarChoose();
			break;
		case "2":
			olivieChoose();
			break;
		default:
			break;
		}
	}

	private static void olivieChoose() {
		inputStr = new Scanner(System.in);
		double potatoWeight, tomatoWeight, onionWeight;
		System.out.println("������� ���������� ��������� � �������: ");
		potatoWeight = Double.parseDouble(inputStr.nextLine());
		System.out.println("������� ���������� ������� � �������: ");
		tomatoWeight = Double.parseDouble(inputStr.nextLine());
		System.out.println("������� ���������� ���� � �������: ");
		onionWeight = Double.parseDouble(inputStr.nextLine());
		Salad olivie = new Olivie(potatoWeight, tomatoWeight, onionWeight);
		saladSort(olivie);
		saladComposition(olivie);
	}

	private static void cezarChoose() {
		inputStr = new Scanner(System.in);
		double potatoWeight, tomatoWeight;
		System.out.println("������� ���������� ��������� � �������: ");
		potatoWeight = Double.parseDouble(inputStr.nextLine());
		System.out.println("������� ���������� ������� � �������: ");
		tomatoWeight = Double.parseDouble(inputStr.nextLine());
		Salad cezar = new Cezar(potatoWeight, tomatoWeight);
		saladSort(cezar);
		saladComposition(cezar);
		inputStr.close();
	}

	public static void forFinder(Salad salad) {
		for (int i = 0; i < salad.getVegetablesForSalad().size(); i++) {
			System.out.println(salad.getVegetablesForSalad().get(i).getName() + " "
					+ salad.getVegetablesForSalad().get(i).getWeight() + " ��.");
		}
	}

	public static void saladSort(Salad salad) {
		inputStr = new Scanner(System.in);
		String choose;
		System.out.println(
				"�������� �� ������ �������� ����������� ����������� ������.\n�� ����� - 1\n�� ������������� - 2\n�� ���� - 3");
		choose = inputStr.nextLine();
		switch (choose) {
		case "1":
			salad.sortVegetablesByName();
			break;
		case "2":
			salad.sortVegetablesByCalory();
			break;
		case "3":
			salad.sortVegetablesByWeight();
			break;
		default:
			break;
		}
	}

	public static void saladComposition(Salad salad) {
		System.out.println("������ ������: ");
		forFinder(salad);
		System.out.println("�������������� �������� ������: " + salad.calculateCalory() + "����");
		caloryVegetablesFinder(salad);
	}

	public static void caloryVegetablesFinder(Salad salad) {
		inputStr = new Scanner(System.in);
		String choose;
		System.out.println(
				"��� ���� ����� ���������� ����� ������ �� ��������� ������������ ������� 1, ����� ������ ������ - ����� �� ���������: ");
		choose = inputStr.nextLine();
		switch (choose) {
		case "1":
			double first, second;
			System.out.println("������� ������ ����� ���������: ");
			first = Double.parseDouble(inputStr.nextLine());
			System.out.println("������� ������ ����� ���������: ");
			second = Double.parseDouble(inputStr.nextLine());
			for (int i = 0; i < salad.findCaloryVegetables(first, second).size(); i++) {
				System.out.println(salad.getVegetablesForSalad().get(i).getName() + " "
						+ salad.getVegetablesForSalad().get(i).getCalory() + " ����");
			}
			break;
		default:
			break;
		}
	}
}