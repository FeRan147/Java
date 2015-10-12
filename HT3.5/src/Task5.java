import java.util.Random;
public class Task5 {
	public static void main(String [] args) {
		int mas[] = new int[15];
		Random random = new Random();
		for(int i = 0; i < mas.length; i++) {
			mas[i] = random.nextInt(100);
			System.out.print(mas[i] + " | ");
		}
		int min = mas[0];
		int minIndex = 0;
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] < min) {
				min = mas[i];
				minIndex = i + 1;
			}
		}
		System.out.println("\nМинмальным является " + minIndex + " элемент массива со значением " + min);
	}
}