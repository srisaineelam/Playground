import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
        // Type your code here
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
        for (int i=0;i<arr_size;i++)
        {
arr[i]=in.nextInt();
        }
      int search_element_1=in.nextInt();
      int search_element_2=in.nextInt();
      int element_1_index=-1;
      int element_2_index=-1;
      for(int i=0;i<arr_size;i++)
      {
        if(search_element_1==arr[i])
          element_1_index=i;
      }
      for(int i=0;i<arr_size;i++)
      {
        if(search_element_2==arr[i])
          element_2_index=i;
      }
      System.out.println(element_1_index);
      System.out.println(element_2_index);
      
    }
}