import java.util.Scanner;

public class Quest_17 
{
  public static void main( String[] args ) 
  {
    Scanner sc = new Scanner(System.in);
    
    int check_count = 0;
    // int[] arr = { 5, 22, 74, 32, 120, 22 };
    
    System.out.print("요소 수 : ");
    int count = sc.nextInt();
    
    // 배열의 길이 조절
    int[] arr = new int[count];
    
    // 배열에 랜덤값 생성 후 출력
    for( int i = 0; i < count; i++ )
    {
      arr[i] = (int)(Math.random()*99-1)+1;
      System.out.printf("x[%d] : %d\n", i, arr[i]);
    }
    
    // 배열에서 찾고싶은 숫자 입력
    System.out.print("찾는 값 : ");
    int number = sc.nextInt();
    
    // 찾으려는 숫자가 배열에 여러개 있는지 확인
    for( int i = 0; i < arr.length; i++ )
    {
      if( arr[i] == number )
      {
        check_count++;
      }
    }
    
    if( check_count > 1 )
    {
      System.out.println("해당 값의 요소가 여러 개 존재합니다.");
      int min = linearSearch( arr, number );
      int max = linearSearchR(arr, number );
      System.out.printf("가장 앞에 위치한 값은 x[%d]에 있습니다.\n", min);
      System.out.printf("가장 뒤에 위치한 값은 x[%d]에 있습니다.\n", max);
    }
    else
    {
      int min = linearSearch( arr, number );
      System.out.printf("입력한 값이 위치한 곳은 x[%d]에 있습니다.\n", min);
    }
    
    
    sc.close();    
  }
  
  
  public static int linearSearch( int[] a, int key ) 
  {
    int check = 0;
    int n_length = a.length;
    for( int i = 0 ; i < n_length; i++ )
    {
      if(a[i] == key )
      {
        check = i;
        break;
      }
    }
    
    return check;
  }
  
  public static int linearSearchR( int[] a, int key ) 
  {
    int check = 0;
    int n_length = a.length;
    for( int i = 0 ; i < n_length; i++ )
    {
      if(a[i] == key )
      {
        check = i;
      }
    }
    
    return check;
  }
}
