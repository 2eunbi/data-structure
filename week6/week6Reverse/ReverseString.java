package week6Reverse;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
	for(int i = str.length()-1; i>=0; i--) //문자열의 각각에 인덱스가 0,1, 로 시작되기 때문에 -1을 안하면 오류 
		System.out.print(str.charAt(i));
	
	scanner.close();
		}

}
