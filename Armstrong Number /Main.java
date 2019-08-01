import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
      int sum = 0;
      int temp = num;
      while(num > 0)
      {
        int rem = num % 10;
        int pow = rem * rem * rem;
        sum = pow + sum;
        num = num / 10;
      }
if(temp == sum)
{
  System.out.println("Armstrong Number");
}
      else
      {
  System.out.println("Not a Armstrong Number");

      }
    }
  
}