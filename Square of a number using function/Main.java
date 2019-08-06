import java.util.Scanner;
class Main
{
  public static int sqare_of_number(int n)
  {
    int a=n*n;
  return a;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
  
        
      System.out.println(sqare_of_number(n1));
	} 
}