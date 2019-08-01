import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int firstdigit = num/100;
    int secdigit = ((num/10)%10);
    int thirddigit = num%10;
    int reverse = ((thirddigit*100) + (secdigit*10) + (firstdigit));
    System.out.println(reverse);
  }
}