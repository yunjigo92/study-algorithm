package basic_algorithm;

public class BasicAlgorithm13 {
	
	/*	
	 * ���� ����!!
	 * �������� �����������ʱ��� ����
	 * �������� ����ÿ�.
	 * ����ǥ �����ϱ�~
	 * ���� ���� ���м��� ���ϴ� ���� �ִ� ����ǥ�� ����ÿ�.
	 * 
	 * ���� �򰥷ȴ� �ٺ���..
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("����ǥ ��������");
		
		System.out.printf("   | ");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n---+-----------------------------");


		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d | ", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}	
		System.out.println("����ǥ ��������!!! ��¥������");
	}
	


}
