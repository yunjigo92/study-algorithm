package study;


/*
 * 
 * ���� ������ �Ǻ�
 * 
���� ����
������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.

���� ����
n�� 1�̻�, 50000000000000 ������ ���� �����Դϴ�.
����� ��
n	return
121	144
3	-1
����� �� ����
����� ��#1
121�� ���� ���� 11�� �����̹Ƿ�, (11+1)�� ������ 144�� �����մϴ�.

����� ��#2
3�� ���� ������ ������ �ƴϹǷ�, -1�� �����մϴ�.
 */

public class Programmers12934 {

	public static void main(String[] args) {
		
		
		int a = 3;
		long tmp = solution(a);
		System.out.println(tmp);
		
		
	}
	
	public static long solution(long a) {
		String[] strs = ("" +(Math.sqrt(a)%a)).split("\\.");
		
		if( strs[1].equals("0")) {
			return (long) Math.pow(Math.sqrt(a)+1, 2);
		}else {
			return -1;
		}
		/*
		 * �Ʒ�ó�� �ϴ� �� �� ȿ������ �� ����..
		 * 
		 * if (Math.pow((int)Math.sqrt(n), 2) == n) { return (long)
		 * Math.pow(Math.sqrt(n) + 1, 2); }
		 */
		
	}
}
