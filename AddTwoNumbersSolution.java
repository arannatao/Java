import java.util.*;

public class AddTwoNumbersSolution {	
    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        //先将l1、l2reverse
        int node, len;
        int len1 = l1.size();
        int len2 = l2.size();
        for(int i = 0; i < len1; i++){
        	node = l1.removeLast();
        	l1.add(i, node);
        }
        for(int j = 0; j < len2; j++){
        	node = l2.removeLast();
        	l2.add(j, node);
        }
        
        //l1、l2相加存入sumList，再将sumList反转
        LinkedList<Integer> sumList = new LinkedList<>();
        if(len1 > len2){
        	len = len1;
        	for(int m = 0; m < len1 - len2; m++)l2.add(m, 0);
        }
        else if(len2 > len1){
        	len = len2;
        	for(int n = 0; n < len2 - len1; n++)l1.add(n, 0);
        }
        else  len = len1;//补齐两个数的位数
        
        
        int carry = 0;//进位
        for(int l = len-1; l >= 0; l--){
        	int sum = l1.get(l) + l2.get(l) + carry;
        	if (sum < 10){
        		sumList.add(0, sum);
        		carry = 0;
        	}
        	else{
        		sumList.add(0, sum-10);
        		carry = 1;
        	}
        }
        if(carry == 1)sumList.add(0, 1);
        
        for(int k = 0; k < sumList.size(); k++){
        	node = sumList.removeLast();
        	sumList.add(k, node);
        }
        return sumList;
    }
}