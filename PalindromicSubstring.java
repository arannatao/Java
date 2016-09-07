/**
 * 结果正确，但运行时间需要优化
 * 该题目有许多经典算法
 */

import java.util.*;
public class PalindromicSubstring {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		PalindromicSubstringSolution solution = new PalindromicSubstringSolution();
		String palSub = solution.longestPalindrome(s);
		System.out.println(palSub);
	}
}
