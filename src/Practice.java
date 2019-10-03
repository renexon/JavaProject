
public class Practice {
	public static void main (String[] args) {
		add (11,12);
		sub(10,20);
		divide(5,2);
		multiply(7,8);
		int Addition = add2(11, 11);
		int Substract = sub2(2,1);
		int Multiply = multiply2(4,1888,18);
		double Divide = divide2 (9,2);	
		System.out.println(Addition);
		System.out.println(Substract);
		System.out.println(Multiply);
		System.out.println(Divide);
	}
	public static void add( int x, int y) {
		int z= x+y;
		System.out.println(z);
	}
	public static int add2 (int x, int y) {
		int z = x+y;
		return z;
	}
	public static void sub(int x, int y) {
		int z= x-y;
		System.out.println(z);
	}
	public static int sub2(int x, int y) {
		int z= x-y;
		return z;
	}
	public static void multiply(int x, int y) {
		int z=x*y;
		System.out.println(z);
	}
	public static int multiply2 (int x, int y, int z) {
		int m= x*y*z;
		return m;
	}
	public static void divide(double x,double y) {
		double z = x/y;
		System.out.println(z);	
	}
	public static double divide2(double x, double y) {
		double z=x/y;
		return z;
	}
}
