package basic_algorithm;

import java.util.Scanner;

public class BasicAlgorithm11 {

	/*
	 * 2�ڸ��� ����� �Է¹޽��ϴ�.(10~99) 1�ڸ��� 3�ڸ��� ��������ʽ��ϴ�.
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a;

		do {
			System.out.println("���ڸ� �Է��ϼ���");
			a = in.nextInt();

		} while (a < 10 || a > 99);

		System.out.println("�Է��� ���� " + a + "�Դϴ�.");
	}

}
