public class Q_Quest27
{
  public static void main(String[] args)
  {
    Student st = new Student();
    
    int id = 20021004;
    String name = "홍길순";
    
    st.insertRecord(id, name);
    st.printInfo();
  }
}
