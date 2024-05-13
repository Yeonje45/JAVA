import java.util.Scanner;

public class Quest_26
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
      System.out.printf("X[%d] = %d\n", i, arr[i] );
    }
    
    System.out.print("삽입할 인덱스 : ");
    int input_index = sc.nextInt();
    System.out.print("삽입할 값 : ");
    int arr_data = sc.nextInt();
    
    int[] result_arr = new int [arr_count+1];
    result_arr = arrayInsOf( arr, input_index, arr_data );
    
    for( int i = 0; i < result_arr.length; i++ )
    {
      System.out.printf("Y[%d] = %d\n", i, result_arr[i] );
    }
    
    sc.close();
  }
  
  public static int[] arrayInsOf( int[] a, int idx, int x )
  {
    int[] temp = new int[a.length+1];
    
    for( int i = 0; i < temp.length; i++ )
    {
      if( i == idx )
      {
        temp[i] = x;
      }
      else if( i > idx )
      {
        temp[i] = a[i-1];
      }
      else
      {
        temp[i] = a[i];
      }
    }
    
    return temp;
  }
}
