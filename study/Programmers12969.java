package test;

/*
 * 
 * ���簢�� �����
 * 
���� ����
�� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.

���� ����
n�� m�� ���� 1000 ������ �ڿ����Դϴ�.
����
�Է�

5 3
���

*****
*****
*****

 */

public class Programmers12969 {

	public static void main(String[] args) {
		
		
		int a = 3;
		int b = 5;
		  solution(a,b);
		
		//for(int i =0; i< tmp.length; i++) { System.out.println(tmp[i]); }
		
		
	}
	
	public static void solution(int a, int b) {
		//if(a<-10000000 || a > 10000000) return new long[0];
		
		for(int i=0; i<a;i++) {
			for(int j=0; j<b;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//return result;
	}
}
