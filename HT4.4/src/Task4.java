import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� �����:");
		String a = in.nextLine();
		System.out.println("������� ����� �����:");
		int len = Integer.parseInt(in.nextLine());
		a = a.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]{1}[a-z]{" + (len - 1) + "}", "");
		System.out.println(a);
		in.close();
	}
}
