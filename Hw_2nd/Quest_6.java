import java.util.Scanner;

public class Quest_6 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("몇 월입니까(1~12) : ");
    int m = sc.nextInt();
    
    printSeason(m);
    sc.close();
  }
  
  public static void printSeason( int m ) 
  {
    if( m == 3 || m == 4 || m == 5)
    {
      System.out.println("해당 월의 계절은 봄입니다.");
    }
    if( m == 6 || m == 7 || m == 8)
    {
      System.out.println("해당 월의 계절은 여름입니다.");
    }
    if( m == 9 || m == 10 || m == 11)
    {
      System.out.println("해당 월의 계절은 가을입니다.");
    }
    if( m == 12 || m == 1 || m == 2)
    {
      System.out.println("해당 월의 계절은 봄입니다.");
    }
  }
}
