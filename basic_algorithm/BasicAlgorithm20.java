package basic_algorithm;

public class BasicAlgorithm20 {
	
	/*	
	 * �����ʾƷ� !!!!!!!
	 * ���� �̵ �ﰢ�� ���
	 * ���߷��� ����
	 * ���� �̵ �ﰢ���� ����ϴ� �κ��� �޼��� �������� �ۼ��ϼ���!!!
	 * 
	 */
	public static void main(String[] args) {
		
		triangleRB(7);
		
		System.out.println("�����ʾƷ� ���� �ﰢ�� ��~~! ��¥������");
	}
	
	//������ �Ʒ��� ������ �ﰢ�� �����
	private static void triangleRB(int n) {
		for(int i=n-1; i>=0; i--) {
			for(int k=0;k<i;k++) {
				System.out.printf(" ");
			}
			for(int j=n-1; j>=i; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
