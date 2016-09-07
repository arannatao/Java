//题目测试的设置有问题，函数参数规定为int，拿溢出的数据来测试

import java.util.*;

public class ReverseInteger {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
    	in.close();
        if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
        	int x = (int)num;
        	ReverseIntegerSolution solution = new ReverseIntegerSolution();
        	int reversed = solution.reverse(x);
        	System.out.println(reversed);
        }
        else System.out.println("请输入Integer！");
	}
}
