package array_algorithm;

public class ArrayAlgorithm3 {

	
	/*
	 �迭��Ҹ�  �������� �ٲپ�ƶ�
	 ����
������	 5 10 73 2 -5 42
������ 	 42 -5 2 73 10 5
	
	*/
	public static void main(String[] args) {
		
		int[] arr = {5,10,73,2,-5,42};
		
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
