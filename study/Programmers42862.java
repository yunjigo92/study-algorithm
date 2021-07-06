package study;

import java.util.HashSet;

/*
ü����
���� ����
���ɽð��� ������ ���, �Ϻ� �л��� ü������ �������߽��ϴ�. ������ ���� ü������ �ִ� �л��� �̵鿡�� ü������ �����ַ� �մϴ�.
�л����� ��ȣ�� ü�� ������ �Ű��� �־�, �ٷ� �չ�ȣ�� �л��̳� �ٷ� �޹�ȣ�� �л����Ը� ü������ ������ �� �ֽ��ϴ�.
���� ���, 4�� �л��� 3�� �л��̳� 5�� �л����Ը� ü������ ������ �� �ֽ��ϴ�.
 ü������ ������ ������ ���� �� ���� ������ ü������ ������ ���� �ִ��� ���� �л��� ü�������� ���� �մϴ�.

��ü �л��� �� n, ü������ �������� �л����� ��ȣ�� ��� �迭 lost, ������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��,
 ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
��ü �л��� ���� 2�� �̻� 30�� �����Դϴ�.
ü������ �������� �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
������ ü������ ������ �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
���� ü������ �ִ� �л��� �ٸ� �л����� ü������ ������ �� �ֽ��ϴ�.
���� ü������ ������ �л��� ü������ ���������� �� �ֽ��ϴ�. �̶� �� �л��� ü������ �ϳ��� �������ߴٰ� �����ϸ�,
���� ü������ �ϳ��̱⿡ �ٸ� �л����Դ� ü������ ������ �� �����ϴ�.
����� ��
n	lost	reserve	return
5	[2, 4]	[1, 3, 5]	5
5	[2, 4]	[3]	        4
3	[3]	    [1]	        2
*/
public class Programmers42862 {

    public static void main(String[] args) {

        int n = 5;
        int[] lost = {2, 3, 4};
        int[] reserve = {3, 4, 5};

        //then 4�� ���;� ��
        int result = solution(n,lost,reserve);
        System.out.println(result);
    }

    public static int solution(int n,int[] lost,int[] reserve) {
        int answer = n - lost.length;
        HashSet<Integer> reserveSet = new HashSet<Integer>();
        //�迭���� �ߺ� ����.
        //������ �����Դµ� ������ �Ҿ���� ���� 0���� ó��
        for(int i=0; i < lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = 0;
                    reserve[j] = 0;
                    break;
                }
            }
        }
        for(int i=0; i < lost.length; i++){
            if(lost[i] != 0){
                reserveSet.add(lost[i]-1);
                reserveSet.add(lost[i]);
                reserveSet.add(lost[i]+1);
            }
        }
        for(int i=0; i<reserve.length; i++){
            if(reserve[i] != 0 && reserveSet.contains(reserve[i])){
                reserveSet.remove(reserve[i]);
                answer++;
            }
        }
        return Math.min(answer,n);
    }
}
