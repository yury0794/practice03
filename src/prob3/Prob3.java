package prob3;

public class Prob3 {

	public static void main(String args[]) {

		char[] array1 = reverse("Hello World");
		printCharArray(array1);

		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);

	}

	public static char[] reverse(String str) {
		int num = str.length();
		char[] c = new char[num];

		for (int i = 0; i < num; i++) {
			c[i] = str.charAt(num - i - 1);
		}

		return c;
	}

	public static void printCharArray(char[] array) {
		System.out.print(array);
	}
}