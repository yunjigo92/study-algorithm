package test;

import java.util.ArrayList;

/*
 * 
 * �Ҽ� ã��
 * 
���� ����
1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.

�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
(1�� �Ҽ��� �ƴմϴ�.)

���� ����
n�� 2�̻� 1000000������ �ڿ����Դϴ�.
����� ��
n	result
10	4
5	3
����� �� ����
����� �� #1
1���� 10 ������ �Ҽ��� [2,3,5,7] 4���� �����ϹǷ� 4�� ��ȯ

����� �� #2
1���� 5 ������ �Ҽ��� [2,3,5] 3���� �����ϹǷ� 3�� ��ȯ

 */

public class Programmers12921 {

	public static void main(String[] args) {
		
		
		String a = "a234";
		int b = 10;
		int tmp = solution(b);
		System.out.println(tmp);
	}
	
	public static int solution(int n) {
		
		// n+1��ŭ �Ҵ�
		ArrayList<Integer> primeList = new ArrayList<Integer>(n+1);
		int count = 0;
		// 0��°�� 1��°�� �Ҽ� �ƴ����� ó��
		primeList.add(1);
		primeList.add(1);
		
		  // 2~ n ���� �Ҽ��� ����
		for(int i=2; i<=n; i++ ) 
			primeList.add(i, 0);
		 

		// 2 ����  ~ i*i <= n
		// ������ ������� ��������.
		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)==0){
				for(int j = i*2; j<=n; j+=i) {
					primeList.set(j, 1);
				}
				//i*i �̸��� �̹� ó���Ǿ����Ƿ� j�� ���۰��� i*i�� ����ȭ�� �� �ִ�.
			}
		}
		
		for(int i=0; i<primeList.size();i++) {
			if(1 !=primeList.get(i)) {
				count++;
			}
		}
		
		return count;
	}
}
