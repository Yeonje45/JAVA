import java.util.Scanner;

public class Q_6
{
 public static void main(String[] args) 
 {
    System.out.print("몇 개를 표시할까요? : ");
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();

    for( int i = 0; i < count; i++)
    {
        if(i%2 == 1)    //나머지1
        {
            System.out.print("+");
        }
        if(i%2 == 0)    //나머지0
        {
            System.out.print("*");
        }
    }
    System.out.printf("\n");

    sc.close();
 }
}
