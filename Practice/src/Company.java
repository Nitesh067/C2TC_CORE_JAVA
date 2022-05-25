public class Company{
	String name;
	public static void main(String args[]) {
		Company c1=new Company();
		c1.name="C2TC";
		Company c2=new Company();
		c1=null;
		System.out.println(c2.name);
		new Company();
		Company c3;
		c3.name = "C2TC";
	}
}