import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int sum=0;
      while(n1>0)
      {
        int a=n1%10;
      sum=sum+a;
        n1=n1/10;
      }
       System.out.println(sum); 
	}
}