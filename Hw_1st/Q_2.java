import java.util.Scanner;

public class Q_2
{
 public static void main(String[] args) 
 {
  // int형 정수 10 부터 90 사이의 랜덤한 수를 생성
  int check_Num = (int)(Math.random()*90)+10;
  int Select_Num = 0;
  int count = 5;
  Scanner scanner = new Scanner(System.in);

  System.out.printf("테스트 출력입니다. 정답은 : %d 입니다.\n", check_Num);
  System.out.println("10 부터 99 사이의 숫자를 맞추세요.");

  do
  {
   System.out.print("어떤 숫자일까? : ");
   Select_Num = scanner.nextInt();

   if( check_Num > Select_Num )
   {
    System.out.println("더 큰숫자 입니다.");
    count--;
   }
   if( check_Num < Select_Num )
   {
    System.out.println("더 작은숫자 입니다.");
    count--;
   }
   if( check_Num == Select_Num )
   {
    System.out.println("정답입니다.");
   }
   if( count == 0 )
   {
    System.out.printf("숫자를 맞추지 못했습니다. 정답은 : %d 입니다.\n", check_Num);
    Select_Num = check_Num;
   }

  } while( check_Num != Select_Num );
  scanner.close();

  // while( check_Num == 0 )
  // {
  //  System.out.printf(" *테스트출력* 정답은 : %d 입니다.\n", check_Num);
  //  System.out.println("10 부터 99 사이의 숫자를 맞추세요.");
  //  System.out.print("어떤 숫자일까? : ");
  //  int scanner = scanner.nextInt();
  // }
 }
}
