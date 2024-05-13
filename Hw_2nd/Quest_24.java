import java.util.Scanner;

public class Quest_24
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("요소 수 : ");
    int arr_count = sc.nextInt();
    
    int[] arr = new int[arr_count];
    for( int i = 0; i < arr_count; i++ )
    {
      arr[i] = (int)(Math.random()*98)+1;
      System.out.printf("x[%d] : %d\n", i, arr[i]);
    }
    
    System.out.print("삭제할 요소의 인덱스 : ");
    int del_number = sc.nextInt();
    
    int[] del_finish_arr = new int[arr.length-1];
    
    del_finish_arr = arrayRmvOf(arr, del_number);
    
    for( int i = 0; i < del_finish_arr.length; i++ )
    {
      System.out.printf("y[%d] : %d\n", i, del_finish_arr[i]);
    }
    
    sc.close();
  }
  
  public static int[] arrayRmvOf( int[] a, int idx )
  {
    int[] del_arr = new int[a.length-1];
    
    for( int i = 0; i < a.length-1; i++ )
    {
      if( i >= idx )
      {
        del_arr[i] = a[i+1];
      }
      else
      {
        del_arr[i] = a[i];
      }
    }
    
    return del_arr;
  }
}
