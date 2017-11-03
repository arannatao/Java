/**
 * 负数不是回文数
 * 最后一位为0的非0数字不是回文数
 * 将数字转换为字符串将需要额外的非常量空间
 * 将数字反转可能会大于int.MAX，溢出 --> 反转一半
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
