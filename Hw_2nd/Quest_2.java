import java.util.Scanner;

public class Quest_2 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("정수a : ");
    int a = sc.nextInt();
    System.out.print("정수b : ");
    int b = sc.nextInt();
    System.out.print("정수c : ");
    int c = sc.nextInt();
    
    System.out.printf("최솟값은 %d입니다.", CheckNum(a, b, c));
    
    sc.close();
  }
  
  public static int CheckNum( int a, int b, int c )
  {
    int check = a;
    
    if( check > b )
    {
      check = b;
    }
    if( check > c)
    {
      check = c;
    }
    
    return check;
  }
}
