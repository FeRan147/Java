import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ ������:");
		String firstStr = in.nextLine();
		System.out.println("������� ������ ������:");
		String secondStr = in.nextLine();
		if(permutation(firstStr, secondStr)) {
			System.out.println(firstStr + " �������� ������������� " + secondStr);
		} else {
			System.out.println(firstStr + " �� �������� ������������� " + secondStr);
		}
		in.close();
	}

	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] letters = new int[256];

		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			letters[c]++;
		}

		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			if (--letters[c] < 0) {
				return false;
			}
		}

		return true;
	}
}
