package basic_algorithm;

public class BasicAlgorithm22 {
	
	/*	
	 * n���� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��Ͻÿ�!!!
	 * ������� 3���̸� �Ʒ��� ���� ���
	 *     1
	 *   2 2 2
	 * 3 3 3 3 3
	 * 
	 */
	public static void main(String[] args) {
		//99�������ϼ�������� 100���� �� ����ó���߰��ؾߴ�
		spira(12);
		
		System.out.println("���ڰ� ������ �Ƕ�̵带 �����ض��� ��~~! ��¥������");
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
				System.out.printf(""+(i+1));
				if(i+1>=10) {
					j++;
				}
			}
			System.out.println();
		}
	}
}
