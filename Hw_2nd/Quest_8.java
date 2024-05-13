import java.util.Scanner;

public class Quest_8 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("난수를 생성합니다.");
    System.out.print("하한값 : ");
    int min = sc.nextInt();
    System.out.print("상한값 : ");
    int max = sc.nextInt();
    
    System.out.printf("생성한 난수는 %d 입니다.", random(min, max));
    sc.close();
  }
  
  public static int random( int a, int b ) 
  {
    int num = 0;
    // int형 정수 a 부터 b 사이의 랜덤한 수를 생성
    num = (int)(Math.random()*(b-a))+a;
    return num;
  }
}
