import java.util.Scanner;

public class recursiveFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    sc.close();
    System.out.println(recursiveFact(input));
	}
	
   public static int recursiveFact(int n) {
	   if(n<=1)
		   return n;
	   else
		   return recursiveFact(n-1)*n;
   }
}
