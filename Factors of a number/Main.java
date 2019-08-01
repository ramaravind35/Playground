import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
      int n = 1;
      while(n <= num)
      {
        if(num % n == 0)
        {
          System.out.println(n);
        } 
      n = n + 1;
      }
      
	}
}