import java.util.Random;
public class Task4 {
	public static void main(String [] args) {
		int mas[] = new int[15];
		Random random = new Random();
		for(int i = 0; i < mas.length; i++) {
			mas[i] = random.nextInt(100);
			System.out.print(mas[i] + " | ");
		}
		int max = mas[0];
		int maxIndex = 0;
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] > max) {
				max = mas[i];
				maxIndex = i + 1;
			}
		}
		System.out.println("\n������������ �������� " + maxIndex + " ������� ������� �� ��������� " + max);
	}
}