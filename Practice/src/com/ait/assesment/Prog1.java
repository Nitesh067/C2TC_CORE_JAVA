package com.ait.assesment;
class Company{
	int sallary=40000;
}
class employee extends Company{
	int bonous=20000;
	int total(int sallary,int bonous) {
		return sallary+bonous;
	}
}
public class Prog1 {

	public static void main(String[] args) {
		employee e = new employee();
		System.out.println("Bonous ="+" "+e.bonous);
		System.out.println("Sallary="+" "+e.sallary);
		System.out.println("Total Sallary = "+(e.bonous+e.sallary));

	}

}
