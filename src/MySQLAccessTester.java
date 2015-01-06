import java.sql.ResultSet;



public class MySQLAccessTester 
{
  public static void main(String[] args) throws Exception 
  {
    MySQLAccess dao = new MySQLAccess();
    
    dao.connectToDataBase();
    dao.getAllUsers();
    dao.createRandomNewUser();
    ResultSet testUser = dao.getUser("tyler", true);
    dao.updateCurrentScore("jason");
    
  }

} 