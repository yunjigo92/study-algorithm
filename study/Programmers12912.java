package test;

/*
 * 
 * �� ���� ������ ��
 * 
���� ����
�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

���� ����
a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
����� ��
a	b	return
3	5	12
3	3	3
5	3	12

 */

public class Programmers12912 {

	public static void main(String[] args) {
		
		
		int a = 3;
		int b = 5;
		int tmp = solution(a,b);
		System.out.println(tmp);
	}
	
	public static int solution(int a,int b) {
		int result = 0;
		
		for(int i=Math.min(a,b); i<=Math.max(a, b); i++) {
			result += i;
		}
	
		return result;
	}
}
