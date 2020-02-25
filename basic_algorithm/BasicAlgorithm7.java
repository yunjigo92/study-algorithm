package basic_algorithm;

public class BasicAlgorithm7 {
	
	public static void main(String[] args) {
		System.out.println(solution(3,5));
		System.out.println(solution(1,3));
		System.out.println(solution(6,4));
		System.out.println(solution(1,5));
		System.out.println(solution(1,100));
		System.out.println(solution(2,3));
	}
	
/*	
 * �� �� a,b �� �����Ͽ� �μ� ������ ��� ���� ���Ѱ��� ���Ͽ���
 * ������� 3,5 �ϰ�� 3+4+5 = 12
 * 
*/	
	public static int solution(int num1,int num2) {
		int result=0;
		
		//a�� b�� ��Ұ��谡 ������ ���� �ʱ� ������
		//Math�� �̿��� �ּ� �ִ� ���� ���� �� ���~!���� ���ҿ� �̷��� ���׳����� ���ڴ�.....!
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		for(int i=min; i<=max; i++) {
			result += i;
		}
		return result;
	}

}
