import java.util.*;

public class Solution {

	public static int[] twoSum(int[] nums, int target) {
		int first = 1, second = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i : nums) list.add(i);
		for (int i = 0; i < list.size(); i++, first = i + 1) {
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
