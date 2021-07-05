package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
 * ����� ����
 * 
���� ����
����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��,
���� ���� ���� ���� ���� ����� �˴ϴ�. 
2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
��� arr1, arr2�� ��� ���� ���̴� 500�� ���� �ʽ��ϴ�.
����� ��
arr1	arr2	return
[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
[[1],[2]]	[[3],[4]]	[[4],[6]]

 */

public class Programmers12950 {

	public static void main(String[] args) {
		
		
		int[][] a = {{1,2},{2,3}};
		int[][] b = {{1,2},{2,3}};
		int[][] tmp = solution(a,b);
		/*
		 * for(int i =0; i< tmp.length; i++) { System.out.println(tmp[i]); }
		 */
		
		System.out.println(tmp);
		
		
		
	}
	
	public static int[][] solution(int[][] a, int[][] b) {
		int[][] result = a.clone();
		for(int i=0;i<a.length; i++) {
			for(int j=0;j<a[i].length; j++) {
				result[i][j] =a[i][j]+b[i][j];
			}
		}
		
		return result;
	}
}
