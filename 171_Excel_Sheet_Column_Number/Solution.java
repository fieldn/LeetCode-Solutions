public class Solution {
	public static int titleToNumber(String s) {
		int total = 0, value = 1;
		for(int i = s.length() - 1; i >= 0; i--, value *= 26)
			total += (((int)(s.charAt(i)) - 64)*value);
		return total;
	}
}
