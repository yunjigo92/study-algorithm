package array_algorithm;

public class ArrayAlgorithm2 {

	
	/*
	 �迭������ �ٲپ�ƶ�
	{1,2,3,4,5,6,7,8,9} ���
	{9,8,7,6,5,4,3,2,1} �� �ٲٱ�
	
	*/
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for(int a :solution(arr)) {
			System.out.println(a);
		}
	}
	
	
	// ���̸� 2�� ����� ���� �ٲٱ�
	public static int[] solution(int[] arr) {
		int [] rtn = arr.clone();
		
		for(int i=0; i < arr.length/2; i++) {
			
			rtn[(arr.length-1)-i] = arr[i];
			rtn[i] = arr[(arr.length-1)-i];
			
		}
		
		return rtn;
	}
}
