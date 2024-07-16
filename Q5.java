
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= Integer.parseInt(args[0]);   //4
		int b= Integer.parseInt(args[1]);   //3
		int c= Integer.parseInt(args[2]);   //9
		
		System.out.println("a= "+a+" b= "+b+" c= "+c);
		
		int x=Math.max(a,b);    //4
		int max=Math.max(x, c);     //9
		
		int y=Math.min(a, b);   //3
		int min=Math.min(y, b);     //3
	
		int mid=a+b+c-max-min;
		
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);

	}

}
