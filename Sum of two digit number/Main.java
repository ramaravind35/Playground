import java.util.*;
class Main {
	public static void main (String[] args) {
      Scanner in=new Scanner(System.in);
		 int num = in.nextInt();
      int firstnum = num/10;
       int secnum = num%10;
      int sum = firstnum+secnum;// Type your code here
      System.out.println(sum);
	}
}