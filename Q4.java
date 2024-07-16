
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=Double.parseDouble(args[0]);
		double t=Math.toRadians(a);   // Radians
		double result=Math.cos(5*t)+Math.sin(7*t);
		System.out.println("a="+a);
		System.out.println("t="+t);
		System.out.println("cos(5t)+sin(7t)="+result);

	}

}
