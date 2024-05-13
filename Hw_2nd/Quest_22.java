import java.util.Scanner;

public class Quest_22
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
  
    System.out.print("요소 수 : ");
    int arr_count = sc.nextInt();
    
    // 입력받은 숫자만큼 배열 생성
    int[] arr = new int[arr_count];
    
    // 배열에 랜덤숫자 적용
    for( int i = 0; i < arr_count; i++ )
    {
      arr[i] = (int)(Math.random()*98)+1;
      System.out.printf("x[%d] : %d\n", i, arr[i] );
    }
    
    
    
    int[] copy_arr = arrayClone(arr);
    
    for( int i = 0; i < copy_arr.length; i++ )
    {
      System.out.printf("y[%d] = %d\n", i, copy_arr[i]);
    }
    
    sc.close();
  }
  
  public static int[] arrayClone( int[] a )
  {
    int[] copy = new int[a.length];
    for( int i = 0; i < a.length; i++ )
    {
      copy[i] = a[i];
    }
    System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
    return copy;
  }
}
