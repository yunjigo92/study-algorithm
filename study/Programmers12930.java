package test;

import java.util.ArrayList;

/*
 * 
 * �̻��� ���� �����
 * 
���� ����
���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�.
 �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
����� ��
s	return
try hello world	TrY HeLlO WoRlD
����� �� ����
try hello world�� �� �ܾ� try, hello, world�� �����Ǿ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ڸ� �빮�ڷ�, 
Ȧ����° ���ڸ� �ҹ��ڷ� �ٲٸ� TrY, HeLlO, WoRlD�Դϴ�. ���� TrY HeLlO WoRlD �� �����մϴ�.

 */

public class Programmers12930 {

	public static void main(String[] args) {
		
		
		int a = 4;
		String b = "try hello world";
		String tmp = solution(b);
		System.out.println(tmp);
	}
	
	public static String  solution(String str) {
		boolean flag = false;
		String rtnStr = "";
		
		for(int i=0; i <str.length();i++) {
			if(str.charAt(i) == ' ') {
				rtnStr += " ";
				flag = false;
				continue;
			}
			String tmp ="";
			if(flag == false) {
				tmp = ""+str.charAt(i);
				rtnStr +=tmp.toUpperCase();
				flag = true;
			}else if(flag == true) {
				tmp = ""+str.charAt(i);
				rtnStr +=tmp.toLowerCase();
				flag = false;
			}
		}
		
		
		return rtnStr;
	}
}
