import java.util.*;
import java.util.regex.*;

public class Problem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the array separated by commas, followed by an enter, then the number you would like to sum to, then enter again.");
		String arr = s.nextLine();
		int target = s.nextInt();
		String[] arrSplit = arr.split(",");
		if (arrSplit.length < 2) System.err.print("Error: invalid input");
		int[] nums = new int[arrSplit.length];
		for (int i = 0; i < nums.length; i++) nums[i] = Integer.parseInt(arrSplit[i]);
		int[] answer = Solution.twoSum(nums, target);
		if (answer.length == 2) System.out.println("[" + answer[0] + "," + answer[1] + "]");
		else System.out.println("[0,0]");
	}
}
