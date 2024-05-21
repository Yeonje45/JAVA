import java.util.Scanner;

public class Quest_28
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("행렬의 행 수 : ");
    int i_count = sc.nextInt();
    System.out.print("행렬의 열 수 : ");
    int j_count = sc.nextInt();
    
    int[][] arr_a = new int[i_count][j_count];
    int[][] arr_b = new int[i_count][j_count];
    int[][] arr_c = new int[i_count][j_count];
    
    System.out.printf("\n행렬a\n");
    for( int i = 0; i < i_count; i++ )
    {
      for( int j = 0; j < j_count; j++ )
      {
        arr_a[i][j] = (int)(Math.random()*8)+1;
        System.out.printf("%2d ", arr_a[i][j]);
      }
      System.out.println("");
    }
    
    System.out.printf("\n행렬b\n");
    for( int i = 0; i < i_count; i++ )
    {
      for( int j = 0; j < j_count; j++ )
      {
        arr_b[i][j] = (int)(Math.random()*8)+1;
        System.out.printf("%2d ", arr_b[i][j]);
      }
      System.out.println("");
    }
    
    arr_c = addMatrix(arr_a, arr_b);
    
    System.out.printf("\n행렬c\n");
    for( int i = 0; i < i_count; i++ )
    {
      for( int j = 0; j < j_count; j++ )
      {
        System.out.printf("%2d ", arr_c[i][j]);
      }
      System.out.println("");
    }
    
    sc.close();
  }
  
  public static int[][] addMatrix( int[][] x, int[][] y )
  {
    int i_c = x.length;
    int j_c = x[0].length;
    
    // System.out.println(i_c);
    // System.out.println(j_c);
    
    int[][] result = new int[i_c][j_c];
    
    
    for( int i = 0; i < i_c; i++ )
    {
      for( int j = 0; j < j_c; j++ )
      {
        result[i][j] = x[i][j] + y[i][j];
      }
    }
    
    return result;
  }
}