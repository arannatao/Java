public class LongestSubstringSolution {
	public int lengthOfLongestSubstring(String s) {
		String longest, s1;
		StringBuilder str = new StringBuilder();
		if(s.isEmpty())longest= "";
		else if(s.length() == 1){
			longest= s;
			str.append(s.charAt(0));
		}
		else {
			longest = s.substring(0 ,1);
			str.append(s.charAt(0));
		}
	
		for(int i = 1; i < s.length(); i++){
			if(i == s.length()-1) s1 = s.substring(i);
			else s1 = s.substring(i, i+1);
			int index = str.indexOf(s1);
			if(index != -1){//从原被重复字符的下一个开始，再加上新重复字符
				str.delete(0, index+1);
				str.append(s1);
			}
			else str.append(s1);
			
			if(str.length() > longest.length()){
				longest = str.toString();
			}
		}	
		return longest.length();
	}
}
