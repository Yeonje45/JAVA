import java.util.Scanner;

public class Q_Quest11
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int[][] arr_a = new int[4][3];
    int[][] arr_b = new int[3][4];
    
    System.out.println("행렬 a의 요소를 입력하세요.");
    for( int i = 0; i < 4; i++ )
    {
      for( int j = 0; j < 3; j++ )
      {
        System.out.printf("a[%d][%d] : ",i, j);
        arr_a[i][j] = sc.nextInt();
      }
    }
    
    System.out.println("행렬 b의 요소를 입력하세요.");
    for( int i = 0; i < 3; i++ )
    {
      for( int j = 0; j < 4; j++ )
      {
        System.out.printf("b[%d][%d] : ",i, j);
        arr_b[i][j] = sc.nextInt();
      }
    }
    
    System.out.println("행렬 a와 b의 곱");
    
    int[][] arr_avr = new int[4][4];

    
    for( int i = 0; i < 4; i++ )
    {
      for( int j = 0; j < 4; j++ )
      {
        for( int x = 0; x < 3; x++ )
        {
        // 저장될 배열 += a배열(가로이동) * b배열(세로이동)
          arr_avr[i][j] += arr_a[i][x] * arr_b[x][j];
        }
      }
    }
    
    // 계산이 저장된 배열 출력
    for( int i = 0; i < 4; i++ )
    {
      for( int j = 0; j < 4; j++ )
      {
        System.out.printf("%d  ", arr_avr[i][j] );
      }
      System.out.printf("\n");
    }
    sc.close();
  }
}
