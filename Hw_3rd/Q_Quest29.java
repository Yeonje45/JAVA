public class Q_Quest29
{
  public static void main(String[] args)
  {
    human h = new human();
    
    String name1 = "길동";
    int cm1 = 170;
    int weight1 = 60;
    String name2 = "철수";
    int cm2 = 166;
    int weight2 = 72;
    
    h.insert_human_info(name1, cm1, weight1);
    h.insert_human_info(name2, cm2, weight2);
    h.print_human_info();
  }
}
