package test;

/*
 * 
 * �ڿ��� ������ �迭�� �����
 * 
���� ����
�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

���� ����
n�� 10,000,000,000������ �ڿ����Դϴ�.
����� ��
n	return
12345	[5,4,3,2,1]

 */

public class Programmers12932 {

	public static void main(String[] args) {
		
		
		int a = 12345;
		int[] tmp = solution(a);
		for(int i =0; i< tmp.length; i++) {
			System.out.println(tmp[i]);
		}
		
	}
	
	public static int[] solution(long a) {
		
		int count = (int)(Math.log10(a)+1);
		int[] arr = new int[count];
		int num = 0;
		
		while(num < count) {
			arr[num]=(int) (a%10);
			a/=10;
			num++;
		}
		
		
		return arr;
	}
}
