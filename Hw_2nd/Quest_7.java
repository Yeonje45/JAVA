import java.util.Scanner;

public class Quest_7 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
    System.out.print("단수는 : ");
    int n = sc.nextInt();
    
    putChar(n);
    sc.close();
  }
  
  public static void putChar( int n) 
  {
    for( int i = 0; i < n; i++ )
    {
      System.out.print("*");
      for( int j = 0; j < i; j++ )
      {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
