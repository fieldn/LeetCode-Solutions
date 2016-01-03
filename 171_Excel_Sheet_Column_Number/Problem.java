import java.util.Scanner;
import java.util.regex.*;

public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Column title you would like to convert");
		String s = sc.nextLine();
		int answer = Solution.titleToNumber(s);
		System.out.println(answer);
	}
}
