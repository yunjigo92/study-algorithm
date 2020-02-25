package basic_algorithm;

public class BasicAlgorithm4 {
	
	public static void main(String[] args) {
		System.out.println(solution(12,4,0));
		System.out.println(solution(11,4,9));
		System.out.println(solution(12,4,99));
		System.out.println(solution(12,4,100));
		System.out.println(solution(12,100,0));
		System.out.println(solution(3,4,200));
	}
	
/*	
 * �������� �߾Ӱ� ���ϱ�
 * ��---------�� ����
*/	
	public static int solution(int a, int b, int c) {
		int tmp = a;
		
		if(tmp < b && tmp < c) {
			return b > c? c:b;
		}
		if(tmp > b && tmp > c) {
			return b > c? b:c;
		}
		return tmp;
	}

}
