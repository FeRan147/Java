public class Task13 {
	public static void main(String [] args) {
		System.out.println("��������� ��������� �������� ������� � = 2�^-5�-8 �� -4 �� 4");
		for(double i = -4; i <= 4; i += 0.5) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(double i = -4; i <= 4; i += 0.5) {
			System.out.print((2 * (i * i) - 5 * i - 8) + "\t");
		}
	}
}