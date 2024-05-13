import java.util.Scanner;

public class Quest_23
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("요소 수 : ");
    int arr_count = sc.nextInt();
    
    // 입력받은 요소 수 만큼 배열생성
    int[] arr = new int[arr_count];
    
    for( int i = 0; i < arr_count; i++ )
    {
      arr[i] = (int)(Math.random()*8)+1;
      System.out.printf("x[%d] : %d\n", i, arr[i] );
    }
    
    
    int[] return_arr = arraySrchIdx(arr);
    
    for( int i = 0; i < return_arr.length; i++ )
    {
      System.out.printf("%d\n", return_arr[i]);
    }
    
    sc.close();
  }
  
  public static int[] arraySrchIdx ( int[] a )
  {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int n_count = 0;
    System.out.print("탐색할 값 : ");
    int number = sc.nextInt();
    
    // 배열에서 탐색할 값이 몇개 있는지 탐색
    for( int i = 0; i < a.length; i++ )
    {
      if( a[i] == number )
      {
        count++;
        // System.out.println(count);
      }
    }
    
    int[] arr = new int[count];
    
    //
    for( int i = 0; i < a.length; i++ )
    {
      if( a[i] == number )
      {
        arr[n_count] = i;
        n_count++;
      }
    } 
    
    sc.close();
    return arr;
  }
}
