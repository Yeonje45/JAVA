import java.util.Scanner;

public class Quest_18 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("요소 수 : ");
    int count = sc.nextInt();
    
    int[] arr = new int[count];
    
    // 배열에 랜덤값 생성
    for( int i = 0; i < count; i++ )
    {
      arr[i] = (int)(Math.random()*99-1)+1;
      System.out.printf("a[%d] : %d\n",i, arr[i]);
    }
    
    // 삭제할 인덱스 입력받기
    System.out.print("삭제할 요소의 인덱스 : ");
    int del_count = sc.nextInt();
    
    // 삭제기능
    aryRmv(arr, del_count);
    
    sc.close();
  }
  
  public static void aryRmv( int[] a, int idx )
  {
    for( int i = 0; i < a.length; i++ )
    {
      if( i >= idx )
      {
        if ( i == a.length-1 )
        {
          a[i] = a[i];
          System.out.printf("a[%d] = %d\n", i, a[i]);
        }
        else
        {
          a[i] = a[i+1];
          System.out.printf("a[%d] = %d\n", i, a[i]);
        }
      }
      else
      {
        System.out.printf("a[%d] = %d\n", i, a[i]);
      }
    }
  }
}
