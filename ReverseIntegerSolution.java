public class ReverseIntegerSolution {
	public int reverse(int x) {
        int reversed, len;
        String s = String.valueOf(x);
        len = s.length();
        for(int i = 0; i < len-1; i++){
            String n = s.substring(s.length()-1);
            s = s.substring(0, s.length()-1);
            if(i == 0)s =n +s.substring(i);
            else s = s.substring(0, i) + n +s.substring(i);
        }
        	
        if(x < 0){
        	s = s.substring(0, s.length()-1);
        	reversed = 0-Integer.valueOf(s);
        }
        else reversed = Integer.valueOf(s);
        return reversed;
    }
}
