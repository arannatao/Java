//题设意思是打印出的图形形如zzzzzz...

import java.util.*;
public class ZigZag {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int numRows = in.nextInt();
		in.close();
		ZigZagSolution solution = new ZigZagSolution();
		String converted = solution.convert(s, numRows);
		System.out.println(converted);
	}
}
