package study;

import java.util.ArrayList;

/*
 * 
 * ���� ��ȣ
 * 
���� ����
� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. 
���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

���� ����
������ �ƹ��� �о �����Դϴ�.
s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
s�� ���̴� 8000�����Դϴ�.
n�� 1 �̻�, 25������ �ڿ����Դϴ�.
����� ��
s	n	result
AB	1	BC
z	1	a
a B z	4	e F d
 */

public class Programmers12922 {

	public static void main(String[] args) {
		
		
		int a = 1;
		String b = "z";
		String tmp = solution(b,a);
		System.out.println(tmp);
	}
	
	public static String solution(String str,int n) {
		String rtnStr= "";
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				rtnStr += ' ';
			}else {
				System.out.println(rtnStr);
				rtnStr += ""+ ((char)(str.charAt(i)+n));
			}
		}
		
		return rtnStr;
	}
}
