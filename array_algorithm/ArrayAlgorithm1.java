package array_algorithm;

public class ArrayAlgorithm1 {

	public static void main(String[] args) {
		
		int[] hegiht = {172,153,192,140,165};
		
		
		System.out.println(solution(hegiht));
		
	}
	/*
	 
	 �迭�� �ִ밪�� ���ϴ� �޼���
	���޹��� �迭���� �ִ밪�� return �϶�!
	
	*/
	public static int solution(int[] arr) {
		int result = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(result < arr[i]) result = arr[i];
		}
		return result;
	}
}
