
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low=Integer.parseInt(args[0]);  //1
		int high=Integer.parseInt(args[1]); //6
		int r1=low+(int)((high-low)*Math.random());
		int r2=low+(int)((high-low)*Math.random());
		int sum=r1+r2;
		System.out.println("random1 = " +r1);
		System.out.println("random2 = " +r2);
		System.out.println("Sum of r1 and r2 is a =" +sum);

	}

}
