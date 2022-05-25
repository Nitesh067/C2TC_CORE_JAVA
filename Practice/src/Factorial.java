import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		int num,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find Factorial");
		num=sc.nextInt();
		System.out.println("The Factorial of " +num+ " is:");
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
