package study;

/*
 * 
 * ¦���� Ȧ��
 * 
���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
num�� int ������ �����Դϴ�.
0�� ¦���Դϴ�.
����� ��
num	return
3	Odd
4	Even
 */

public class Programmers12937 {

	public static void main(String[] args) {
		
		
		int a = 3;
		String tmp = solution(a);
		/*
		 * for(int i =0; i< tmp.length; i++) { System.out.println(tmp[i]); }
		 */
		
		System.out.println(tmp);
		
		
		
	}
	
	public static String solution(int num) {
		String[] arrs = {"Even","Odd"};
		return num%2 ==0 ? arrs[0] : arrs[1];
		
	}
}
