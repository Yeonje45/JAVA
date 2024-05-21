import java.util.Scanner;

public class Q_Quest30
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Car cr = new Car();
    
    // String name1 = "k3";
    // String number1 = "서울999-99";
    // int width1 = 1660;
    // int height1 = 1500;
    // int length1 = 3640;
    // double fuel_size1 = 40.0;
    // double fuel_use1 = 12.0;
    // cr.insert_Car(name1, number1, width1, height1, length1, fuel_size1, fuel_use1);
    // cr.insert_Car("k5", "서울999-98", 1660, 1525, 3695, 41.0, 12.0);
    
    boolean roop = true;
    while( roop == true )
    {
      System.out.println("0. 차량정보 자동입력");
      System.out.println("1. 위치정보");
      System.out.println("2. 이동하기");
      System.out.println("3. 연료확인");
      System.out.println("4. 급유하기");
      System.out.println("5. 모든사양 표시");
      int num = sc.nextInt();
      
      switch (num) 
      {
        case 0:
        {
          // cr.insert_Car(name1, number1, width1, height1, length1, fuel_size1, fuel_use1);
          cr.insert_Car("k3", "서울999-99", 1660, 1500, 3640, 40.0, 12.0);
          cr.insert_Car("k5", "서울999-98", 1660, 1525, 3695, 41.0, 12.0);
          System.out.println("");
          break;
        }
        case 1:
        {
          System.out.print("위치를 확인할 차량이름을 입력하세요 : ");
          String s = sc.next();
          cr.print_xy(s);
          System.out.println("");
          break;
        }
        case 2:
        {
          System.out.print("이동할 차량 : ");
          String name = sc.next();
          System.out.print("이동할 X = ");
          int x = sc.nextInt();
          System.out.print("이동할 Y = ");
          int y = sc.nextInt();
          cr.move_Car(name, x, y);
          System.out.println("");
          break;
        }
        case 3:
        {
          System.out.print("확인할 차량이름을 입력하세요 : ");
          String s = sc.next();
          cr.print_fuel(s);
          System.out.println("");
          break;
        }
        case 4:
        {
          System.out.print("확인할 차량이름을 입력하세요 : ");
          String s = sc.next();
          System.out.print("얼마나 급유할까요 ? : ");
          double f = sc.nextDouble();
          cr.refueling(s, f);
          System.out.println("");
          break;
        }
        
        case 5:
        {
          cr.print_All_Car();
          System.out.println("");
          break;
        }

      }
    }   
    sc.close();
  }
}
