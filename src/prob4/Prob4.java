package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		System.out.println("5개의 숫자를 입력하세요.");
		int length = intArray.length;
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			int num = scanner.nextInt();
			array[i] = num;
		}

		/* 배열에 저장된 정수 값 더하기 */
		for (int i = 0; i < length; i++) {
			sum = sum + array[i];
		}

		/* 출력 */
		System.out.println("평균은" + sum / length + "입니다.");

		/* 자원정리 */
		scanner.close();
	}
}