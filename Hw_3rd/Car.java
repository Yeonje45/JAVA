public class Car
{
  int count = 0;
  int MAX = 10;
  private String[] car_name = new String[MAX];
  private String[] car_number = new String[MAX];
  private int[] car_width = new int[MAX];
  private int[] car_height = new int[MAX];
  private int[] car_length = new int[MAX];
  private double[] car_x = new double[MAX];
  private double[] car_y = new double[MAX];
  private double[] car_fuel_size = new double[MAX];
  private double[] car_fuel_use = new double[MAX];
  private double[] car_remaining_fuel = new double[MAX];
  
  public void insert_Car( String name, String number, int width, int height, int length, double fuel_size, double fuel_use )
  {
      car_name[count] = name;
      car_number[count] = number;
      car_width[count] = width;
      car_height[count] = height;
      car_length[count] = length;
      car_fuel_size[count] = fuel_size;
      car_fuel_use[count] = fuel_use;
      car_x[count] = 0.0;
      car_y[count] = 0.0;
      car_remaining_fuel[count] = 0.0;
      count++;
  }
  
  
  public void move_Car( String name, int move_x, int move_y )
  {
    for( int i = 0; i < count; i++ )
    {
      if( name.equals(car_name[i]) == true )
      {
        double chek_fuel = move_x + move_y;
        if( car_remaining_fuel[i] >= chek_fuel )
        {
          car_x[i] = move_x;
          car_y[i] = move_y;
          double use_fuel = move_x + move_y;
          car_remaining_fuel[i] -= use_fuel;
          System.out.println(car_name[i] + " 이동을 완료했습니다.");
        }
        else
        {
          System.out.println("연료가 부족하여 이동에 실패했습니다.");
        }
      }
    }   
  }
  
  public void print_fuel( String name )
  {
    for( int i = 0; i < count; i++ )
    {
      if( name.equals(car_name[i]) == true )
      {
        System.out.println(car_name[i] + " 남은연료 : " + car_remaining_fuel[i] );
      }
    }  
  }
  
  public void print_xy( String name )
  {
    for( int i = 0; i < count; i++ )
    {
      if( name.equals(car_name[i]) == true )
      {
        System.out.printf("%s 현재 좌표는 x=%.1f y=%.1f 입니다.\n", car_name[i], car_x[i], car_y[i]); 
      }
    }  
  }
  
  public void refueling ( String name, double charge_fuel )
  {
    for( int i = 0; i < count; i++ )
    {
      if( name.equals(car_name[i]) == true )
      {
        car_remaining_fuel[i] += charge_fuel;
        System.out.println(car_name[i] + " 급유를 완료했습니다.");
      }
    } 
  }
  
  public void print_All_Car()
  {
    for( int i = 0; i < count; i++ )
    {
      System.out.print("이름 : " + car_name[i] + "              ");
    }
    System.out.println("");
    
    for( int i = 0; i < count; i++ )
    {
      System.out.print("번호 : "+ car_number[i] + "      ");
    }
    System.out.println("");
    
    for( int i = 0; i < count; i++ )
    {
      System.out.print("전폭 : "+car_width[i]+"mm"+"          ");
    }
    System.out.println("");
    
    for( int i = 0; i < count; i++ )
    {
      System.out.print("전고 : "+car_height[i]+"mm"+"          ");
    }
    System.out.println("");
    
    for( int i = 0; i < count; i++ )
    {
      System.out.print("전장 : "+car_length[i]+"mm"+"          ");
    }
    System.out.println("");
    
    for( int i = 0; i < count; i++ )
    {
      System.out.print("탱크 : "+car_fuel_size[i]+"리터"+"        ");
    }
    System.out.println("");
    
    for( int i = 0; i < count; i++ )
    {
      System.out.print("연비 : "+car_fuel_use[i]+"km/리터"+"     ");
    }
    System.out.println("");
  }
}
