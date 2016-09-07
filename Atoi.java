import java.util.*;

public class Atoi {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();
		AtoiSolution solution = new AtoiSolution();
		int atoi = solution.myAtoi(str);
		System.out.println(atoi);
	}
}
