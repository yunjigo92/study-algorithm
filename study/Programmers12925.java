package study;

import java.util.ArrayList;

/*
 * 
 * ���ڼ��ڼ��ڼ��ڼ��ڼ�?
 * 
���� ����
���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, 
solution�� �ϼ��ϼ���. ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.

���� ����
n�� ���� 10,000������ �ڿ����Դϴ�.
����� ��
n	return
3	���ڼ�
4	

 */

public class Programmers12925 {

	public static void main(String[] args) {
		
		
		int a = 4;
		int b = 5;
		String tmp = solution(b);
		System.out.println(tmp);
	}
	
	public static String  solution(int a) {
		int count = 0;
		int tmp = 0;
		String renStr ="";
		String[] waterMelon = {"��","��"};
		 
		do{	 renStr+= waterMelon[tmp];
			if(tmp == 0) tmp = 1;
			else tmp = 0;
			
			count++;
		}while(count<a);
		
		return renStr;
	}
}
