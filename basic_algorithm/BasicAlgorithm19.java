package basic_algorithm;

public class BasicAlgorithm19 {
	
	/*	
	 * ��������!!!!!!!
	 * ���� �̵ �ﰢ�� ���
	 * ���߷��� ����
	 * ���� �̵ �ﰢ���� ����ϴ� �κ��� �޼��� �������� �ۼ��ϼ���!!!
	 * 
	 */
	public static void main(String[] args) {
		
		triangleRU(7);
		
		System.out.println("�������� ���� �ﰢ�� ��~~! ��¥������");
	}
	
	//������ ���� ������ �ﰢ�� �����
	private static void triangleRU(int n) {
		for(int i=0; i<n; i++) {
			for(int k=0;k<i;k++) {
				System.out.printf(" ");
			}
			for(int j=n; j>i; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
