//Simple calculator using Switch cases//

import java.util.Scanner;
public class Switch {
	public static void main(String args[]) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		for(;;) {
		System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.exit\n");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the values of A and B");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("The sum is="+(a+b));
			break;
		case 2:
			System.out.println("Enter the values of A and B");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("The Subtraction is ="+(a-b));
			break;
		case 3:
			System.out.println("Enter the values of A and B");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("The Multiplication is ="+(a*b));
			break;
		case 4:
			System.out.println("Enter the values of A and B");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("The Division is ="+(a/b));
			break;
		case 5:
			System.out.println("Enter the values of A and B");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("The Modulus is ="+(a%b));
			break;
		case 6:
			System.exit(0);
		default:
			System.out.println("Invalid Selection");
		}
		
	}

}
}