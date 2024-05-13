import java.util.Scanner;

public class Q_Quest09
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x_count = 0;
    int ny_count = 0;
    int[] y_count = new int[99];
    
    System.out.println("불규칙한 2차원 배열을 생성합니다.");
    System.out.print("행수 : ");
    x_count = sc.nextInt();
    
    for( int i = 0; i < x_count; i++ )
    {
      System.out.printf("%d행째의 열 수 : ", i );
      y_count[i] = sc.nextInt();
      ny_count += y_count[i];
    }
    
    int[][] arr = new int[x_count][ny_count];
    
    System.out.println("각 요소의 값을 입력하세요.");
    
    for( int i = 0; i < x_count; i++ )
    {
      for( int j = 0; j < y_count[i]; j++)
      {
        System.out.printf("c[%d][%d] : ", i, j );
        arr[i][j] = sc.nextInt();
      }
    }
    
    System.out.println("배열c의 각 요솟값은 다음과 같습니다.");
    
    for( int i = 0; i < x_count; i++ )
    {
      for( int j = 0; j < y_count[i]; j++)
      {
        System.out.printf("%2d ", arr[i][j]);
      }
      System.out.printf("\n");
    }
    
    
    sc.close();
  }
}
