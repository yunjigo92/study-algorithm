package study;


/*
 * 
 * ���ڿ� �ٷ�� �⺻
 * 
���� ����
���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. ���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.

���� ����
s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
����� ��
s	return
a234	false
1234	true

 */

public class Programmers12918 {

	public static void main(String[] args) {
		
		
		String a = "a234";
		int b = 5;
		boolean tmp = solution(a);
		System.out.println(tmp);
	}
	
	public static boolean solution(String a) {
		
		for(int i=0; i<a.length(); i++) {
			char tmp = a.charAt(i);
			if(tmp > 48 && tmp < 57) {
				return false;
			}
		}
		return true;
	}
}
