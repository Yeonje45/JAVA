import java.util.Scanner;

public class Quest_19 //19페이지
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("요소 수 : ");
    int count = sc.nextInt();
    // int[] arr = { 1, 3, 4, 7, 9, 11};
    int[] arr = new int[count];
    
    for( int i = 0; i < count; i++ )
    {
      arr[i] = (int)(Math.random()*9-1)+1;
      System.out.printf("a[%d] : %d\n", i, arr[i]);
    }
    
    System.out.print("삭제를 시작할 인덱스 : ");
    int del_index = sc.nextInt();
    System.out.print("삭제 할 요소의 수 : ");
    int del_count = sc.nextInt();
    
    aryRmv(arr, del_index, del_count);
    
    sc.close();
  }
  
  public static void aryRmv( int[] a, int idx, int n )
  {
    //
    for( int i = 0; i < a.length; i++ )
    {
      for( int j = idx; j < n; j++ )
      {
        a[j] = a[j+n];
      }
    }
    
    for( int i = 0; i < a.length; i++ )
    {
      System.out.println(a[i]);
    }
  }
}
