package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
 * �ڵ��� ��ȣ ������
 * 
���� ����
���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
����� ��
phone_number	return
01033334444	*******4444
027778888	*
 */

public class Programmers12948 {

	public static void main(String[] args) {
		
		
		String a = "01033334444";
		String tmp = solution(a);
		/*
		 * for(int i =0; i< tmp.length; i++) { System.out.println(tmp[i]); }
		 */
		
		System.out.println(tmp);
		
		
		
	}
	
	public static String solution(String phone) {
		String result = "";
		for(int i=0; i<phone.length()-4;i++) {
			result += "*";
		}
		result +=phone.substring(phone.length()-4);
		
		return result;
	}
}
