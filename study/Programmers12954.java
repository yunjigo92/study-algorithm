package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
 * x��ŭ ������ �ִ� n���� ����
 * 
���� ����
�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, 
x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
n�� 1000 ������ �ڿ����Դϴ�.
����� ��
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8]

 */

public class Programmers12954 {

	public static void main(String[] args) {
		
		
		int a = -10000000;
		int b = 10;
		long[] tmp = solution(a,b);
		
		for(int i =0; i< tmp.length; i++) { System.out.println(tmp[i]); }
		
		
		//System.out.println(tmp);
		
		
		
	}
	
	public static long[] solution(int a, int b) {
		//if(a<-10000000 || a > 10000000) return new long[0];
		
		long[] result = new long[b];
		int count = 0;
		for(long i=1;i<=b; i++) {
			result[count++] = a*i;
		}
		
		return result;
	}
}
