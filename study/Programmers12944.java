package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
 * ��� ���ϱ�
 * 
���� ����
������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.

���ѻ���
arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.
����� ��
arr	return
[1,2,3,4]	2.5
[5,5]	5
 */

public class Programmers12944 {

	public static void main(String[] args) {
		
		
		int[] a = {1,2,3,4};
		double tmp = solution(a);
		/*
		 * for(int i =0; i< tmp.length; i++) { System.out.println(tmp[i]); }
		 */
		
		System.out.println(tmp);
		
		
		
	}
	
	public static double solution(int[] num) {
		double result = 0;
		for(int i=0; i<num.length; i++) {
			result += num[i];
		}
		
		return result/num.length;
	}
}
