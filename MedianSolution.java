public class MedianSolution {
	public double findMedian(int[] nums){
		double median;
		for(int n : nums)System.out.println(n);
		if(nums.length % 2 == 0)median = (nums[nums.length/2 - 1] + nums[nums.length/2])/2.0;//不能写除以2
		else median = nums[(nums.length-1)/2];
		return median;
	}
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median;
		if(nums1.length + nums2.length == 0)median = 0;//如果nums1,nums2均为空，也认为中间值为0
		else if(nums1.length == 0)median = findMedian(nums2);
		else if(nums2.length == 0)median = findMedian(nums1);
	        
		else{
			int length = nums1.length + nums2.length;
			int[] nums3 = new int[length];//题设数组插入不方便，新建nums3
			int i = 0, j = 0, k = 0;
			while((i < nums1.length) && (j < nums2.length)){
				if(nums1[i] <= nums2[j]){
					nums3[k] = nums1[i];
					i++;k++;
				}
				else{
					nums3[k] = nums2[j];
					j++;k++;
				} 		
			}
	        	
			if(k != length){
				if(i == nums1.length){
					while(j < nums2.length){
						nums3[k] = nums2[j];
						j++;k++;
	        		}
	        	}
	        	else{
	        		while(i < nums1.length){
	        			nums3[k] = nums1[i];
	        			i++;k++;
	        		}
	        	}
	        }  	
	        median = findMedian(nums3);
		}       
	    return median;
	 }
}
