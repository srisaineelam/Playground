import java.util.Scanner;
class Main{
  public static int greatest_of_number(int a,int b,int c)
  {
    int max_ele=0;
    if((a>b)&&(a>c))
      max_ele=a;
      else if((b>a)&&(b>c))
        max_ele=b;
    else if((c>a)&&(c>b))
      max_ele=c;
    else
      max_ele=0;
    return max_ele;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(greatest_of_number(n1,n2,n3));
      
	}
}