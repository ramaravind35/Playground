import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
	    int b = in.nextInt();
int	 res = pow_num(a,b);
	            System.out.println(res);
	    
	}
	
	public static int pow_num(int m , int n)
	{
	   int  pow = 1;
	    for(int i = 1; i <= n ; i++)
	    {
	       pow = pow * m;
        }
      return pow;
	}
}