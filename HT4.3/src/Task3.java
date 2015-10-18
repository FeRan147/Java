import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите текст:");
		String a = in.nextLine();
		a = a.replaceAll("(?u)[^\\pL ]","");
		System.out.println(a);
		in.close();
	}
}