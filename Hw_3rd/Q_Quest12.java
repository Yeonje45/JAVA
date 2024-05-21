import java.util.Scanner;

public class Q_Quest12
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    boolean roop = false;
    int n_random = 0;
    boolean check_ran = false;

    // String[] Quiz = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
    String[] Quiz = { "2", "2", "2", "2", "2", "2", "2" };
    
    System.out.printf("요일명을 영어 소문자로 입력하시오.\n");
    
    while(roop == false )
    {
      check_ran = false;
      boolean check = false;
      while( check_ran == false )
      {
        int rd = (int)(Math.random()*6)+1;
        if( n_random == rd )
        {
          rd = (int)(Math.random()*6)+1;
        }
        else
        {
          n_random = rd;
          check_ran = true;
        }
      }
      
      
      switch (n_random)
      {
        case 1:
        {
          System.out.printf("월요일 : ");
          String qz = sc.next();
          check = qz.equals(Quiz[0]);
          break;
        }
        case 2:
        {
          System.out.printf("화요일 : ");
          String qz = sc.next();
          check = qz.equals(Quiz[1]);
          break;
        }
        case 3:
        {
          System.out.printf("수요일 : ");
          String qz = sc.next();
          check = qz.equals(Quiz[2]);
          break;
        }
        case 4:
        {
          System.out.printf("목요일 : ");
          String qz = sc.next();
          check = qz.equals(Quiz[3]);
          break;
        }
        case 5:
        {
          System.out.printf("금요일 : ");
          String qz = sc.next();
          check = qz.equals(Quiz[4]);
          break;
        }
        case 6:
        {
          System.out.printf("토요일 : ");
          String qz = sc.next();
          check = qz.equals(Quiz[5]);
          break;
        }
        case 7:
        {
          System.out.printf("일요일 : ");
          String qz = sc.next();
          check = qz.equals(Quiz[6]);
          break;
        }
      }
      if( check == true )
      {
        System.out.print("정답입니다. 다시 한번? 1...Yes / 0...No : ");
        int re = sc.nextInt();
        
        if( re == 0 )
        {
          roop = true;
        }

      }
      else
      {
        System.out.print("틀렸습니다. 다시 한번? 1...Yes / 0...No : ");
        int re = sc.nextInt();
        
        if( re == 0 )
        {
          roop = true;
        }
      }
    }
    sc.close();
  }
}
