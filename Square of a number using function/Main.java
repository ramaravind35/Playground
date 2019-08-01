import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int res = sq_of_digits(n);
      System.out.println(res);
	} 
  public static int sq_of_digits(int m)
  
   
    {
       int sq = m*m;
  
    return sq;
  }
}