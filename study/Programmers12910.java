package test;

import java.util.ArrayList;
import java.util.Arrays;



/*
 * 
 * ������ �������� ���� �迭

 * 
 ���� ����
array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.

���ѻ���
arr�� �ڿ����� ���� �迭�Դϴ�.
���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
divisor�� �ڿ����Դϴ�.
array�� ���� 1 �̻��� �迭�Դϴ�.
����� ��
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]
����� �� ����
����� ��#1
arr�� ���� �� 5�� ������ �������� ���Ҵ� 5�� 10�Դϴ�. ���� [5, 10]�� �����մϴ�.

����� ��#2
arr�� ��� ���Ҵ� 1���� ������ �������ϴ�. ���Ҹ� ������������ ������ [1, 2, 3, 36]�� �����մϴ�.

����� ��#3
3, 2, 6�� 10���� ������ �������� �ʽ��ϴ�. ������ �������� ���Ұ� �����Ƿ� [-1]�� �����մϴ�.

 
 */

public class Programmers12910 {

	public static void main(String[] args) {
		
		
		int[] arr =  {5,9,7,10};
		int divisor = 5;
		System.out.println(solution(arr,divisor));
	}
	
	public static int[] solution(int[] arr,int divisor) {
		// ���� ������������ ����
		Arrays.sort(arr);
		
		//������ ���� 1�̸� �״�� return
		if(divisor==1){
			return arr;
		}
		ArrayList<Integer> lists = new ArrayList<Integer>();

		// ������ ���� �Ÿ� �߰��ϱ�
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				lists.add(arr[i]);
			} else {
				continue;
			}
		}

		// ������ ���°� ������ -1 ����
		if (lists.size() == 0) {
			return new int[] { -1 };
		} else {
			// �ƴ� ���� set��ŭ �迭 ���� �� ���Ƽ� ����
			int[] retArr = new int[lists.size()];
			int count = 0;
			for (int num : lists) {
				retArr[count++] = num;
			}
			// ��~~~!
			return retArr;
		}
	}
}
