package basic_algorithm;

public class BasicAlgorithm6 {
	
	public static void main(String[] args) {
		System.out.println(solution(7));
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));
		System.out.println(solution(2));
		System.out.println(solution(1));
	}
	
/*	
 * ���콺�� ���������� ����Ͽ�
 * ���콺�� ���������� ���� ��α׸� ���� �ϵ���!!
 * 1-n ������ ���Ѱ��� ���Ͽ���.
 * 
*/	
	public static int solution(int num) {
		return ((num+1)*num)/2;
	}

}
