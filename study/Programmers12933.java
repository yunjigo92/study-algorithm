package study;

import java.util.Arrays;

/*
 * 
 * ���� ������������ ��ġ�ϱ�
 * 
���� ����
�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���.
 ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

���� ����
n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
����� ��
n	return
118372	873211
 */

public class Programmers12933 {

	public static void main(String[] args) {
		
		
		int a = 856794213;
		long tmp = solution(a);
		System.out.println(tmp);
		
		
	}
	
	public static long solution(long a) {
		String tmp = ""+a;
		String[] arrs =tmp.split("");
		
		Arrays.sort(arrs);
		
		tmp = "";
		for(int i=arrs.length-1; i>=0; i--) {
			tmp += "" +arrs[i];
		}
		
		
		return Long.parseLong(tmp);
	}
}
