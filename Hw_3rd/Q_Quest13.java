import java.util.Scanner;

public class Q_Quest13
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    boolean roop = false;
    
    String[] dayKorean = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
    String[] dayEnglish = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
    
    System.out.println("요일명을 영어 소문자로 입력하시오.");
    
    while( roop == false )
    {
      boolean check_rf = false;
      int ran = (int)(Math.random()*6);
      
      while( check_rf == false )
      {
        System.out.printf("%s : ", dayKorean[ran] );
        String str = sc.next();
        
        if( str.equals(dayEnglish[ran]) == true )
        {
          check_rf = true;
        }
        else
        {
          System.out.println("틀렸습니다.");
          System.out.print("어떡게 할까요? 1.재입력 / 0.. 정답보기 : ");
          int q = sc.nextInt();
          
          if( q == 0 )
          {
            System.out.println(dayKorean[ran] + "은" + "\""+ dayEnglish[ran] + "\"" + "입니다.");
            check_rf = true;
          }
        }
      }
      System.out.println("다시한번? 1...YES / 0...No : ");
      int qq = sc.nextInt();
      
      if( qq == 0 )
      {
        roop = true;
      }
    }
    
    sc.close();
  }
}
