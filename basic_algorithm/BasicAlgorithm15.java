package basic_algorithm;

import java.util.Scanner;

public class BasicAlgorithm15 {
	
	/*	
	 * ���ʱ���
	 * �Է��� ���� �Ѻ����� �ϴ� �� �簢���� *��ȣ�� ����Ͻÿ�
	 * ��) 3
	 * ***
	 * ***
	 * ***
	 * �̷�������!!
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		
		int a;
		System.out.println("���簢�� ����� ����");
		do {
			System.out.println("���ڸ� �Է��ϼ���!~");
			a = in.nextInt();
			
		}while(a <0);

		for (int i = 0; i < a; i++) {
			System.out.printf("*");
			for (int j = 1; j < a; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}	
		
		System.out.println("���簢���� ��¥������");
	}
}
