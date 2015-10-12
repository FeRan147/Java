import java.util.Random;
public class Task2 {
	public static void main(String [] args) {
		int mas[] = new int[10];
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			mas[i] = random.nextInt(100);
			System.out.print(mas[i] + " | ");
		}
		int min = mas[0], max = mas[0];
		for(int i = 0; i < 10; i++) {
			if(mas[i] > max) {
				max = mas[i];
			}
			if(mas[i] < min) {
				min = mas[i];
			}
		}
		System.out.println("\nmax = " + max + "\nmin = " + min);
	}
}
