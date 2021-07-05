package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
 * ���� ���� �� �����ϱ�
 * 
���� ����
������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. 
��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.

���� ����
arr�� ���� 1 �̻��� �迭�Դϴ�.
�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
����� ��
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]
 */

public class Programmers12935 {

	public static void main(String[] args) {
		
		
		int[] a = {4,3,2,1};
		int[] tmp = solution(a);
		for(int i =0; i< tmp.length; i++) {
			System.out.println(tmp[i]);
		}
		
		
		
	}
	
	public static int[] solution(int[] arr) {
		if(arr.length == 1) {
			return new int[] {-1};
		}else {
			int[] copyArr = arr.clone();
			int count = 0;
			Arrays.sort(arr);
			int[] result = new int[arr.length-1];
			for(int i=0; i<arr.length; i++) {
				if(copyArr[i] == arr[0]) {
					continue; 
				}
				result[count++] = copyArr[i];
			}
			return result;
		}
	}
}
