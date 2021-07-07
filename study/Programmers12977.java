package study;

/*
�Ҽ� �����
���� ����
�־��� ���� �� 3���� ���� ������ �� �Ҽ��� �Ǵ� ����� ������ ���Ϸ��� �մϴ�. ���ڵ��� ����ִ� �迭 nums�� �Ű������� �־��� ��, nums�� �ִ� ���ڵ� �� ���� �ٸ� 3���� ��� ������ �� �Ҽ��� �Ǵ� ����� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
nums�� ����ִ� ������ ������ 3�� �̻� 50�� �����Դϴ�.
nums�� �� ���Ҵ� 1 �̻� 1,000 ������ �ڿ����̸�, �ߺ��� ���ڰ� ������� �ʽ��ϴ�.
����� ��
nums	result
[1,2,3,4]	1
[1,2,7,6,4]	4

���� �� �𸣴� ���� ��� ������..
�Ҽ��� ���� �� Ȯ������!
*/
public class Programmers12977 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        //then ����� 1 ���;���
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                for(int k=j+2; k< nums.length; k++){
                    int sum = (nums[i] + nums[j] + nums[k]);
                    // �Ҽ� �Ǻ�
                    boolean isPrime = true;
                    for(int a=2; a<sum; a++) {
                        if(sum%a == 0) {
                            isPrime = false;
                        }
                    }
                    if(isPrime){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
