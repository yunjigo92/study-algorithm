package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



/*
 * 
 * ���ڿ� �� ������� �����ϱ�
 * 
���� ����
���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. 
���� ��� strings�� [sun, bed, car]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� u, e, a�� strings�� �����մϴ�.

���� ����
strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
��� strings�� ������ ���̴� n���� Ů�ϴ�.
�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
����� ��
strings	n	return
[sun, bed, car]	1	[car, bed, sun]
[abce, abcd, cdx]	2	[abcd, abce, cdx]
����� �� ����
����� �� 1
sun, bed, car�� 1��° �ε��� ���� ���� u, e, a �Դϴ�. �̸� �������� strings�� �����ϸ� [car, bed, sun] �Դϴ�.

����� �� 2
abce�� abcd, cdx�� 2��° �ε��� ���� c, c, x�Դϴ�. ���� ���� �Ŀ��� cdx�� ���� �ڿ� ��ġ�մϴ�. abce�� abcd�� ���������� �����ϸ� abcd�� �켱�ϹǷ�, ���� [abcd, abce, cdx] �Դϴ�.
 
 */

public class Programmers12911 {

	public static void main(String[] args) {
		
		
		String[] arr =  {"abce", "abcd", "cdx"};
		int index = 2;
		String[] tmp = solution(arr,index);
		System.out.println(tmp[0]+"  /// "+tmp[1]);
	}
	
	public static String[] solution(String[] strings ,int n) {
		
		
		// n��° index�� �������� ������������ �����ϴ� �񱳽� ����
		Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
            	if((o1.charAt(n) - o2.charAt(n)) == 0) {
            		//�ش� �ε����� ���ڰ� ���� ��� ���������� ��(��ü��)
            		return o1.compareTo(o2);
            	}else {
            		return o1.charAt(n) - o2.charAt(n);
            	}
            }
        };
        //�ش� �������� ����
        ArrayList<String> tmp = new ArrayList<>(Arrays.asList(strings));
        Collections.sort(tmp,comparator);
        
		return tmp.toArray(new String[strings.length]);
	}
}
