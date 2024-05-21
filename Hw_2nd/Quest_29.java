import java.util.Scanner;

public class Quest_29
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
        
    System.out.print("행렬의 행 수 : ");
    int x = sc.nextInt();  
    System.out.print("행렬의 열 수 : ");
    int y = sc.nextInt();
    
    int[][] arr = new int[x][y];
    int[][] arr_clone = new int[x][y];
    
    for( int i = 0; i < x; i++ )
    {
      for( int j = 0; j < y; j++ )
      {
        arr[i][j] = (int)(Math.random()*8)+1;
        System.out.printf("a[%d][%d] : %d\n", i, j, arr[i][j] );
      }
    }
    
    System.out.print("\n행렬a\n");
    for( int i = 0; i < x; i++ )
    {
      for( int j = 0; j < y; j++ )
      {
        System.out.printf("%2d ", arr[i][j] );
      }
      System.out.println("");
    }
    
    
    arr_clone = arrClone2(arr);
    
    System.out.print("\n행렬a의 복사본\n");
    for( int i = 0; i < x; i++ )
    {
      for( int j = 0; j < y; j++ )
      {
        System.out.printf("%2d ", arr_clone[i][j] );
      }
      System.out.println("");
    }
    
    sc.close();
  }
  
  
  public static int[][] arrClone2( int[][] a )
  {
    int a1 = a.length;
    int b1 = a[0].length;
    int[][] result = new int[a1][b1];
    
    for( int i = 0; i < a1; i++ )
    {
      for( int j = 0; j < b1; j++ )
      {
        result[i][j] = a[i][j];
      }
    }
    
    return result;
  }
}
