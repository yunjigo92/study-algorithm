package study;
import java.util.LinkedList;
import java.util.Queue;

/*
���� ����
Ʈ�� ���� �밡 ���� ���������� �� ���� �ٸ��� ������ ������ �ǳʷ� �մϴ�. ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� �˾Ƴ��� �մϴ�. Ʈ���� 1�ʿ� 1��ŭ �����̸�, �ٸ� ���̴� bridge_length�̰� �ٸ��� ���� weight���� �ߵ��ϴ�.
�� Ʈ���� �ٸ��� ������ ������ ���� ���, �� Ʈ���� ���Դ� ������� �ʽ��ϴ�.

���� ���, ���̰� 2�̰� 10kg ���Ը� �ߵ�� �ٸ��� �ֽ��ϴ�. ���԰� [7, 4, 5, 6]kg�� Ʈ���� ������� �ִ� �ð� �ȿ� �ٸ��� �ǳʷ��� ������ ���� �ǳʾ� �մϴ�.

��� �ð�	�ٸ��� ���� Ʈ��	�ٸ��� �ǳʴ� Ʈ��	��� Ʈ��
0	[]	[]	[7,4,5,6]
1~2	[]	[7]	[4,5,6]
3	[7]	[4]	[5,6]
4	[7]	[4,5]	[6]
5	[7,4]	[5]	[6]
6~7	[7,4,5]	[6]	[]
8	[7,4,5,6]	[]	[]
����, ��� Ʈ���� �ٸ��� �������� �ּ� 8�ʰ� �ɸ��ϴ�.

solution �Լ��� �Ű������� �ٸ� ���� bridge_length, �ٸ��� �ߵ� �� �ִ� ���� weight, Ʈ���� ���� truck_weights�� �־����ϴ�. �̶� ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���� ����
bridge_length�� 1 �̻� 10,000 �����Դϴ�.
weight�� 1 �̻� 10,000 �����Դϴ�.
truck_weights�� ���̴� 1 �̻� 10,000 �����Դϴ�.
��� Ʈ���� ���Դ� 1 �̻� weight �����Դϴ�.
����� ��
bridge_length	weight	truck_weights	return
2	10	[7,4,5,6]	8
100	100	[10]	101
100	100	[10,10,10,10,10,10,10,10,10,10]	110
*/

// ������ �������.....
// �ٸ��� ������ Ʈ��.....
public class Programmers42583 {

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int max = 0;
		int truck = 0;
		int time = 0;

		Queue<Integer> que = new LinkedList<Integer>();
		for (int i = 0; i < bridge_length; i++) {
			que.add(0);
		}
		while (true) {
			if (!que.peek().equals(0)) {
				max -= que.peek();
			}
			if (truck < truck_weights.length) {
				if (max + truck_weights[truck] <= weight) {
					que.add(truck_weights[truck]);
					max += truck_weights[truck];
					truck++;
				} else {
					que.add(0);
				}
			}
			que.poll();
			time++;
			if (que.size() == 0) {
				break;
			}
		}
		return time;
	}
}
