import java.util.*;
import java.io.*;

public class WordLadder {
	public static  void compare(String begin, ArrayList<String> lexicon, int length, ArrayList<String> list){
		//char[] beginArray = begin.toCharArray();
		for(int i = 0; i < lexicon.size(); i++){//用for each不行
			String word = lexicon.get(i);
			int same = 0;
			for(int j = 0; j < length; j++){	
				if(word.length() > begin.length()){//??又是文件读入的第一个word前会多加空格且去不掉
					if(word.charAt(j+1) == begin.charAt(j))same++;
				}
				if(word.length() < begin.length()){
					if(word.charAt(j) == begin.charAt(j+1))same++;
				}
				else if(word.charAt(j) == begin.charAt(j))same++;			
			}
			if(same == length-1)list.add(word);
		} 
		
		for(int k = 0; k < list.size(); k++){
			String matched = list.get(k);
			lexicon.remove(matched);//因为只需要统计最少次数，所以不记录次数相同的每种可能情况，且词典中的词一旦使用，便可移除
		}
	}	
	
	public static void main(String[] args)throws FileNotFoundException{
		Scanner in1 = new Scanner(System.in);
		String begin = in1.next();
		String end = in1.next();
		in1.close();
		
		File file = new File("F:\\Java\\Workspace\\WordLadder\\lexicon.txt");
		Scanner in2 = new Scanner(new FileInputStream(file));
		ArrayList<String> lexicon = new ArrayList<>();
		while(in2.hasNext()){
			String word = in2.next();
			if(!word.equals(begin))lexicon.add(word);
		}
		in2.close();//默认开始、结束以及词典里的词的词长相同，都为小写
		
		int count = 1;
		int length = begin.length();
		ArrayList<String> list = new ArrayList<>();
		int len1 = lexicon.size();
		compare(begin, lexicon, length, list);
		count++;
		int len2 = lexicon.size();
		
		while(!(list.contains(end)) && (len1 != len2)){
			ArrayList<String> list1 = new ArrayList<>();
			len1 = lexicon.size();
			for(int i = 0; i < list.size(); i++){//用for each不行
				String word = list.get(i);
				compare(word, lexicon, length, list1);
			}
			list = list1;
			count++;
			len2 = lexicon.size();
		}//找到目标词或词典长度不再变化时，结束循环，进行结果判断
		
		if(list.contains(end))System.out.println(count);
		else System.out.println(-1);
	}
}
