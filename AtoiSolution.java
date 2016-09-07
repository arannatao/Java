/**
 * 需要考虑到多种特殊情况：
 * 字串为空或者全是空格，返回0；
 * 忽略字符串的前缀空格后，遇到的第一个字符，如果是‘+’或‘－’号，继续往后读；如果是数字，则开始处理数字；如果不是前面的2种，返回0；
 * 处理数字的过程中，如果之后的字符非数字，就停止转换，返回当前值；
 * 在上述处理过程中，如果转换出的值超出了int型的范围，就返回int的最大值或最小值。
 * 
 * 要多阅读对比前辈们的代码，借鉴学习系统的解题思路、经典的算法、细节处理的常用技巧、代码书写的简洁性等。
 * @author Arannatao
 */

public class AtoiSolution {
	public int myAtoi(String str) {
        if (str == null || str.length() < 1)return 0;//注意两者是不同的：str==null中是不存在str.length()的，而str=""是一个长度为0的字符串
        
        str = str.trim();//去除前、后空格
        
        char tag = '+';
    	int i = 0;
    	if (str.charAt(0) == '-') {
    		tag = '-';
    		i++;
    	} 
    	else if (str.charAt(0) == '+')i++;
    	
    	double atoi = 0;//用double存储，进行检查溢出处理后，转化为int输出
    	while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
    		atoi = atoi * 10 + (str.charAt(i) - '0');//这里取出str.charAt(i)转化了为double，如字符'0'转化为48.0，故一定要减去'0'
    		i++;
    	}
    	if (tag == '-')atoi = -atoi;
     
    	//检查是否溢出
    	if (atoi > Integer.MAX_VALUE)return Integer.MAX_VALUE;
    	if (atoi < Integer.MIN_VALUE)return Integer.MIN_VALUE;
     
    	return (int)atoi;   
    }
}
