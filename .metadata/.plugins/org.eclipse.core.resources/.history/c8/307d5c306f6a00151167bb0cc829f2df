import java.util.Scanner;
public class Task5 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		String heightStr, weightStr;
		String regexStr = "[+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";
		System.out.println("Введите Ваш рост, см: ");
		heightStr = inputStr.nextLine();
		System.out.println("Введите Ваш вес, кг: ");
		weightStr = inputStr.nextLine();
		if(heightStr.matches(regexStr) == true && weightStr.matches(regexStr) == true) {
			double height = Double.parseDouble(heightStr);
			double weight = Double.parseDouble(weightStr);
			double optimalWeight = height - 100;
			if(weight > optimalWeight) {
				System.out.println("Вам нужно сбросить " + (weight - optimalWeight) + " кг!");
			} else {
				if(weight == optimalWeight) {
					System.out.println("У Вас идеальное соотношение роста и веса!");
				} else {
					System.out.println("Вам нужно набрать " + (optimalWeight - weight) + " кг!");
				}
			}
		} else {
			if(heightStr.matches(regexStr) == false && weightStr.matches(regexStr) == false) {
				System.out.println("Введенные рост и вес не является корректными!");
			} else {
				if(heightStr.matches(regexStr) == false) {
					System.out.println("Введенные рост не является корректным!");
				} else {
					System.out.println("Введенные вес не является корректным!");
				}
			}
		}
		inputStr.close();
	}
}