import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		 int num = in.nextInt();
      int firstnum = num/10;
      int secondlastdigit=firstnum%10;
      System.out.println(secondlastdigit);
	}
}