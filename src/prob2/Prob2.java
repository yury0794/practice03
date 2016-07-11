package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 : ");
		int money = scanner.nextInt();
		int num = 0;

		int[] m = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		for (int i = 0; i < m.length; i++) {

			while (m[i] <= money) {
				money = money - m[i];
				num++;
			}
			
			System.out.println(m[i] + "원 : " + num + "개");
			num = 0;
		}
	}
}