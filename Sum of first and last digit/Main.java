import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int ld=n1%10;
      while(n1>9)
      {
        n1=n1/10;
      }
int sum=ld+n1;
      System.out.println(sum);
	}
}