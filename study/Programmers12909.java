package study;

/*
 * �ùٸ� ��ȣ
 * 
���� ����
��ȣ�� �ٸ��� ¦�������ٴ� ���� '(' ���ڷ� �������� �ݵ�� ¦��� ')' ���ڷ� ������ �Ѵٴ� ���Դϴ�. ���� ���

()() �Ǵ� (())() �� �ùٸ� ��ȣ�Դϴ�.
)()( �Ǵ� (()( �� �ùٸ��� ���� ��ȣ�Դϴ�.
'(' �Ǵ� ')' �θ� �̷���� ���ڿ� s�� �־����� ��, ���ڿ� s�� �ùٸ� ��ȣ�̸� true�� return �ϰ�, �ùٸ��� ���� ��ȣ�̸� false�� return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
���ڿ� s�� ���� : 100,000 ������ �ڿ���
���ڿ� s�� '(' �Ǵ� ')' �θ� �̷���� �ֽ��ϴ�.
����� ��
s	answer
()()	true
(())()	true
)()(	false
(()(	false
*/

//����������~
public class Programmers12909 {

	boolean solution(String s) {
		int a = 0;
		if (s.charAt(0) == ')')
			return false;
		else if (s.charAt(s.length() - 1) == '(')
			return false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				a++;
			else if (s.charAt(i) == ')')
				a--;

			if (a < 0)
				return false;
		}
		return a == 0 ? true : false;
	}
}
