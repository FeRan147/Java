import java.util.Random;
public class Task6 {
	public static void main(String [] args) {
		int mas[] = new int[10];
		Random random = new Random();
		for(int i = 0; i < mas.length; i++) {
			mas[i] = random.nextInt();
			System.out.print(mas[i] + " | ");
		}
		int negCounter = 0, posCounter = 0;
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] < 0) {
				negCounter++;
			}
			if(mas[i] > 0) {
				posCounter++;
			}
		}
		System.out.println("\nКоличество положительных элементов в массиве: " + posCounter+ "\nКоличество отрицательных элементов в массиве: " + negCounter);
	}
}