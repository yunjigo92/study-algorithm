package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
 * �ϻ����
 * 
���� ����
���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. ���� ��� 18�� �ڸ��� ���� 1+8=9�̰�,
 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. �ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
x�� 1 �̻�, 10000 ������ �����Դϴ�.
����� ��
arr	return
10	true
12	true
11	false
13	false
����� �� ����
����� �� #1
10�� ��� �ڸ����� ���� 1�Դϴ�. 10�� 1�� ������ �������Ƿ� 10�� �ϻ��� ���Դϴ�.

����� �� #2
12�� ��� �ڸ����� ���� 3�Դϴ�. 12�� 3���� ������ �������Ƿ� 12�� �ϻ��� ���Դϴ�.

����� �� #3
11�� ��� �ڸ����� ���� 2�Դϴ�. 11�� 2�� ������ �������� �����Ƿ� 11�� �ϻ��� ���� �ƴմϴ�.

����� �� #4
13�� ��� �ڸ����� ���� 4�Դϴ�. 13�� 4�� ������ �������� �����Ƿ� 13�� �ϻ��� ���� �ƴմϴ�.
 */

public class Programmers12947 {

	public static void main(String[] args) {
		
		
		int a = 11;
		boolean tmp = solution(a);
		/*
		 * for(int i =0; i< tmp.length; i++) { System.out.println(tmp[i]); }
		 */
		
		System.out.println(tmp);
		
		
		
	}
	
	public static boolean solution(int num) {
		int sum =0 ,tmp=num;
		while(tmp != 0){
			sum+= tmp%10;
			tmp /=10;
		}
		
		return num%sum==0? true : false;
	}
}
