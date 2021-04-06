package week6Reverse;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		System.out.print(sb.reverse());
	
		scanner.close();
		}

}