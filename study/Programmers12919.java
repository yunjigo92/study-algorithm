package study;

/*
 * ���￡�� �輭�� ã��
 * 
���� ����
String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

���� ����
seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
Kim�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
����� ��
seoul	return
[Jane, Kim]	�輭���� 1�� �ִ�
*/

//���������� ���پ� ����
public class Programmers12919 {

	public String solution(String[] seoul) {
		int x = 0;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				x = i;
			}
		}
		return "�輭���� " + x + "�� �ִ�";
	}
}
