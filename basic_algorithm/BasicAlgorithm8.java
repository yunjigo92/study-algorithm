package basic_algorithm;

import java.util.Scanner;

public class BasicAlgorithm8 {
	

	/*	
	 * do while ��뿹�� 0���� ū���� �Է����� ����
	 * 1-n������ ���� ���Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ����");
		
		do {
			System.out.println("n�ǰ�");
			n = in.nextInt();
		}while(n<=0);
		
		int sum=0;
		for(int i=1; i<=n; i++)
			sum+=i;
		
		System.out.println("1����"+n+"������ ����" + sum + "�Դϴ�.");
	}
	


}
