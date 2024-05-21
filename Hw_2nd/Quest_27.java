import java.lang.reflect.Array;
import java.util.Scanner;

public class Quest_27
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("요소a 의 행 : ");
    int a1 = sc.nextInt();
    System.out.print("요소a 의 열 : ");
    int a2 = sc.nextInt();
    System.out.print("요소b 의 행 : ");
    int b1 = sc.nextInt();
    System.out.print("요소b 의 열 : ");
    int b2 = sc.nextInt();
    
    int[][] arr_a = new int[a1][a2];
    int[][] arr_b = new int[b1][b2];
    int[][] arr_c = new int[99][99];
    
    System.out.printf("\n행렬a\n");
    for( int i = 0; i < a1; i++ )
    {
      for( int j = 0; j < a2; j++ )
      {
        arr_a[i][j] = (int)(Math.random()*8)+1;
        System.out.printf("%2d ", arr_a[i][j] );
      }
      System.out.println("");
    }
    
    System.out.printf("\n행렬b\n");
    for( int i = 0; i < b1; i++ )
    {
      for( int j = 0; j < b2; j++ )
      {
        arr_b[i][j] = (int)(Math.random()*8)+1;
        System.out.printf("%2d ", arr_b[i][j] );
      }
      System.out.println("");
    }
    
    boolean n_return = addMatrix(arr_a, arr_b, arr_c);
    System.out.println(n_return);
    // int x_count = Array.getLength(arr_a);
    // System.out.println(x_count);
    
    sc.close();
  }
  
  public static boolean addMatrix( int[][] x, int[][] y, int[][] z )
  {
    int x_count = Array.getLength(x);
    int y_count = Array.getLength(y);
    // System.out.println(x_count);
    // System.out.println(y_count);
    
    boolean result = false;
    int count = 99;
    int check_count = 0;
    int check_y = 0;
    
    
    if( x_count == y_count)
    {
      count = x_count;
      for( int i = 0; i < x_count; i++ )
      {
        if( x[i].length == y[i].length )
        {
          check_count++;
          check_y = x[i].length;
        }     
      }
    }
    
    if( check_count == count )
    {
      System.out.printf("\n행렬c\n");
      for( int i = 0; i < count; i++ )
      {
        for( int j = 0; j < check_y; j++ )
        {
          z[i][j] = x[i][j] + y[i][j];
          System.out.printf("%2d ", z[i][j]);
        }
        System.out.println("");
      }
      result = true;
    }
    else
    {
      result = false;
    }
        
    return result;
  }
}
