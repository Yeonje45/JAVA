import java.util.Scanner;

public class Q_Quest25
{
  public static void main(String[] args)
  {
    Inheritance01 math = new Inheritance01();
    Scanner sc = new Scanner(System.in);
    
    int num1 = 20;
    int num2 = 10;   
    
    System.out.printf("두 수의 덧셈 : %d\n", math.addtion(num1, num2));
    System.out.printf("두 수의 뺄셈 : %d\n", math.subtraction(num1, num2));
    System.out.printf("두 수의 곱셈 : %d", math.multiplication(num1, num2));
    
    
    sc.close();
  }
}
