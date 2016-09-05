import java.util.*;

public class Median {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int[] nums1 = new int[m];
		int[] nums2 = new int[n];//先初始化
		for(int i = 0; i < m; i++)nums1[i] = in.nextInt();
		for(int j = 0; j < n; j++)nums2[j] = in.nextInt();
		in.close();
		
		MedianSolution solution = new MedianSolution();
		double median = solution.findMedianSortedArrays(nums1, nums2);
		System.out.println(median);
	}
}
