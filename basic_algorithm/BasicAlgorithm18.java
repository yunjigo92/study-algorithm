package basic_algorithm;

public class BasicAlgorithm18 {
	
	/*	
	 * ������!!!!!!!
	 * ���� �̵ �ﰢ�� ���
	 * ���߷��� ����
	 * ���� �̵ �ﰢ���� ����ϴ� �κ��� �޼��� �������� �ۼ��ϼ���!!!
	 * 
	 */
	public static void main(String[] args) {
		
		triangleLU(7);
		
		System.out.println("������ ���� �ﰢ�� ��~~! ��¥������");
	}
	
	//���� ���� ������ �ﰢ�� �����
	private static void triangleLU(int n) {
		for(int i=0; i<n; i++) {
			System.out.printf("*");
			for(int j=n-1; j>i; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
