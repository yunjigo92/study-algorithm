package basic_algorithm;

import java.util.Scanner;

public class BasicAlgorithm9 {
	

	/*	
	 * �� ���� ���� ���Ѵ�.
	 * ù��° �Է��� ���� �ι�° �Է��� ������ ������ Ŀ���Ѵ�!!
	 * �±�
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int a;
		int b;
		System.out.println("a�� b�� ���� ����");
		
		do {
			System.out.println("a�ǰ�");
			a = in.nextInt();
		}while(a<=0);
		
		do {
			System.out.println("b�ǰ�");
			b = in.nextInt();
		}while(b<=a);
		
		System.out.println("�μ��� ����" + (b-a) + "�Դϴ�.");
	}
	


}
