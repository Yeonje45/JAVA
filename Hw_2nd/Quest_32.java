import java.util.Scanner;

public class Quest_32
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("1차원 행렬 x의 요소 수 : ");
    int x_count = sc.nextInt();
    
    int[] arr = new int[x_count];
    
    for( int i = 0; i < x_count; i++ )
    {
      System.out.printf("x[%d] : ", i );
      arr[i] = sc.nextInt();
    }
    
    System.out.print("2차원 배열 y의 행 수 : ");
    
    int y_count = sc.nextInt();
    
    int[] count = new int[y_count];
    int max = 0;
    for( int i = 0; i < y_count; i++ )
    {
      System.out.printf("%d행째 열 수 : ", i );
      count[i] = sc.nextInt();
      
      if( max < count[i] )
      {
        max = count[i];
      }
    }
    
    int[][] arry = new int[y_count][max];
    
    for( int i = 0; i < y_count; i++ )
    {
      for( int j = 0; j < count[i]; j++ )
      {
        System.out.printf("y[%d][%d] : ", i, j );
        arry[i][j] = sc.nextInt();
      }
    }
    
    printArray(arr);
    printArray(arry);
    
    sc.close();
  }
  
  
  public static void printArray( int[] a )
  {
    System.out.print("\n1차원 배열x\n");
    for( int i = 0; i < a.length; i++ )
    {
      System.out.printf("%d ", a[i] );
    }
    System.out.println("");
  }
  
  public static void printArray( int[][] a )
  {
    int a1 = a.length;
    System.out.print("\n2차원 배열y\n");
    for( int i = 0; i < a1; i++ )
    {
      for( int j = 0; j < a[i].length; j++ )
      {
        if( a[i][j] != 0 )
        {
          // System.out.printf("%5d ", a[i][j] );
          System.out.print(a[i][j] + "\t");
        }
      }
      System.out.println("");
    }
  }
}
