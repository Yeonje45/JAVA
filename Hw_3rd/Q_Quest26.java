public class Q_Quest26
{ 
  public static void main(String[] args) 
  {
    myArea myArea = new myArea();
    
    int num1 = 10;
    int num2 = 5;
    double num3 = 2.5;
    double num4 = 4.5;
    
    System.out.printf("가로:%d, 세로:%d 사각형의 넓이는 %d\n", num1, num2, myArea.square(num1, num2));
    System.out.printf("가로:%.1f, 세로:%.1f 사각형의 넓이는 %.2f\n", num3, num4, myArea.square(num3, num4));
  }
}
