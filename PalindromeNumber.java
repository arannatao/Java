/**
 * �������ǻ�����
 * ���һλΪ0�ķ�0���ֲ��ǻ�����
 * ������ת��Ϊ�ַ�������Ҫ����ķǳ����ռ�
 * �����ַ�ת���ܻ����int.MAX����� --> ��תһ��
 * @author Arannatao
 */

import java.util.Scanner;

public class PalindromeNumber {
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int x  = in.nextInt();
			in.close();
			PalindromeNumberSolution solution = new PalindromeNumberSolution();
			boolean bool = solution.isPalindrome(x);
			System.out.println(bool);
		}
}
