package basic_algorithm;

import java.util.Scanner;

public class BasicAlgorithm16 {
	
	/*	
	 * ���� �̵ �ﰢ�� ���
	 * ���߷��� ����
	 * ���ʾƷ��� ������ �̵ �ﰢ���� ����մϴ�.
	 * ���� ) 5
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		
		int a;
		System.out.println("�����ﰢ�� ����� ����");
		do {
			System.out.println("���ڸ� �Է��ϼ���!~");
			a = in.nextInt();
			
		}while(a <0);

		for (int i = 0; i < a; i++) {
			System.out.printf("*");
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}	
		
		System.out.println("���� �ﰢ�� ��~~! ��¥������");
	}
}
