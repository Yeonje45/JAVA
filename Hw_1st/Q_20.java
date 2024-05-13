import java.util.Scanner;

public class Q_20 
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
      num[i] = 0;
      System.out.print("정수 : ");
      num[i] = sc.nextInt();
      
      if( num[i] < 0 )
      {
        System.out.println("음수는 더하지 않습니다.");
        i--;
        count = count - 1;
      }
      else
      {
        n_sum = n_sum + num[i];
        System.out.printf(" %d 입니다.\n", n_sum);
      }
    }
    n_avr = n_sum / count;
    
    System.out.printf("합계는 %d 입니다.\n", n_sum);
    System.out.printf("평균은 %d 입니다.\n", n_avr);
    
    sc.close();
  }
}
