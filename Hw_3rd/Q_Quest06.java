public class Q_Quest06
{
  public static void main(String[] args)
  {
    int[][] arr1 = new int[4][5];
    int[][] arr2 = new int[4][5];
    int[][] arr3 = new int[4][5];
    int count = 11;
    
    for(int i = 0; i < 4; i++ )
    {
      for(int j = 0; j < 5; j++ )
      {
        arr1[i][j] += count;
        count++;
      }
    }
    
    for(int i = 0; i < 4; i++ )
    {
      for(int j = 0; j < 5; j++ )
      {
        arr2[i][j] += count;
        count++;
      }
    }
    for(int i = 0; i < 4; i++ )
    {
      for(int j = 0; j < 5; j++ )
      {
        arr3[i][j] += count;
        count++;
      }
    }
    
    for( int x = 1; x <= 3; x++ )
    {
      System.out.printf("%d번째 2차원 배열\n", x);
      for(int i = 0; i < 4; i++ )
      {
        for( int j = 0; j < 5; j++ )
        {
          if( x == 1)
          {
            System.out.printf("%d ", arr1[i][j]);
          }
          if ( x == 2 )
          {
            System.out.printf("%d ", arr2[i][j]);
          }
          if( x == 3 )
          {
            System.out.printf("%d ", arr3[i][j]);
          }
          
        }
        System.out.printf("\n");
      }
      System.out.printf("\n");
    }
    
    
  }
}
