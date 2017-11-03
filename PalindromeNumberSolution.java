public class PalindromeNumberSolution {
	public boolean isPalindrome(int x) {
		//boolean bool = false; 直接return，不用boolean
		if (x < 0 || (x != 0 && x % 10 == 0)) return false;
		int reverse = 0;
		while (x > reverse){
			reverse = x % 10 + reverse * 10; //把后半部分反转
			x = x / 10;
		}
		return (x == reverse || x == reverse / 10);
    }
}
