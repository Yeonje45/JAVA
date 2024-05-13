public class Quest_15 
{
  public static void main(String[] args) 
  {
    int x[] = { 22, 5, 11, 32, 120 };
    int count = x.length;
    System.out.printf("요소 수 : %d\n", count );
    
    System.out.printf("모든 요소의 합은 %d 입니다.", sumOf(x));
  }
  
  public static int sumOf( int[] a ) 
  {
    int n_sum = 0;
    
    for( int i = 0; i < a.length; i++ )
    {
      n_sum = n_sum + a[i];
      System.out.printf("x[" + i + "] : %d\n", a[i]);
    }
    
    return n_sum;
  }
}
