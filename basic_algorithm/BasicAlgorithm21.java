package basic_algorithm;

public class BasicAlgorithm21 {
	
	/*	
	 * n���� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��Ͻÿ�!!!
	 * ������� 3���̸� �Ʒ��� ���� ���
	 *     *
	 *   * * *
	 * * * * * *
	 * 
	 */
	public static void main(String[] args) {
		
		spira(10);
		
		System.out.println("�Ƕ�̵带 �����ض��� ��~~! ��¥������");
	}
	
	//�Ƕ�̵� ������������!!!!!
	private static void spira(int n) {
		int tmp= n;
		
		for(int i=0; i<n; i++) {
			for(int k=n-i;k>1;k--) {
				tmp=k;
				System.out.printf(" ");
			}
			for(int j=tmp-1; j<=(i*2)+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
