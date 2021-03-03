import java.util.Scanner;

public class basicList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner add = new Scanner(System.in);
		   
		int[] out = new int[5];
		
		for(int i=0; i<out.length; i++) {
			System.out.print("숫자입력: ");
			out[i]=add.nextInt();
		}
		for(int a:out) {
			System.out.print(a);			
		}
	}

}
