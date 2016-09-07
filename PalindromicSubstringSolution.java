public class PalindromicSubstringSolution {
	public String longestPalindrome(String s) {
        String sub1, sub2 = "", palSub, tail;
        int dist1, dist2, dist;
        if(s.length() <= 1)palSub = s;
        else{
        	palSub = s.substring(0, 1);
        	for(int i = 0; i < s.length(); i++){
        		if(i == s.length()-1){
        			sub1 = s.substring(i);
        			sub2 = "";
        		}
        		else {
        			sub1 = s.substring(i, i+1);//回文中心单字符，回文串长度为奇数时
        			if((i == s.length()-2) && (sub1.equals(s.substring(i+1))))sub2 = sub1+sub1;
        			else if (sub1.equals(s.substring(i+1, i+2)))sub2 = sub1+sub1; 
        			else sub2 = "";//回文中心双字符，回文串长度为偶数时(不一定有，一定有奇数)  
        		}
        		
        		//回文串长度为奇数
        		dist1 = i;
        		dist2 = s.length()-i-1;
        		dist = Math.min(dist1, dist2);//取回文中心距字符串首、尾距离较小者
        		int tag = 1, j = 1;
        		while((tag == 1) && (j <= dist)){
        			if(i+j == s.length()-1)tail = s.substring(i+j);
        			else tail = s.substring(i+j, i+j+1);
        			if(s.substring(i-j, i-j+1).equals(tail))sub1 = tail+sub1+tail;
        			else tag = 0;
        			j++;
        		}	
        		
        		//回文串长度为偶数
        		dist1 = i;
        		dist2 = s.length()-i-2;
        		dist = Math.min(dist1, dist2);
        		tag = 1; j = 1;
        		while((!sub2.isEmpty()) && (tag == 1) && (j <= dist)){
        			if(i+j == s.length()-1)tail = s.substring(i+j);
        			else tail = s.substring(i+j+1, i+j+2);
        			if(s.substring(i-j, i-j+1).equals(tail))sub2 = tail+sub2+tail;
        			else tag = 0;
        			j++;
        		}	
        		
        		//比较当前回文串sub与最长回文串pulSub的长度
        		if(sub1.length() > palSub.length())palSub = sub1;	
        		if((sub2.length() > 0) && (sub2.length() > palSub.length()))palSub = sub2;
        		if(palSub.length() == s.length())i = s.length();
        	} 
        }
        return palSub; 
    }
}
