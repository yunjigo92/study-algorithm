package test;

import java.util.ArrayList;

/*
 * 
 * �ڸ��� ���ϱ�
 * 
���� ����
�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

���ѻ���
N�� ���� : 100,000,000 ������ �ڿ���
����� ��
N	answer
123	6
987	24
����� �� ����
����� �� #1
������ ���ÿ� �����ϴ�.

����� �� #2
9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.

 */

public class Programmers12931 {

	public static void main(String[] args) {
		
		
		int a = 123;
		int tmp = solution(a);
		System.out.println(tmp);
	}
	
	public static int solution(int a) {
		int result = 0;
		
		while(a != 0) {
			result += a%10;
			a /= 10;
		}
		
		
		return result;
	}
}
