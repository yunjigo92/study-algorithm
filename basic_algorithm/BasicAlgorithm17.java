package basic_algorithm;

public class BasicAlgorithm17 {
	
	/*	
	 * ���� �̵ �ﰢ�� ���
	 * ���߷��� ����
	 * ���� �̵ �ﰢ���� ����ϴ� �κ��� �޼��� �������� �ۼ��ϼ���!!!
	 * 
	 */
	public static void main(String[] args) {
		
		triangleLB(7);
		
		System.out.println("���� �ﰢ�� ��~~! ��¥������");
	}
	
	//���� �Ʒ��� ������ �ﰢ�� �����
	private static void triangleLB(int n) {
		for(int i=0; i<n; i++) {
			System.out.printf("*");
			for(int j=0; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
