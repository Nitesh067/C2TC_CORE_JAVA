import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]) {
		int num,rem,rev=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for palindrome");
		num=sc.nextInt();
		sc.close();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("The reverse of the number is "+rev);
		if(rev==temp)
		{
			System.out.println(temp+" is a palindrome");
		}
		else
		{
			System.out.println(temp+ " is not a palindrome");
		}
		
	}

}
