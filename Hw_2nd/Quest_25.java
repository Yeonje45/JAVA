import java.util.Scanner;

public class Quest_25
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("요소 수 : ");
    int arr_count = sc.nextInt();
    
    int[] arr = new int[arr_count];
    
    for( int i = 0; i < arr.length; i++ )
    {
      arr[i] = (int)(Math.random()*98)+1;
      System.out.printf("X[%d] : %d\n", i, arr[i]);
    }
    
    System.out.print("삭제를 시작할 인덱스 : ");
    int del_start_index = sc.nextInt();
    System.out.print("삭제할 요소의 개수 : ");
    int del_count = sc.nextInt();
    
    int[] del_finish_arr = new int[arr_count-del_count];
    
    del_finish_arr = arrayRmvOf( arr, del_start_index, del_count);
    
    for( int i = 0; i < del_finish_arr.length; i++ )
    {
      System.out.printf("Y[%d] = %d\n", i, del_finish_arr[i]);
    }
    
    sc.close();
  }
  
  public static int[] arrayRmvOf( int[] a, int idx, int n )
  {
    int[] mix_Arr = new int[a.length-n];
    
    
    for( int i = 0; i < a.length - n; i++ )
    {
      if( i >= idx )
      {
        mix_Arr[i] = a[i+n];
      }
      else
      {
        mix_Arr[i] = a[i];
      }
    }
    
    return mix_Arr;
  }
}
