public class Task13 {
	public static void main(String [] args) {
		System.out.println("Программа выводящая значения функции у = 2х^-5х-8 от -4 до 4");
		for(double i = -4; i <= 4; i += 0.5) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(double i = -4; i <= 4; i += 0.5) {
			System.out.print((2 * (i * i) - 5 * i - 8) + "\t");
		}
	}
}