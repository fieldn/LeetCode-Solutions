import java.util.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the array in brackets [ ], followed by an enter, then the number you would like to sum to, then enter again.");
		String arr = s.nextLine();
		int target = s.nextInt();
		Pattern p = Pattern.compile("[(-?d+,?)+]");
		Matcher m = p.matcher(arr);
		if (!m.matches()) { System.err.print("Error, bad input");}
		int[] nums = new int[10];
		// parse string into int array
		twoSum(nums, target);
	}

	public static int[] twoSum(int[] nums, int target) {
		int first = 0, second = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i : nums) list.add(i);
		for (int i = 0; i < list.size(); i++, first = i + 1) {
			first = i + 1;
			int index = list.indexOf(target - list.get(i));
			if (index != i && index != -1) {
				second = index + 1;
				break;
			}
		}

		int[] result = new int[2];
		result[0] = (first < second) ? first : second;
		result[1] = (first < second) ? second : first;
		return result;
	}
}
