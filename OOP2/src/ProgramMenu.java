import java.util.Scanner;

public final class ProgramMenu {
	private static Scanner inputStr;

	public static void chooseSalad() {
		inputStr = new Scanner(System.in);
		String choose;

		String[] menuList = { Cezar.name, Olivie.name };
		System.out.println("Выберите салат для приготовления: ");
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
		System.out.println("Введите количество картофеля в граммах: ");
		potatoWeight = Double.parseDouble(inputStr.nextLine());
		System.out.println("Введите количество томатов в граммах: ");
		tomatoWeight = Double.parseDouble(inputStr.nextLine());
		System.out.println("Введите количество лука в граммах: ");
		onionWeight = Double.parseDouble(inputStr.nextLine());
		Salad olivie = new Olivie(potatoWeight, tomatoWeight, onionWeight);
		saladSort(olivie);
		saladComposition(olivie);
	}

	private static void cezarChoose() {
		inputStr = new Scanner(System.in);
		double potatoWeight, tomatoWeight;
		System.out.println("Введите количество картофеля в граммах: ");
		potatoWeight = Double.parseDouble(inputStr.nextLine());
		System.out.println("Введите количество томатов в граммах: ");
		tomatoWeight = Double.parseDouble(inputStr.nextLine());
		Salad cezar = new Cezar(potatoWeight, tomatoWeight);
		saladSort(cezar);
		saladComposition(cezar);
		inputStr.close();
	}

	public static void forFinder(Salad salad) {
		for (int i = 0; i < salad.getVegetablesForSalad().size(); i++) {
			System.out.println(salad.getVegetablesForSalad().get(i).getName() + " "
					+ salad.getVegetablesForSalad().get(i).getWeight() + " гр.");
		}
	}

	public static void saladSort(Salad salad) {
		inputStr = new Scanner(System.in);
		String choose;
		System.out.println(
				"Выберите по какому признаку сортировать ингридиенты салата.\nПо имени - 1\nПо каллорийности - 2\nПо весу - 3");
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
		System.out.println("Состав салата: ");
		forFinder(salad);
		System.out.println("Энергетическая ценность салата: " + salad.calculateCalory() + "кКал");
		caloryVegetablesFinder(salad);
	}

	public static void caloryVegetablesFinder(Salad salad) {
		inputStr = new Scanner(System.in);
		String choose;
		System.out.println(
				"Для того чтобы произвести поиск овощей по диапозону калорийности нажмите 1, любой другой символ - выход из программы: ");
		choose = inputStr.nextLine();
		switch (choose) {
		case "1":
			double first, second;
			System.out.println("Введите первое число диапозона: ");
			first = Double.parseDouble(inputStr.nextLine());
			System.out.println("Введите второе число диапозона: ");
			second = Double.parseDouble(inputStr.nextLine());
			for (int i = 0; i < salad.findCaloryVegetables(first, second).size(); i++) {
				System.out.println(salad.getVegetablesForSalad().get(i).getName() + " "
						+ salad.getVegetablesForSalad().get(i).getCalory() + " кКал");
			}
			break;
		default:
			break;
		}
	}
}