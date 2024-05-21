import java.util.Scanner;

public class Q_Quest14
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    boolean roop = false;
    int n_random = 99;
    boolean check_ran = false;

    String[] s2 = { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
    
    System.out.printf("해당 월의 영어 단어를 입력하시오.\n");
    System.out.printf("첫 글자는 대문자, 나머지는 소문자로 입력하세요.\n");
    
    while(roop == false )
    {
      check_ran = false;
      boolean check = false;
      
      while( check_ran == false )
      {
        int rd = (int)(Math.random()*11);
        if( n_random == rd )
        {
          rd = (int)(Math.random()*11);
        }
        else
        {
          n_random = rd;
          check_ran = true;
        }
      }
      
      while( check == false )
      {
        System.out.printf("%d월 : ", n_random+1 );
        String s1 = sc.next();
        
        if( s1.equals(s2[n_random]) == true )
        {
          System.out.print("정답입니다. 다시 한번? 1...Yes / 0...No : ");
          int re = sc.nextInt();
          
          if( re == 0 )
          {
            check = true;
            roop = true;
          }
          if( re == 1 )
          {
            check = true;
          }
        }
        else
        {
          System.out.println("틀렸습니다.");
        }
        
      }
    }
    sc.close();
  }
}
