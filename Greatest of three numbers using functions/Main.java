import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = greatest_of_3num(n1, n2);
	    System.out.print(greatest_of_3num(result, n3));
    }
	public static int greatest_of_3num(int num1, int num2)
	{
	    int greatest;
	    if(num1 > num2)
	    {
	        greatest = num1;
	    }
	    else{
	       greatest = num2;
	    }
      return greatest;
	}
  
}