package study;
import java.util.Arrays;

/*
 * ���ڿ� ������������ ��ġ�ϱ�
 * 
���� ����
���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

���� ����
str�� ���� 1 �̻��� ���ڿ��Դϴ�.
����� ��
s	return
Zbcdefg	gfedcbZ
*/

//���������� ���پ� ����
public class Programmers12917 {
	
	public String solution(String s) {
		String result = "";
		char[] chars = s.toCharArray();

		Arrays.sort(chars);
		result = new StringBuilder(new String(chars)).reverse().toString();

		return result;
	}
}
