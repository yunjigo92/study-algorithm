package test;

/*
 * 
 * ���ڿ� �� p�� y�� ����
 * 
���� ����
�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, 
�ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�.
 ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

���� ��� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.

���ѻ���
���ڿ� s�� ���� : 50 ������ �ڿ���
���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
����� ��
s	answer
pPoooyY	true
Pyy	false
����� �� ����
����� �� #1
'p'�� ���� 2��, 'y'�� ���� 2���� �����Ƿ� true�� return �մϴ�.

����� �� #2
'p'�� ���� 1��, 'y'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�.

 */

public class Programmers12916 {

	public static void main(String[] args) {
		
		
		String a = "YyPp";
		int b = 5;
		boolean tmp = solution(a);
		System.out.println(tmp);
	}
	
	public static boolean solution(String a) {
		int Y=0, P=0;
		
		for(int i=0; i<a.length(); i++) {
			String tmp = ""+a.charAt(i);
			tmp = tmp.toUpperCase();
			if(tmp.equals("P")) {
				P++;
			}else if(tmp.equals("Y")){
				Y++;
			}
		}
		return P == Y;
	}
}
