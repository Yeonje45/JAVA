public class Student 
{
  private int user_Id;
  private String user_Name;
  
  public void insertRecord( int id, String name )
  {
    user_Id = id;
    user_Name = name;
  }
  
  public void printInfo()
  {
    System.out.println("****학생 주소록****");
    System.out.println("아이디 : " + user_Id );
    System.out.println("이름 : " + user_Name );
  }
}
