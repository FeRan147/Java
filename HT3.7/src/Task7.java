import java.util.Random;
public class Task7 {
	public static void main(String [] args) {
		int mas[] = new int[10];
		Random random = new Random();
		for(int i = 0; i < mas.length; i++) {
			mas[i] = random.nextInt(10);
			System.out.print(mas[i] + " | ");
		}
		int sum = 0;
		for(int i = 0; i < mas.length; i++) {
			sum += mas[i];
			if(mas[i] == 0) {
				break;
			}
		}
		System.out.println("\n����� ��������� �� ������� ����: " + sum);
	}
}
