import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String args[]) {
		int n,mult=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till where you want to get the table");
		n=sc.nextInt();
		System.out.println("The Multipliction Table is as follows");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"X"+j+ "=" +(i*j));
			}
			
			
		}
		
		
	}

}
