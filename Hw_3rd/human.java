public class human
{
  private int count = 0;
  private int MAX = 10;
  private String[] user_name = new String[MAX];
  private int[] user_stature = new int[MAX];
  private int[] user_weight = new int[MAX];
  
  public void insert_human_info( String name, int stature, int weight )
  {
    if( count == 0 )
    {
      user_name[0] = name;
      user_stature[0] = stature;
      user_weight[0] = weight;
      count++;
    }
    else if( count > 0)
    {
      if( count == 10 )
      {
        System.out.println("더이상 입력할수 없습니다.");
      }
      if( count < 10 )
      {
        user_name[count] = name;
        user_stature[count] = stature;
        user_weight[count] = weight;
        count++;
      }
    }
  }
  public void print_human_info()
  {
    if( count == 0 )
    {
      System.out.println("입력된 정보가 없습니다.");
    }
    else
    {
      for( int i = 0; i < count; i++ )
      {
        System.out.println("이름:"+user_name[i]);
        System.out.println("신장:"+user_stature[i]);
        System.out.println("체중:"+user_weight[i]);
      }
    }
  }
}
