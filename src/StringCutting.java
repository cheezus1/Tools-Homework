import java.util.Scanner;


public class StringCutting {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String inputtedString = input.nextLine();

		int currentMatch[];
		

		System.out.println(inputtedString);

	}
	
	public static int[] findMatch(String s) {
		int maxStartIndex = 0;
		int maxEndIndex = 0;
		for(int i = 0; i < s.length(); i++) {
			int currentStartIndex = i;
			int currentEndIndex = i;
			for(int j = i + 1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j) && (findMatch(s.substring(i + 1, j))) == null) {
					currentEndIndex = j;
				}
			}
			if(currentEndIndex - currentStartIndex > maxEndIndex - maxStartIndex) {
				maxStartIndex = currentStartIndex;
				maxEndIndex = currentEndIndex;
			}
		}
		
		return (maxStartIndex > 0 || maxEndIndex > 0) ? new int[] { maxStartIndex,  maxEndIndex} : null;
	}
	
}