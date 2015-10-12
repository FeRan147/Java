import java.util.Scanner;
import java.util.Random;
public class Task3 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		String masInit[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" };
		String masInput[] = new String[15];
		String masRandom[] = new String[15];
		Random random = new Random();
		for(int i = 0; i < 15; i++) {
			System.out.println("¬ведите " + i + " элемент массива: ");
			String userStr = inputStr.nextLine();
			masInput[i] = userStr;
			masRandom[i] = String.valueOf(random.nextInt(100));
		}
		for(int i = 0; i < 15; i++) {
			System.out.print(masInit[i] + " | ");
		}
		System.out.println();
		for(int i = 0; i < 15; i++) {
			System.out.print(masInput[i] + " | ");
		}
		System.out.println();
		for(int i = 0; i < 15; i++) {
			System.out.print(masRandom[i] + " | ");
		}
		System.out.println();
		inputStr.close();
	}
}