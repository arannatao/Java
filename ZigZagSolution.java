import java.util.*;

public class ZigZagSolution {
	public String convert(String s, int numRows) {
		String converted = "";
		if ((s.length() == 0) | (numRows <=1) | (s.length() <= numRows))converted = s;
		else{
			//可以求出数组int[numRows][]的列数，然后将字符填入数组，但表述较繁琐
			//if(s.length() % (2*numRows-2) == 0)numColumns = s.length()/(2*numRows-2)*(numRows-1);
			
			ArrayList<ArrayList<String>> array = new ArrayList<>();
			while(s.length() > 0){
				String c;
				if(s.length() - (2*numRows-2) > 0){
					c = s.substring(0, 2*numRows-2);
					s = s.substring(2*numRows-2);
				}
				else{
					c = s;
					s = "";
				}//将字符串按2*numRows-2分段
				
				ArrayList<String> item = new ArrayList<>();//每个item里都有numRows个元素(每个元素0（不足补""）、1、2个字符)
				if(c.length() <= numRows){
					for(int i = 0; i < c.length(); i++)item.add(String.valueOf(c.charAt(i)));//当list[i]还未添加时，不能用set(i,str)
					while(item.size() < numRows)item.add("");	
				}
				else{
					for(int i = 0; i < numRows; i++)
						item.add(String.valueOf(c.charAt(i)));
					for(int j = numRows-2; j > (2*numRows-c.length()-2); j--)
						item.set(j, item.get(j)+String.valueOf(c.charAt(2*numRows-j-2)));
				}
				array.add(item);
			}	
			
			for(int k = 0; k < numRows; k++)
				for(ArrayList<String> item : array)
					converted = converted + item.get(k);		
		}	
		return converted;
    }
}
