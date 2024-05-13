import java.util.Scanner;

public class Q_13 
{
  public static void main(String[] args)
  {
    int end_check = 1;
    int first_check = 1;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("계정을 찾습니다.");
    
    do
    {
      do
      {
        System.out.print("몇 월입니까? : ");
        int month = sc.nextInt();
        if( month <= 0 && month >= 13)
        {
          //잘못 입력했을시
          first_check = 1;
        }
        if( month >= 1 && month <= 12)
        {
          //제대로 입력했을시
          if( month == 1){System.out.println("겨울입니다.");}
          if( month == 2){System.out.println("겨울입니다.");}
          if( month == 3){System.out.println("봄입니다.");}
          if( month == 4){System.out.println("봄입니다.");}
          if( month == 5){System.out.println("봄입니다.");}
          if( month == 6){System.out.println("여름입니다.");}
          if( month == 7){System.out.println("여름입니다.");}
          if( month == 8){System.out.println("여름입니다.");}
          if( month == 9){System.out.println("가을입니다.");}
          if( month == 10){System.out.println("가을입니다.");}
          if( month == 11){System.out.println("가을입니다.");}
          if( month == 12){System.out.println("겨울입니다.");}
          first_check = 0;
        }
      }
      while( first_check == 1 );
      System.out.print("다시 하겠습니까? ( 1..yes / 0..No ) : ");
      int check = sc.nextInt();
      if( check == 1)
      {
        end_check = 1;
      }
      if( check == 0)
      {
        end_check = 0;
      }
    }
    while( end_check == 1 );
    
    sc.close();
  }
}
