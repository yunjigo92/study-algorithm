package basic_algorithm;

import java.util.Scanner;

public class BasicAlgorithm10 {
	
	/*	
	 * ���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷��� �ۼ��ϼ���
	 * ������� 135 �̸� 3�� ��� 12345 �̸� 5�� ���
	 * 
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		int a = in.nextInt();
		int i=0;
		do {
			a /= 10;
			i++;
		}while(a>0);
		
		System.out.println("�Է��� �ڸ����� " + i + "�Դϴ�.");
	}
	


}
