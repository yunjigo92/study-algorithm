package array_algorithm;

public class ArrayAlgorithm4 {

	
	/*
	 ��� �迭�� ��Ҹ� ���ϴ� �޼ҵ带 �ۼ��϶�!!
	 1+2+3+4+5 �̷�������
	
	*/
	public static void main(String[] args) {
		
		int[] arr = {5,6,10,2,4,1};
		
		
		System.out.println(solution(arr));
		
		
	}
	
	
	// ��� �迭��Ҹ� ���϶�
	// ��~����
	public static int solution(int[] arr) {
		int rtn =0; 
		
		for(int i=0; i < arr.length; i++) {
			rtn += arr[i];
		}
		
		return rtn;
	}
}
