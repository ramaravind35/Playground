import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int num = in.nextInt();
       int thirdnum=num%10;
      int firstnum=num/100;
      int sum=firstnum+thirdnum;
      System.out.println(sum);
	}
}