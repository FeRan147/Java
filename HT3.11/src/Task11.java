import java.util.Scanner;
import java.util.Random;
public class Task11 {
	public static void main(String [] args) {
		Scanner inputStr = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Введите натуральное число: ");
		int n = Integer.valueOf(inputStr.nextLine());
		int masRandom[][] = new int[n][n];
		for(int i = 0; i < masRandom.length; i++) {
			for(int j = 0; j < masRandom.length; j++) {
				masRandom[i][j] = random.nextInt(100);
			}
		}
		for(int i = 0; i < masRandom.length; i++) {
			for(int j = 0; j < masRandom.length; j++) {
				System.out.print(masRandom[i][j] + " | ");
			}
			System.out.println();
		}
		int mainDiag[] = new int[n];
		int slaveDiag[] = new int[n];
		for(int i = 0, k = 0, l = 0; i < masRandom.length; i++) {
			for(int j = 0; j < masRandom.length; j++) {
				if(i == j) {
					mainDiag[k] = masRandom[i][j];
					k++;
				}
				if(j == n - i - 1) {
					slaveDiag[l] = masRandom[i][j];
					l++;
				}
			}
		}
		System.out.println("Главная диагональ:");
		for(int i = 0; i < mainDiag.length; i++) {
			System.out.print(mainDiag[i] + " | ");
		}
		System.out.println("\nПобочная диагональ:");
		for(int i = 0; i < slaveDiag.length; i++) {
			System.out.print(slaveDiag[i] + " | ");
		}
		inputStr.close();
	}
}