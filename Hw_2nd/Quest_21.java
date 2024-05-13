import java.util.Scanner;

public class Quest_21 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("배열 a의 요소 수 : ");
    int arr_a_count = sc.nextInt();
  
    // A 배열 입력받은 길이만큼 생성
    int[] arr_a = new int[arr_a_count];
    
    // A배열 랜덤값 부여
    for( int i = 0; i < arr_a_count; i++ )
    {
      arr_a[i] = (int)(Math.random()*98)+1;
      System.out.printf("a[%d] : %d\n", i, arr_a[i]);
    }
    
    System.out.print("배열 b의 요소 수 : ");
    int arr_b_count = sc.nextInt();
    
    // B 배열 입력받은 길이만큼 생성
    int[] arr_b = new int[arr_b_count];
    
    // B배열 랜덤값 부여
    for ( int i = 0; i < arr_b_count; i++ )
    {
      arr_b[i] = (int)(Math.random()*98)+1;
      System.out.printf("b[%d] : %d\n", i, arr_b[i]);
    }
    
    aryExchng(arr_a, arr_b);
    
    
    sc.close();
  }
  
  public static void aryExchng( int[] a, int[] b )
  {
    int count = (int)(Math.min(a.length, b.length));
    
    for( int i = 0; i < count; i++)
    {
      int temp = 0;
      temp = a[i];
      a[i] = b[i];
      b[i] = temp;
    }
    
    System.out.println("배열 a와 b의 전체 요소를 교환했습니다.");
    
    for( int i = 0; i < a.length; i++ )
    {
      System.out.printf("a[%d] = %d\n", i, a[i]);
    }
    for( int j = 0; j < b.length; j++ )
    {
      System.out.printf("b[%d] = %d\n", j, b[j]);
    }
  }
}
