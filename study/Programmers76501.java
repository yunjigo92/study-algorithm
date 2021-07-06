package study;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
���� ���ϱ�
���� ����
� �������� �ֽ��ϴ�. �� �������� ������ ���ʴ�� ���� ���� �迭 absolutes�� �� �������� ��ȣ�� ���ʴ�� ���� �Ҹ��� �迭 signs�� �Ű������� �־����ϴ�.
���� �������� ���� ���Ͽ� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
absolutes�� ���̴� 1 �̻� 1,000 �����Դϴ�.
absolutes�� ��� ���� ���� 1 �̻� 1,000 �����Դϴ�.
signs�� ���̴� absolutes�� ���̿� �����ϴ�.
signs[i] �� ���̸� absolutes[i] �� ���� ������ �������, �׷��� ������ �������� �ǹ��մϴ�.
����� ��
absolutes	signs	result
[4,7,12] [true,false,true]	9
[1,2,3]	[false,false,true]	0
*/
public class Programmers76501 {

    public static void main(String[] args) {

        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        //then 9�� ���;� ��
        int result = solution(absolutes,signs);
        System.out.println(result);
    }

    public static int solution(int[] absolutes,boolean[] signs) {
        int answer = 0;
        for(int i=0; i < absolutes.length; i++){
            answer += absolutes[i] * (signs[i] ? 1 :-1);
        }
        return answer;
    }
}
