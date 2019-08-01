import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int value = n;
      for(int r = 1; r <= n ; r++)
      {
        
         for(int c = value ; c >= 1 ; c--)
         {
           System.out.print(c);
         }
        System.out.print("\n");
        value--;
      }
	}
}