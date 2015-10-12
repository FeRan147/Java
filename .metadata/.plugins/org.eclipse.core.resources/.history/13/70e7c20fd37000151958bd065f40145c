import java.util.Random;
public class Task8 {
	public static void main(String [] args) {
		int mas[] = new int[10];
		Random random = new Random();
		for(int i = 0; i < mas.length; i++) {
			mas[i] = random.nextInt(10);
			System.out.print(mas[i] + " | ");
		}
		int mult = 1;
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] == 0) {
				break;
			}
			mult *= mas[i];
		}
		System.out.println("\nСумма элементов до первого нуля: " + mult);
	}
}