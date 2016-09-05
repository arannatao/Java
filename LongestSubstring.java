import java.util.*;

public class LongestSubstring {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		LongestSubstringSolution solution = new LongestSubstringSolution();
		int length = solution.lengthOfLongestSubstring(s);
		System.out.print(length);
	}
}
