import java.util.Scanner;

public class Q_19pp
{
  public static void main(String[] args) 
  {
    int n_sum = 0;
    int n_avr = 0;
    
    System.out.println("정수를 더합니다.");
    System.out.print("몇 개를 더할까요? : ");
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int num[] = new int[count];
    
    for( int i = 0; i < count; i++)
    {
      System.out.print("정수(0으로 종료) : ");
      num[i] = sc.nextInt();
      
      
      if(num[i] == 0)
      {
        count = i;
      }
      if( n_sum + num[i] > 999)
      {
        System.out.println("합계가 1,000을 넘었습니다.");
        System.out.println("마지막 값은 무시합니다.");
        count = i;
      }
      if( n_sum + num[i] < 1000 )
      {
        n_sum += num[i];
      }
    }
    n_avr = n_sum / count;
    System.out.printf("합계는 %d입니다.\n", n_sum);
    System.out.printf("평균은 %d입니다.\n", n_avr);
    
    sc.close();
  }
}
