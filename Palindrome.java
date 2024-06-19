package javaprograms;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String wrd=sc.next();
		
		if(isPalindrome(wrd)) {
			System.out.println("The word is a palindrome.");
		}else {
			System.out.println("The word is not a palindrome.");
		}

	}
	
	//palindrome method
	public static boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
