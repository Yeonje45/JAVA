import java.util.Scanner;

public class Q_1 
{
 

 public static void main(String[] args)
 {
  int check = 0;

  Scanner scanner = new Scanner(System.in);

  while( check == 0 )
  {
   System.out.print("세 자리의 정숫값 : ");
   int input = scanner.nextInt();

   if( input > 99 && input < 1000 )
   {
    System.out.printf("입력한 값은 %d 입니다.", input);
    scanner.close();
    check = 1;
   }
  }
 }
}