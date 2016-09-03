import java.util.*;

public class TwoSum {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] nums = new int[5];
		for(int i = 0; i < nums.length; i++){
			nums[i] = in.nextInt();
		}
		int target = in.nextInt();
		in.close();
		TwoSumSolution solution = new TwoSumSolution();
		int[] indices = solution.twoSum(nums, target);
		System.out.println(indices[0]+" "+indices[1]);
	}	
}
