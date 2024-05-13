import java.util.Scanner;

public class Quest_1 
{
  public static int singof( int x )
  {
    if( x == 0 )
    {
      x = 0;
    }
    else if ( x < 0 )
    {
      x = -1;
    }
    else if ( x > 0 )
    {
      x = 1;
    }
    
    return x;
  }
    public static void main(String[] args) 
  {
    System.out.printf("정수 x : ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
    int y = singof(x);
    System.out.printf("singOf(x)는 %d 입니다.", y);
    
    sc.close();
  }
  
}
