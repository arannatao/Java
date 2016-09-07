/**
 * 为上传测试，都单独分出一个***Solution类
 * 例子（2-4-3, 5-6-4）刚好比较特殊
 * 需先reverse回来再相加
 * 需考虑链表长度不一样的情况
 * 要考虑相加后位数变长的情况（2-4-3, 1-0-7-9-9, 3-4-0-0-0-1）
 * 和题设的数据结构表达稍有不同
 * @author Arannatao
 */
import java.util.*;

public class AddTwoNumbers{
	public static void main(String[] args){
		LinkedList<Integer> l1 = new LinkedList<>();//链表要分开初始化，这里是Integer不是int
		LinkedList<Integer> l2 = new LinkedList<>();
		LinkedList<Integer> sumList = new LinkedList<>();
		Scanner in = new Scanner(System.in);
		//输入-1，一个list结束（题设两个数都是正整数）
		int node = in.nextInt();
		do{
			l1.add(node);
			node = in.nextInt();
		}while(node != -1);
		node = in.nextInt();
		do{
			l2.add(node);
			node = in.nextInt();
		}while(node != -1);
		in.close();
		
		AddTwoNumbersSolution solution = new AddTwoNumbersSolution();
		sumList = solution.addTwoNumbers(l1, l2);
		System.out.println(sumList);
	}	
}
