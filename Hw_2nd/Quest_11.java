import java.util.Scanner;

public class Quest_11 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 x를 n비트 시프트 합니다.\n");
    System.out.print("X : ");
    int x = sc.nextInt();
    System.out.print("n : ");
    int n = sc.nextInt();
    
    program(x, n);
    
    sc.close();
  }
  
  public static void program( int x, int n)
  {
    int a=x, b=x, c=x, d=x;
    
    for( int i = 1; i <= n; i++ )
    {
      a = a * 2;
    }
    
    for( int i = 1; i <= n; i++ )
    {
      b = b / 2;
    }
    
    c = c<<3;
    d = d>>3;
    
    System.out.printf("[a] x x (2의 3승) = %d\n", a);
    System.out.printf("[b] x %% (2의 3승) = %d\n", b);
    System.out.printf("[c] x << 3 = %d\n", c);
    System.out.printf("[d] x >> 3 = %d\n", d);
    if( a == c )
    {
      System.out.printf("[a]와 [c]의 값이 일치합니다.\n");
    }
    if( b == d ) 
    {
      System.out.printf("[b]와 [d]의 값이 일치합니다.\n");
    }
    
  }
}
